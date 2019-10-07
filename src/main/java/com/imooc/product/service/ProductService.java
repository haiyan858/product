package com.imooc.product.service;

import com.imooc.product.DTO.CartDTO;
import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-03 23:39
 */
public interface ProductService {

    /**
     * 1.查询所有在架的商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
