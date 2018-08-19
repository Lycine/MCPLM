package org.jozif.mcplm.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.jozif.mcplm.entity.Commodity;
import org.jozif.mcplm.service.impl.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @ApiOperation(value = "添加商品记录", notes = "必填")
    @ResponseBody
    @RequestMapping(value = "/create", produces = {"application/json;charset=UTF-8"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity create(@RequestBody Commodity commodity) {
        String commodityName = commodity.getCommodityName();
        String commodityUnit = commodity.getUnit();
        String commodityCurrency = commodity.getCurrency();
        Double commodityPrice = commodity.getPrice();
        String commodityLocation = commodity.getLocation();
        Map<String, Object> responseEntityBody = new HashMap<String, Object>();

        if (StringUtils.isBlank(commodityName)) {
            //商品名不能为空
            responseEntityBody.put("message", "commodityName cannot be empty");
            return new ResponseEntity<Map<String, Object>>(responseEntityBody, HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(commodityUnit)) {
            //商品单位不能为空
            responseEntityBody.put("message", "unit cannot be empty");
            return new ResponseEntity<Map<String, Object>>(responseEntityBody, HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(commodityCurrency)) {
            //商品单位不能为空
            responseEntityBody.put("message", "currency cannot be empty");
            return new ResponseEntity<Map<String, Object>>(responseEntityBody, HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(commodityCurrency)) {
            //商品单位不能为空
            responseEntityBody.put("message", "currency cannot be empty");
            return new ResponseEntity<Map<String, Object>>(responseEntityBody, HttpStatus.BAD_REQUEST);
        }

        if (commodityPrice < 0) {
            //商品价格不能小于0
            responseEntityBody.put("message", "price cannot be empty");
            return new ResponseEntity<Map<String, Object>>(responseEntityBody, HttpStatus.BAD_REQUEST);
        }

        if (StringUtils.isBlank(commodityLocation)) {
            //商品所在地点不能为空
            responseEntityBody.put("message", "location cannot be empty");
            return new ResponseEntity<Map<String, Object>>(responseEntityBody, HttpStatus.BAD_REQUEST);
        }

        commodityService.add(commodity);

        responseEntityBody.put("message", "add success");

        return new ResponseEntity<Map<String, Object>>(responseEntityBody, HttpStatus.OK);
    }

    @ApiOperation(value = "查询商品记录", notes = "页码和每页大小必填")
    @ResponseBody
    @RequestMapping(value = "/retrieve/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"}, method = {RequestMethod.GET, RequestMethod.POST})
    public Object retrieve(@ApiParam(value = "页码", required = true, defaultValue = "1") @PathVariable("pageNum") int pageNum,
                           @ApiParam(value = "每页大小", required = true, defaultValue = "10") @PathVariable("pageSize") int pageSize) {

        return commodityService.findAll(pageNum, pageSize);
    }
}