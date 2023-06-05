package com.mechanical.goods.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Desktop {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  // Общие поля
  private String series;
  private String manufacturer;
  private float cost;
  private int amountOfGoodsLeftInTheStorage;
  // Дополнительное поле
  private String formFactor;
}
