package org.jozif.mcplm.service.impl;

import com.github.pagehelper.PageHelper;
import org.jozif.mcplm.dao.CommodityMapper;
import org.jozif.mcplm.entity.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service(value = "CommodityService")
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper; //这里会报错，但是并不会影响

    @Override
    public int add(Commodity commodity) {
        if (null == commodity.getGmtReal()) {
            commodity.setGmtReal(new Date());
        }

        commodity.setGmtCreate(new Date());

        return commodityMapper.insertSelective(commodity);
    }

    @Override
    public List<Commodity> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return commodityMapper.selectAll();
    }
}