package com.wsw.pojo;

import lombok.Data;

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
    private Double guidePrice;
    private String produceTime;
    private String carType;
}
