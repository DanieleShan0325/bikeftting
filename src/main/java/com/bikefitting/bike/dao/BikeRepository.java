package com.bikefitting.bike.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bikefitting.bike.vo.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {
    List<Bike> findByBikeSize(int bikeSize);
}