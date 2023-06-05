package com.mechanical.goods.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mechanical.goods.model.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
