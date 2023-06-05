package com.mechanical.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mechanical.goods.model.Drive;
import com.mechanical.goods.repository.DriveRepository;

public class DriveServiceImpl implements DriveService {
  @Autowired
  private DriveRepository driveRepository;

  @Override
  public Drive saveNewDrive(Drive drive) {
    return driveRepository.save(drive);
  }

  @Override
  public List<Drive> getAllDrives() {
    return driveRepository.findAll();
  }

  @Override
  public Drive findById(Long id) {
    return driveRepository.findDriveById(id);
  }

  @Override
  public void deleteDrive(Long id) {
    driveRepository.deleteById(id);
  }

}
