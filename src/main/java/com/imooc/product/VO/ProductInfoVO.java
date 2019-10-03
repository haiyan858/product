package com.imooc.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 00:12
 */
@Data
public class ProductInfoVO {
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}

/*
"id": "123456",
"name": "皮蛋粥",
"price": 1.2,
"description": "好吃的皮蛋粥",
"icon": "http://xxx.com",
*/
