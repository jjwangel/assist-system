package com.bozheng.uf.assistsystem.controller.ufaccount.customer;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bozheng.uf.assistsystem.annotation.VerifyLogin;
import com.bozheng.uf.assistsystem.converter.ufaccount.EntityToVoConverter;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Customer;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.CustomerClass;
import com.bozheng.uf.assistsystem.domain.vo.ResultPageVo;
import com.bozheng.uf.assistsystem.domain.vo.ResultVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.customer.CustomerClassQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.customer.CustomerQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.customer.CustomerClassVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.customer.CustomerVo;
import com.bozheng.uf.assistsystem.service.ufaccount.CustomerClassService;
import com.bozheng.uf.assistsystem.service.ufaccount.CustomerService;
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
 * 客户档案相关
 * @author jianjiawen
 * @date 2021-4-13 12:20
 * @description
 */
@Api(tags = "UFAccount-客户管理")
@RestController
@RequestMapping("/ufaccount")
@Slf4j
public class CustomerController {

    private CustomerService customerService;
    private CustomerClassService customerClassService;

    @Autowired
    private void setCustomerClassService(CustomerClassService customerClassService) {
        this.customerClassService = customerClassService;
    }

    @Autowired
    private void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取客户分类数据")
    @GetMapping("/customerclass")
    public ResultVo<CustomerClassVo> findCustomerClass(CustomerClassQueryVo customerClassQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<CustomerClass> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<CustomerClass> queryWrapper = buildQueryWrapper.buildQw(customerClassQueryVo);

        List<CustomerClass> result = this.customerClassService.list(queryWrapper);

        return ResultVoUtil.success(EntityToVoConverter.toVo(result, CustomerClassVo.class));
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取客户档案列表数据")
    @GetMapping("/customers/page")
    public ResultVo<ResultPageVo<CustomerVo>> findCustomer(CustomerQueryVo customerQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<Customer> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<Customer> queryWrapper = buildQueryWrapper.buildQw(customerQueryVo);
        IPage<Customer> pageInst = new Page<>(customerQueryVo.getPage(), customerQueryVo.getSize());
        this.customerService.page(pageInst, queryWrapper);

        ResultPageVo<CustomerVo> resultPageVo = new ResultPageVo<>();
        resultPageVo.setPageCount(pageInst.getPages());
        resultPageVo.setCurrentPage(pageInst.getCurrent());
        resultPageVo.setSize(pageInst.getSize());
        resultPageVo.setRecordCount(pageInst.getTotal());
        resultPageVo.setRecords(EntityToVoConverter.toVo(pageInst.getRecords(), CustomerVo.class));
        return ResultVoUtil.success(resultPageVo);
    }

}
