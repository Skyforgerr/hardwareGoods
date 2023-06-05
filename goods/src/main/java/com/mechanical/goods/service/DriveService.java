package com.mechanical.goods.service;

import java.util.List;

import com.mechanical.goods.model.Drive;

public interface DriveService {
  public Drive saveNewDrive(Drive drive);

  public List<Drive> getAllDrives();

  public Drive findById(Long id);

  public void deleteDrive(Long id);
}
