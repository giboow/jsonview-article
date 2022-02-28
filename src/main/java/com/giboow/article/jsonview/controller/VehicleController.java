package com.giboow.article.jsonview.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.giboow.article.jsonview.entity.Vehicle;
import com.giboow.article.jsonview.jackson.JsonViews;
import com.giboow.article.jsonview.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicle/list")
    @JsonView(JsonViews.Summary.class)
    public List<Vehicle> listVehicles() {
        return vehicleService.listVehicles();
    }

    @GetMapping("/admin/vehicle/list")
    @JsonView(JsonViews.Admin.class)
    public List<Vehicle> adminListVehicles() {
        return vehicleService.listVehicles();
    }

    @PostMapping("/admin/vehicle")
    @JsonView(JsonViews.Admin.class)
    public Vehicle postAdminVehicle(@RequestBody @JsonView(JsonViews.Create.class) Vehicle vehicle) {
        return vehicleService.createVehicle(vehicle);
    }

    @PutMapping("/admin/vehicle")
    @JsonView(JsonViews.Admin.class)
    public Vehicle putAdminVehicle(@RequestBody @JsonView(JsonViews.Update.class) Vehicle vehicle) {
        return vehicleService.updateVehicle(vehicle);
    }

}
