package com.bozheng.uf.assistsystem.controller.ufaccount.vendor;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bozheng.uf.assistsystem.annotation.VerifyLogin;
import com.bozheng.uf.assistsystem.converter.ufaccount.EntityToVoConverter;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Customer;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.CustomerClass;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Vendor;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.VendorClass;
import com.bozheng.uf.assistsystem.domain.vo.ResultPageVo;
import com.bozheng.uf.assistsystem.domain.vo.ResultVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.customer.CustomerClassQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.customer.CustomerQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.vendor.VendorClassQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.vendor.VendorQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.customer.CustomerClassVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.customer.CustomerVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.vendor.VendorClassVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.vendor.VendorVo;
import com.bozheng.uf.assistsystem.service.ufaccount.CustomerClassService;
import com.bozheng.uf.assistsystem.service.ufaccount.CustomerService;
import com.bozheng.uf.assistsystem.service.ufaccount.VendorClassService;
import com.bozheng.uf.assistsystem.service.ufaccount.VendorService;
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
 * 供应商档案相关
 * @author jianjiawen
 * @date 2021-4-14 12:20
 * @description
 */
@Api(tags = "UFAccount-供应商管理")
@RestController
@RequestMapping("/ufaccount")
@Slf4j
public class VendorController {

    private VendorService vendorService;
    private VendorClassService vendorClassService;

    @Autowired
    private void setVendorClassService(VendorClassService vendorClassService) {
        this.vendorClassService = vendorClassService;
    }

    @Autowired
    private void setVendorService(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取供应商分类数据")
    @GetMapping("/vendorclass")
    public ResultVo<VendorClassVo> findVendorClass(VendorClassQueryVo vendorClassQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<VendorClass> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<VendorClass> queryWrapper = buildQueryWrapper.buildQw(vendorClassQueryVo);

        List<VendorClass> result = this.vendorClassService.list(queryWrapper);

        return ResultVoUtil.success(EntityToVoConverter.toVo(result, VendorClassVo.class));
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取供应商档案列表数据")
    @GetMapping("/vendors/page")
    public ResultVo<ResultPageVo<VendorVo>> findCustomer(VendorQueryVo vendorQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<Vendor> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<Vendor> queryWrapper = buildQueryWrapper.buildQw(vendorQueryVo);
        IPage<Vendor> pageInst = new Page<>(vendorQueryVo.getPage(), vendorQueryVo.getSize());
        this.vendorService.page(pageInst, queryWrapper);

        ResultPageVo<VendorVo> resultPageVo = new ResultPageVo<>();
        resultPageVo.setPageCount(pageInst.getPages());
        resultPageVo.setCurrentPage(pageInst.getCurrent());
        resultPageVo.setSize(pageInst.getSize());
        resultPageVo.setRecordCount(pageInst.getTotal());
        resultPageVo.setRecords(EntityToVoConverter.toVo(pageInst.getRecords(), VendorVo.class));
        return ResultVoUtil.success(resultPageVo);
    }

}
