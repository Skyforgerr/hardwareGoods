package com.mechanical.goods.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DesktopRequest {
  private String series;
  private String manufacturer;
  private float cost;
  private int amountOfGoodsLeftInTheStorage;
  // Дополнительное поле
  private String formFactor;
}
