package com.yeexun.paymentdemo.controller;

import com.yeexun.paymentdemo.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Api("商品管理")
@RestController
@RequestMapping("/api/product")
public class Productcontroller {

    @ApiOperation("测试接口")
    @RequestMapping("/test")
    public R test(){
        return R.ok().data("test","hello");
    }
}
