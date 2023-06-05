package com.mechanical.goods.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mechanical.goods.model.Monitor;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}
