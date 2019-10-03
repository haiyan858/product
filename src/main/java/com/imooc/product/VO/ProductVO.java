package com.imooc.product.VO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 00:08
 */

@Data
public class ProductVO {
    @JsonProperty("name") //既不影响语义，又可以满足json中key的名字一致
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}

/*
"name": "热榜",
"type": 1,
"foods": [
*/
