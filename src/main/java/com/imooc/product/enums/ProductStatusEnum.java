package com.imooc.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 *
 * @Author cuihaiyan
 * @Create_Time 2019-10-03 23:47
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
