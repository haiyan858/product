package com.imooc.product.utils;

import com.imooc.product.VO.ProductVO;
import com.imooc.product.VO.ResultVO;

import java.util.List;

/**
 * 优化一下返回的数据
 *
 * @Author cuihaiyan
 * @Create_Time 2019-10-04 00:48
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
