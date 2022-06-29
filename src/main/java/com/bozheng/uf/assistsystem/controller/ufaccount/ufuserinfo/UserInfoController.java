package com.bozheng.uf.assistsystem.controller.ufaccount.ufuserinfo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bozheng.uf.assistsystem.annotation.VerifyLogin;
import com.bozheng.uf.assistsystem.converter.ufaccount.EntityToVoConverter;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Department;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.DepartmentClass;
import com.bozheng.uf.assistsystem.domain.entity.ufaccount.Person;
import com.bozheng.uf.assistsystem.domain.vo.ResultPageVo;
import com.bozheng.uf.assistsystem.domain.vo.ResultVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.ufuserinfo.DepartmentClassQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.ufuserinfo.DepartmentQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.request.ufaccount.ufuserinfo.PersonQueryVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.ufuserinfo.DepartmentClassVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.ufuserinfo.DepartmentVo;
import com.bozheng.uf.assistsystem.domain.vo.response.ufaccount.ufuserinfo.PersonVo;
import com.bozheng.uf.assistsystem.service.ufaccount.DepartmentClassService;
import com.bozheng.uf.assistsystem.service.ufaccount.DepartmentService;
import com.bozheng.uf.assistsystem.service.ufaccount.PersonService;
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
 * 用户相关信息
 * @author jianjiawen
 * @date 2021-4-17 12:20
 * @description
 */
@Api(tags = "UFAccount-用户管理")
@RestController
@RequestMapping("/ufaccount")
@Slf4j
public class UserInfoController {

    private DepartmentClassService departmentClassService;
    private DepartmentService departmentService;

    private PersonService personService;

    @Autowired
    private void setDepartmentClassService(DepartmentClassService departmentClassService) {
        this.departmentClassService = departmentClassService;
    }

    @Autowired
    private void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Autowired
    private void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取部门层级数据")
    @GetMapping("/departmentclass")
    public ResultVo<DepartmentClassVo> findDepartmentClass(DepartmentClassQueryVo departmentClassQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<DepartmentClass> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<DepartmentClass> queryWrapper = buildQueryWrapper.buildQw(departmentClassQueryVo);

        List<DepartmentClass> result = this.departmentClassService.list(queryWrapper);

        return ResultVoUtil.success(EntityToVoConverter.toVo(result, DepartmentClassVo.class));
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取部门列表数据")
    @GetMapping("/departments/page")
    public ResultVo<ResultPageVo<DepartmentVo>> findDepartment(DepartmentQueryVo departmentQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<Department> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<Department> queryWrapper = buildQueryWrapper.buildQw(departmentQueryVo);
        IPage<Department> pageInst = new Page<>(departmentQueryVo.getPage(), departmentQueryVo.getSize());
        this.departmentService.page(pageInst, queryWrapper);

        ResultPageVo<DepartmentVo> resultPageVo = new ResultPageVo<>();
        resultPageVo.setPageCount(pageInst.getPages());
        resultPageVo.setCurrentPage(pageInst.getCurrent());
        resultPageVo.setSize(pageInst.getSize());
        resultPageVo.setRecordCount(pageInst.getTotal());
        resultPageVo.setRecords(EntityToVoConverter.toVo(pageInst.getRecords(), DepartmentVo.class));
        return ResultVoUtil.success(resultPageVo);
    }

    @VerifyLogin
    @ApiOperationSupport(author = "jianjiawen")
    @ApiResponse(code = 200, message = "返回ResultVo对像")
    @ApiOperation(value = "获取职员档案列表数据")
    @GetMapping("/persons/page")
    public ResultVo<ResultPageVo<PersonVo>> findPerson(PersonQueryVo personQueryVo) throws IllegalAccessException, InstantiationException {

        BuildQueryWrapper<Person> buildQueryWrapper = new BuildQueryWrapper<>();

        QueryWrapper<Person> queryWrapper = buildQueryWrapper.buildQw(personQueryVo);
        IPage<Person> pageInst = new Page<>(personQueryVo.getPage(), personQueryVo.getSize());
        this.personService.page(pageInst, queryWrapper);

        ResultPageVo<PersonVo> resultPageVo = new ResultPageVo<>();
        resultPageVo.setPageCount(pageInst.getPages());
        resultPageVo.setCurrentPage(pageInst.getCurrent());
        resultPageVo.setSize(pageInst.getSize());
        resultPageVo.setRecordCount(pageInst.getTotal());
        resultPageVo.setRecords(EntityToVoConverter.toVo(pageInst.getRecords(), PersonVo.class));
        return ResultVoUtil.success(resultPageVo);
    }

}
