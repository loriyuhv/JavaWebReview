package com.wsw.pojo;

import lombok.Data;

/**
 * @author loriyuhv
 * @version 1.0 2025/8/27 11:09
 */
@Data
public class Car {
    private Long id;
    private String carNum;
    private String brand;
    private Double guidePrice;
    private String produceTime;
    private String carType;
}
