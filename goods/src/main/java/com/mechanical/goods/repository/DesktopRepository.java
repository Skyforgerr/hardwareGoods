package com.mechanical.goods.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mechanical.goods.model.Desktop;

@Repository
public interface DesktopRepository extends JpaRepository<Desktop, Long> {
  Desktop findDesktopById(Long id);
}
