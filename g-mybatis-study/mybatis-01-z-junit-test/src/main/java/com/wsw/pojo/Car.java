package com.wsw.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author loriyuhv
 * @date 2025/8/27 11:09
 * @description
 */
@Data
public class Car {
    private Long id;
    private String carNum;
    private String brand;
    private BigDecimal guidePrice;
    private LocalDate produceTime;
    private String carType;
}
