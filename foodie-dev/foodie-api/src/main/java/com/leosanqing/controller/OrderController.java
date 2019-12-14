package com.leosanqing.controller;

import com.leosanqing.pojo.bo.SubmitOrderBO;
import com.leosanqing.utils.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: leosanqing
 * @Date: 2019-12-14 14:56
 * @Package: com.leosanqing.controller
 * @Description: TODO
 */
@RestController
@RequestMapping("orders")
@Api(value = "订单相关", tags = {"订单的相关接口"})
public class OrderController {


    @PostMapping("create")
    @ApiOperation(value = "创建订单", notes = "创建订单", httpMethod = "POST")
    public JSONResult subCats(
            @ApiParam(name = "submitOrderBO", value = "订单对象", required = true)
            @RequestBody SubmitOrderBO submitOrderBO) {


        // 1.创建订单
        // 2.创建订单以后，移除购物车中已结算的商品
        // 3.像支付中心发送当前订单，用于保存支付中心的订单数据
        System.out.println(submitOrderBO.toString());
        return JSONResult.ok();

    }



}
