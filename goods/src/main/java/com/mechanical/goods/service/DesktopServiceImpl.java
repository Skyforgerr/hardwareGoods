package com.mechanical.goods.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mechanical.goods.model.Desktop;
import com.mechanical.goods.repository.DesktopRepository;

@Service
public class DesktopServiceImpl implements DesktopService {
  @Autowired
  private DesktopRepository desktopRepository;

  @Override
  public Desktop saveNewDesktop(Desktop desktop) {
    return desktopRepository.save(desktop);
  }

  @Override
  public List<Desktop> getAllDesktops() {
    return desktopRepository.findAll();
  }

  @Override
  public Desktop findById(Long id) {
    return desktopRepository.findDesktopById(id);
  }

  @Override
  public void deleteDesktop(Long id) {
    desktopRepository.deleteById(id);
  }

}
