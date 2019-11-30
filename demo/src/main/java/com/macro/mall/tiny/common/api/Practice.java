package com.macro.mall.tiny.common.api;

import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.service.PmsBrandService;
import com.macro.mall.tiny.service.impl.testImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class Practice {

    @Autowired
   // private PmsBrandService pmsBrandService;
    public  void main(String[] args) {
     //   System.out.println(emuPractice.FAILED.getCode());

        System.out.println(emuPractice.values()[1].getCode());
       // int a =  pmsBrandService.createBrand(new PmsBrand());
      //
       // pmsBrandService.getBrand();
    }
}
