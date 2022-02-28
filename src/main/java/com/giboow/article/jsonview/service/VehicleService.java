package com.giboow.article.jsonview.service;

import com.giboow.article.jsonview.entity.Vehicle;
import com.giboow.article.jsonview.repository.VehicleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    /**
     * List all vehicle
     * @return
     */
    public List<Vehicle> listVehicles() {
        return vehicleRepository.findAll();
    }

    /**
     * Save vehicle
     * @param vehicle
     * @return
     */
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    /**
     * Save vehicle
     * @param vehicle
     * @return
     */
    public Vehicle updateVehicle(Vehicle vehicle) {
        Vehicle currentVehicle = vehicleRepository.findById(vehicle.getId()).get();
        BeanUtils.copyProperties(
                vehicle, currentVehicle,
                String.valueOf(Arrays.asList("id", "created_at", "updated_at"))
        );
        return vehicleRepository.save(currentVehicle);
    }

}
