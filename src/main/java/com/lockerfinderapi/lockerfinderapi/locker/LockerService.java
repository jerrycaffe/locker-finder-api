package com.lockerfinderapi.lockerfinderapi.locker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LockerService {

    private final LockerRepository lockerRepository;

    public LockerService(LockerRepository lockerRepository) {
        this.lockerRepository = lockerRepository;
    }

    public List<Locker> getLockers() {
        return lockerRepository.findAll();
    }

    public void addNewLocker(Locker locker) {
        lockerRepository.save(locker);
    }

    public List<Locker> getCityState(String value) {
       return lockerRepository.findCityState(value);
    }
}
