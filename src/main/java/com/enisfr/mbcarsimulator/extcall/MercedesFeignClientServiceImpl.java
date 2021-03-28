package com.enisfr.mbcarsimulator.extcall;

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
import feign.FeignException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MercedesFeignClientServiceImpl implements MercedesFeignClientService {

  private final MercedesFeignClient mercedesFeignClient;
  private static final Logger log = LoggerFactory.getLogger(MercedesFeignClientServiceImpl.class);


/*    public static String getBearerTokenHeader() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest().getHeader("Authorization");
    }*/

  @Override
  public List<BaseVehicle> getAllVehicles() {
    long startMs = System.currentTimeMillis();
    ResponseEntity<List<BaseVehicle>> responseEntity = null;
    try {
      responseEntity = mercedesFeignClient.getAllVehicles();
      log.info("[getAllVehicles()] mercedes api call completed :: duration={}", (System.currentTimeMillis() - startMs));
    } catch (FeignException ex) {
      log.error("[getAllVehicles()] mercedes api call failed :: duration={}", (System.currentTimeMillis() - startMs),
          ex);
      throw new RuntimeException(ex);
    }
    return responseEntity != null ? responseEntity.getBody() : null;
  }

  @Override
  public Vehicle getVehicle(String id) {
    long startMs = System.currentTimeMillis();
    ResponseEntity<Vehicle> responseEntity = null;
    try {
      responseEntity = mercedesFeignClient.getVehicle(id);
      log.info("[getVehicleById()] mercedes api call completed :: duration={}", (System.currentTimeMillis() - startMs));
    } catch (FeignException ex) {
      log.error("[getVehicleById()] mercedes api call failed :: duration={}", (System.currentTimeMillis() - startMs),
          ex);
      throw new RuntimeException(ex);
    }
    return responseEntity != null ? responseEntity.getBody() : null;
  }

  @Override
  public TirePressure getTiresStatus(String id) {
    long startMs = System.currentTimeMillis();
    ResponseEntity<TirePressure> responseEntity = null;
    try {
      responseEntity = mercedesFeignClient.getTiresStatus(id);
      log.info("[getTiresStatus()] mercedes api call completed :: duration={}", (System.currentTimeMillis() - startMs));
    } catch (FeignException ex) {
      log.error("[getTiresStatus()] mercedes api call failed :: duration={}", (System.currentTimeMillis() - startMs),
          ex);
      throw new RuntimeException(ex);
    }
    return responseEntity != null ? responseEntity.getBody() : null;
  }

  @Override
  public Location getVehicleLocation(String id) {
    long startMs = System.currentTimeMillis();
    ResponseEntity<Location> responseEntity = null;
    try {
      responseEntity = mercedesFeignClient.getVehicleLocation(id);
      log.info("[getVehicleLocation()] mercedes api call completed :: duration={}", (System.currentTimeMillis() - startMs));
    } catch (FeignException ex) {
      log.error("[getVehicleLocation()] mercedes api call failed :: duration={}", (System.currentTimeMillis() - startMs),
          ex);
      throw new RuntimeException(ex);
    }
    return responseEntity != null ? responseEntity.getBody() : null;
  }

  @Override
  public Odometer getVehicleOdometer(String id) {
    long startMs = System.currentTimeMillis();
    ResponseEntity<Odometer> responseEntity = null;
    try {
      responseEntity = mercedesFeignClient.getVehicleOdometer(id);
      log.info("[getVehicleOdometer()] mercedes api call completed :: duration={}", (System.currentTimeMillis() - startMs));
    } catch (FeignException ex) {
      log.error("[getVehicleOdometer()] mercedes api call failed :: duration={}", (System.currentTimeMillis() - startMs),
          ex);
      throw new RuntimeException(ex);
    }
    return responseEntity != null ? responseEntity.getBody() : null;
  }

  @Override
  public Fuel getVehicleFuel(String id) {
    long startMs = System.currentTimeMillis();
    ResponseEntity<Fuel> responseEntity = null;
    try {
      responseEntity = mercedesFeignClient.getVehicleFuel(id);
      log.info("[getVehicleFuel()] mercedes api call completed :: duration={}", (System.currentTimeMillis() - startMs));
    } catch (FeignException ex) {
      log.error("[getVehicleFuel()] mercedes api call failed :: duration={}", (System.currentTimeMillis() - startMs),
          ex);
      throw new RuntimeException(ex);
    }
    return responseEntity != null ? responseEntity.getBody() : null;
  }

  @Override
  public Battery getVehicleBattery(String id) {
    long startMs = System.currentTimeMillis();
    ResponseEntity<Battery> responseEntity = null;
    try {
      responseEntity = mercedesFeignClient.getVehicleBattery(id);
      log.info("[getVehicleBattery()] mercedes api call completed :: duration={}", (System.currentTimeMillis() - startMs));
    } catch (FeignException ex) {
      log.error("[getVehicleBattery()] mercedes api call failed :: duration={}", (System.currentTimeMillis() - startMs),
          ex);
      throw new RuntimeException(ex);
    }
    return responseEntity != null ? responseEntity.getBody() : null;
  }

  @Override
  public DoorStatus getVehicleDoorStatus(String id) {
    long startMs = System.currentTimeMillis();
    ResponseEntity<DoorStatus> responseEntity = null;
    try {
      responseEntity = mercedesFeignClient.getVehicleDoorStatus(id);
      log.info("[getVehicleDoorStatus()] mercedes api call completed :: duration={}", (System.currentTimeMillis() - startMs));
    } catch (FeignException ex) {
      log.error("[getVehicleDoorStatus()] mercedes api call failed :: duration={}", (System.currentTimeMillis() - startMs),
          ex);
      throw new RuntimeException(ex);
    }
    return responseEntity != null ? responseEntity.getBody() : null;
  }

  @Override
  public Status changeVehicleDoorStatus(String id, Command command) {
    long startMs = System.currentTimeMillis();
    ResponseEntity<Status> responseEntity = null;
    try {
      responseEntity = mercedesFeignClient.changeVehicleDoorStatus(id, command);
      log.info("[changeVehicleDoorStatus()] mercedes api call completed :: duration={}", (System.currentTimeMillis() - startMs));
    } catch (FeignException ex) {
      log.error("[changeVehicleDoorStatus()] mercedes api call failed :: duration={}", (System.currentTimeMillis() - startMs),
          ex);
      throw new RuntimeException(ex);
    }
    return responseEntity != null ? responseEntity.getBody() : null;
  }


}
