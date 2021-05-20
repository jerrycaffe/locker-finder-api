package com.lockerfinderapi.lockerfinderapi.locker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/locker")
@CrossOrigin(origins = "http://localhost:3000")
public class LockerController {
private final LockerService lockerService;

@Autowired
    public LockerController(LockerService lockerService) {
        this.lockerService = lockerService;
    }

    @GetMapping
    public List<Locker> getLockers(){
        return lockerService.getLockers();
    }

    @PostMapping()
    public void addNewLocker(@RequestBody Locker locker){

    lockerService.addNewLocker(locker);
    }

    @GetMapping(path = "search")
    public List<Locker> findCityState(@RequestParam(required = false) String value){
        return lockerService.getCityState(value+"%");
    }

}
