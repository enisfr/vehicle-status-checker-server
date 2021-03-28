package com.enisfr.mbcarsimulator.controller;

import com.enisfr.mbcarsimulator.model.BaseVehicle;
import com.enisfr.mbcarsimulator.model.Battery;
import com.enisfr.mbcarsimulator.model.Command;
import com.enisfr.mbcarsimulator.model.DoorStatus;
import com.enisfr.mbcarsimulator.model.Fuel;
import com.enisfr.mbcarsimulator.model.Location;
import com.enisfr.mbcarsimulator.model.Odometer;
import com.enisfr.mbcarsimulator.model.Status;
import com.enisfr.mbcarsimulator.model.TirePressure;
import com.enisfr.mbcarsimulator.model.Vehicle;
import com.enisfr.mbcarsimulator.service.VehicleService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    @ApiOperation(value = "Get list of all vehicles")
    @GetMapping
    public List<BaseVehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @ApiOperation(value = "Get vehicle with given id")
    @GetMapping("/{id}")
    public Vehicle getVehicle(@PathVariable String id) {
        return vehicleService.getVehicle(id);
    }

    @ApiOperation(value = "Get tire status of the vehicle with given id")
    @GetMapping("/{id}/tires")
    public TirePressure getTiresStatus(@PathVariable String id) {
        return vehicleService.getTiresStatus(id);
    }

    @ApiOperation(value = "Get location of the vehicle with given id")
    @GetMapping("/{id}/location")
    public Location getVehicleLocation(@PathVariable String id) {
        return vehicleService.getVehicleLocation(id);
    }

    @ApiOperation(value = "Get odometer of the vehicle with given id")
    @GetMapping("/{id}/odometer")
    public Odometer getVehicleOdometer(@PathVariable String id) {
        return vehicleService.getVehicleOdometer(id);
    }

    @ApiOperation(value = "Get fuel of the vehicle with given id")
    @GetMapping("/{id}/fuel")
    public Fuel getVehicleFuel(@PathVariable String id) {
        return vehicleService.getVehicleFuel(id);
    }

    @ApiOperation(value = "Get state of charge of the vehicle with given id")
    @GetMapping("/{id}/stateofcharge")
    public Battery getVehicleBattery(@PathVariable String id) {
        return vehicleService.getVehicleBattery(id);
    }

    @ApiOperation(value = "Get door status of the vehicle with given id")
    @GetMapping("/{id}/doors")
    public DoorStatus getVehicleDoorStatus(@PathVariable String id) {
        return vehicleService.getVehicleDoorStatus(id);
    }

    @ApiOperation(value = "Change door status as locked or unlocked of the vehicle with given id")
    @PostMapping("/{id}/doors")
    public Status changeVehicleDoorStatus(@PathVariable String id, @RequestBody Command command) {
        return vehicleService.changeVehicleDoorStatus(id, command);
    }


}
