package com.bikefitting.bike.service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bikefitting.bike.dao.BikeRepository;
import com.bikefitting.bike.vo.Bike;

@Service
public class BikeServiceImpl implements BikeService {

    private final BikeRepository bikeRepository;

    public BikeServiceImpl(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @Override
    public List<String> getRecommendedBikeModels(int riderHeight) {
        int bikeSize;

        if (riderHeight > 170) {
            bikeSize = 3;
        } else if (riderHeight > 160) {
            bikeSize = 2;
        } else {
            bikeSize = 1;
        }

        List<Bike> bikes = bikeRepository.findByBikeSize(bikeSize);
        List<String> bikeModels = bikes.stream()
                .map(Bike::getBikeName)
                .collect(Collectors.toList());

        return bikeModels;
    }




}