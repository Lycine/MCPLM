package org.jozif.mcplm.service.impl;

import org.jozif.mcplm.entity.Commodity;

import java.util.List;

public interface CommodityService {

    int add(Commodity commodity);

    List<Commodity> findAll(int pageNum, int pageSize);
}
