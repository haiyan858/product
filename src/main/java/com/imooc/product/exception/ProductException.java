package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-07 21:01
 */
public class ProductException extends RuntimeException {
    private Integer code;

    public ProductException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
