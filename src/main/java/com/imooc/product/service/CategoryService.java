package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

/**
 * 3.查询类目
 *
 * @Author cuihaiyan
 * @Create_Time 2019-10-03 23:57
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
