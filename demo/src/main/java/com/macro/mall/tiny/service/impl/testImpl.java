package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.service.PmsBrandService;

import java.util.List;

public class testImpl  implements PmsBrandService {
    @Override
    public List<PmsBrand> listAllBrand() {
        return null
                ;
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return 999;
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        return 0;
    }

    @Override
    public int deleteBrand(Long id) {
        return 0;
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return null;
    }
}
