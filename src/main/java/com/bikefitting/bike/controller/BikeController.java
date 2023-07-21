package com.bikefitting.bike.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikefitting.bike.vo.Bike;

@Controller
@RequestMapping("/bike")
@RestController
public class BikeController {

	 private List<Bike> bikeData = Arrays.asList(
	            new Bike(1, "TCR", "Giant", 1),
	            new Bike(2, "TCR", "Giant", 2),
	            new Bike(3, "TCR", "Giant", 3),
	            new Bike(4, "Domane slr6", "Trek", 1),
	            new Bike(5, "Domane slr6", "Trek", 2),
	            new Bike(6, "Domane slr6", "Trek", 3),
	            new Bike(7, "Mardone slr9", "Trek", 1),
	            new Bike(8, "Mardone slr9", "Trek", 2),
	            new Bike(9, "Mardone slr9", "Trek", 3),
	            new Bike(10, "Teammachine SLR", "BMC", 1),
	            new Bike(11, "Teammachine SLR", "BMC", 2),
	            new Bike(12, "Teammachine SLR", "BMC", 3)
	    );

	 
	    @GetMapping("/recommendedBikeModels/{riderHeight}")
	    public List<Bike> getRecommendedBikeModels(@PathVariable int riderHeight) {
	        List<Bike> recommendedBikes = new ArrayList<>();

	        if (riderHeight > 170) {
	            recommendedBikes = getBikesBySize(3);
	        } else if (riderHeight > 160) {
	            recommendedBikes = getBikesBySize(2);
	        } else {
	            recommendedBikes = getBikesBySize(1);
	        }

	        return recommendedBikes;
	    }

	    // Helper method to get bikes by size
	    private List<Bike> getBikesBySize(int bikeSize) {
	        List<Bike> bikes = new ArrayList<>();
	        for (Bike bike : bikeData) {
	            if (bike.getBikeSize() == bikeSize) {
	                bikes.add(bike);
	            }
	        }
	        return bikes;
	    }
	}