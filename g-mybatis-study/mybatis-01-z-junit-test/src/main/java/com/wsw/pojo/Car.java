package com.wsw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/27 11:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Long id;
    private String carNum;
    private String brand;
    private BigDecimal guidePrice;
    private LocalDate produceTime;
    private String carType;
}
