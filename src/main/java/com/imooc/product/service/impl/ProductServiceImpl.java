package com.imooc.product.service.impl;

import com.imooc.product.DTO.CartDTO;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.enums.ProductStatusEnum;
import com.imooc.product.enums.ResultEnum;
import com.imooc.product.exception.ProductException;
import com.imooc.product.repository.ProductInfoRepository;
import com.imooc.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @Author cuihaiyan
 * @Create_Time 2019-10-03 23:46
 */

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoRepository productInfoRepository;
    @Override
    public List<ProductInfo> findUpAll() {
        List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
        return productInfoList;
    }

    @Override
    public List<ProductInfo> findList(List<String> productIdList) {
        List<ProductInfo> productInfoList = productInfoRepository.findByProductIdIn(productIdList);
        return productInfoList;
    }

    @Override
    @Transactional //对List操作，需要加事务
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO: cartDTOList){
            Optional<ProductInfo> productInfoOptional = productInfoRepository.findById(cartDTO.getProductId());

            //判断商品是否存在
            if (!productInfoOptional.isPresent()){
                //不存在商品，抛出异常
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            ProductInfo productInfo = productInfoOptional.get();
            //库存是否足够
            Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
            if (result<0){
                throw  new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            productInfo.setProductStock(result);//扣库存
            productInfoRepository.save(productInfo);//保存

        }
    }
}
