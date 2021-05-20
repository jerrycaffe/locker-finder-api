package com.lockerfinderapi.lockerfinderapi.locker;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LockerRepository extends JpaRepository<Locker, Long> {
    @Query("SELECT l FROM locker l WHERE l.city LIKE ?1 OR l.state LIKE ?1")
    List<Locker> findCityState(String value);
}
