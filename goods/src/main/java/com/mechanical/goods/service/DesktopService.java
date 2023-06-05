package com.mechanical.goods.service;

import java.util.List;
import java.util.Optional;

import com.mechanical.goods.model.Desktop;

public interface DesktopService {
  public Desktop saveNewDesktop(Desktop desktop);

  public List<Desktop> getAllDesktops();

  public Desktop findById(Long id);

  public void deleteDesktop(Long id);

}
