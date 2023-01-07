package com.fadhel.latihanteori.spring.core.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicB {

  private CyclicC cyclicC;
}
