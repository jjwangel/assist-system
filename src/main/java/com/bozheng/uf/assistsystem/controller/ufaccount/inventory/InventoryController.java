package com.bozheng.uf.assistsystem.controller.ufaccount.inventory;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bozheng.uf.assistsystem.annotation.VerifyLogin;
import com.bozheng.uf.assistsystem.converter.ufaccount.DtoToVoConverter;
import com.bozheng.uf.assistsystem.converter.ufaccount.EntityToVoConverter;
import com.bozheng.uf.assistsystem.domain.dto.ufaccount.InventoryDto;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.InventoryClass;
import com.bozheng.uf.assistsystem.domain.vo.ResultPageVo;
import com.bozheng.uf.assistsystem.domain.vo.ResultVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.inventory.InventoryClassQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.inventory.InventoryQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.inventory.InventoryClassVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.inventory.InventoryVo;
import com.bozheng.uf.assistsystem.service.ufaccount.InventoryClassService;
import com.bozheng.uf.assistsystem.service.ufaccount.InventoryService;
import com.bozheng.uf.assistsystem.utils.BuildQueryWrapper;
import com.bozheng.uf.assistsystem.utils.ResultVoUtil;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 存货档案相关
 * @author jianjiawen
 * @date 2021-2-27 15:40
 */
@Api(tags = "UFAccount-存货管理")
@RestController
@RequestMapping("/ufaccount")
@Slf4j
public class InventoryController {

    private InventoryService inventoryService;
    private InventoryClassService inventoryClassService;

    @Autowired
    private void setInventoryService(InventoryService inventoryService) {
        this.inventoryService=inventoryService;
    }

    @Autowired
    private void setInventoryClassService(InventoryClassService inventoryClassService) {
        this.inventoryClassService = inventoryClassService;
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取存货分类数据")
    @GetMapping("/inventoryclass")
    public ResultVo<InventoryClassVo> findInventoryClass(InventoryClassQueryVo inventoryClassQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<InventoryClass> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<InventoryClass> queryWrapper = buildQueryWrapper.buildQw(inventoryClassQueryVo);

        List<InventoryClass> result = this.inventoryClassService.list(queryWrapper);

        return ResultVoUtil.success(EntityToVoConverter.toVo(result, InventoryClassVo.class));
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取存货档案列表数据")
    @GetMapping("/inventorys/page")
    public ResultVo<ResultPageVo<InventoryVo>> findInventory(InventoryQueryVo inventoryQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<InventoryDto> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<InventoryDto> queryWrapper = buildQueryWrapper.buildQw(inventoryQueryVo);

        IPage<InventoryDto> pageInst = this.inventoryService.findInventoryByPage(inventoryQueryVo.getPage(), inventoryQueryVo.getSize(), queryWrapper);
        ResultPageVo<InventoryVo> resultPageVo = new ResultPageVo<>();
        resultPageVo.setPageCount(pageInst.getPages());
        resultPageVo.setCurrentPage(pageInst.getCurrent());
        resultPageVo.setSize(pageInst.getSize());
        resultPageVo.setRecordCount(pageInst.getTotal());
        resultPageVo.setRecords(DtoToVoConverter.toVo(pageInst.getRecords(), InventoryVo.class));
        return ResultVoUtil.success(resultPageVo);
    }



}
