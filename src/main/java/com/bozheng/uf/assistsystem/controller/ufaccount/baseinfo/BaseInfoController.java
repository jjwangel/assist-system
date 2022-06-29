package com.bozheng.uf.assistsystem.controller.ufaccount.baseinfo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bozheng.uf.assistsystem.annotation.VerifyLogin;
import com.bozheng.uf.assistsystem.converter.ufaccount.EntityToVoConverter;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.DistrictClass;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Warehouse;
import com.bozheng.uf.assistsystem.domain.vo.ResultVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.baseinfo.DistrictClassQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.baseinfo.WarehouseQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.baseinfo.DistrictClassVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.baseinfo.WarehouseVo;
import com.bozheng.uf.assistsystem.service.ufaccount.DistrictClassService;
import com.bozheng.uf.assistsystem.service.ufaccount.WarehouseService;
import com.bozheng.uf.assistsystem.utils.BuildQueryWrapper;
import com.bozheng.uf.assistsystem.utils.ResultVoUtil;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 其他基础档案相关
 * @author jianjiawen
 * @date 2021-4-15 12:20
 * @description
 */
@Api(tags = "UFAccount-其他基础档案")
@RestController
@RequestMapping("/ufaccount")
@Slf4j
public class BaseInfoController {

    private DistrictClassService districtClassService;
    private WarehouseService warehouseService;


    @Autowired
    private void setDistrictClass(DistrictClassService districtClassService) {
        this.districtClassService = districtClassService;
    }

    @Autowired
    private void setWarehouseService(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取地区分类数据")
    @GetMapping("/districtclass")
    public ResultVo<DistrictClassVo> findCustomerClass(DistrictClassQueryVo districtClassQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<DistrictClass> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<DistrictClass> queryWrapper = buildQueryWrapper.buildQw(districtClassQueryVo);

        List<DistrictClass> result = this.districtClassService.list(queryWrapper);

        return ResultVoUtil.success(EntityToVoConverter.toVo(result, DistrictClassVo.class));
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取仓库数据")
    @GetMapping("/warehouse")
    public ResultVo<WarehouseVo> findWarehouse(WarehouseQueryVo warehouseQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<Warehouse> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<Warehouse> queryWrapper = buildQueryWrapper.buildQw(warehouseQueryVo);

        List<Warehouse> result = this.warehouseService.list(queryWrapper);

        return ResultVoUtil.success(EntityToVoConverter.toVo(result, WarehouseVo.class));
    }


}
