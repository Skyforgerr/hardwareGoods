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
import com.mechanical.goods.request.DesktopRequest;
import com.mechanical.goods.service.DesktopService;

@RestController
@RequestMapping("/api/v1/desktop")
public class DesktopController {
  @Autowired
  private DesktopService desktopService;

  @GetMapping("/list")
  public List<Desktop> viewAllDesktops() {
    return desktopService.getAllDesktops();
  }

  @PostMapping("/add")
  public String addDesktop(@RequestBody DesktopRequest desktopRequest) {
    Desktop desktop = Desktop.builder()
        .series(desktopRequest.getSeries())
        .manufacturer(desktopRequest.getManufacturer())
        .cost(desktopRequest.getCost())
        .amountOfGoodsLeftInTheStorage(desktopRequest.getAmountOfGoodsLeftInTheStorage())
        .formFactor(desktopRequest.getFormFactor())
        .build();
    desktopService.saveNewDesktop(desktop);
    return "New desktop has been added";
  }

  @DeleteMapping("/delete")
  public String deleteDesktop(@RequestParam("id") Long id) {
    desktopService.deleteDesktop(id);
    return "Desktop " + id + " has been deleted";
  }

  @PutMapping("/alter")
  public String alterDesktop(@RequestParam("id") Long id, @RequestBody DesktopRequest desktopRequest) {
    Desktop desktop = desktopService.findById(id);
    if (desktop == null) {
      return "Desktop with such id not found";
    } else {
      desktop = Desktop.builder()
          .id(id)
          .series(desktopRequest.getSeries())
          .manufacturer(desktopRequest.getManufacturer())
          .cost(desktopRequest.getCost())
          .amountOfGoodsLeftInTheStorage(desktopRequest.getAmountOfGoodsLeftInTheStorage())
          .formFactor(desktopRequest.getFormFactor())
          .build();
      desktopService.saveNewDesktop(desktop);
      return "Desktop " + id + " has been updated";

    }
  }

}
