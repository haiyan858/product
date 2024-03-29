package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-03 23:20
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    /**
     * 1.查询所有在架的商品
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
