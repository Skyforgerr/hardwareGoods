package com.mechanical.goods.controller;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mechanical.goods.model.Desktop;
import com.mechanical.goods.model.Drive;
import com.mechanical.goods.request.DesktopRequest;
import com.mechanical.goods.request.DriveRequest;
import com.mechanical.goods.service.DesktopService;
import com.mechanical.goods.service.DriveService;

@RestController
@RequestMapping("/api/v1/drive")
public class DriveController {
  @Autowired
  private DriveService driveService;

  @GetMapping("/list")
  public List<Drive> viewAllDrives() {
    return driveService.getAllDrives();
  }

  @PostMapping("/add")
  public String addDrive(@RequestBody DriveRequest driveRequest) {
    Drive drive = Drive.builder()
        .series(driveRequest.getSeries())
        .manufacturer(driveRequest.getManufacturer())
        .cost(driveRequest.getCost())
        .amountOfGoodsLeftInTheStorage(driveRequest.getAmountOfGoodsLeftInTheStorage())
        .value(driveRequest.getValue())
        .build();
    driveService.saveNewDrive(drive);
    return "New drive has been added";
  }

  @DeleteMapping("/delete")
  public String deleteDrive(@RequestParam("id") Long id) {
    driveService.deleteDrive(id);
    return "Drive " + id + " has been deleted";
  }

  @PutMapping("/alter")
  public String alterDesktop(@RequestParam("id") Long id, @RequestBody DriveRequest driveRequest) {
    Drive drive = driveService.findById(id);
    if (drive == null) {
      return "Drive with such id not found";
    } else {
      drive = Drive.builder()
          .id(id)
          .series(driveRequest.getSeries())
          .manufacturer(driveRequest.getManufacturer())
          .cost(driveRequest.getCost())
          .amountOfGoodsLeftInTheStorage(driveRequest.getAmountOfGoodsLeftInTheStorage())
          .value(driveRequest.getValue())
          .build();
      driveService.saveNewDrive(drive);
      return "Drive " + id + " has been updated";

    }
  }

}
