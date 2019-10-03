package com.imooc.product.service.impl;

import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.repository.ProductCategoryRepository;
import com.imooc.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.ldap.PagedResultsControl;
import java.util.List;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-03 23:59
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        List<ProductCategory> productCategoryList = productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
        return productCategoryList;
    }
}
