package com.imooc.product.enums;

import lombok.Getter;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-07 21:03
 */
@Getter
public enum  ResultEnum {

    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_ERROR(2,"库存不足"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
