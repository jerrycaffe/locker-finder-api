package com.lockerfinderapi.lockerfinderapi.locker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/locker")
public class LockerController {

    @GetMapping
    public List<Locker> getLockers(){
        return List.of(new Locker("A lovely fresh locker", "ipaja", "lagos", "Nigeria", 1));
    }
}
