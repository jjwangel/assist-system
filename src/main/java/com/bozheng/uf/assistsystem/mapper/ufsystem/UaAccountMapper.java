package com.bozheng.uf.assistsystem.mapper.ufsystem;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.bozheng.uf.assistsystem.domain.entity.ufsystem.UaAccount;
import com.bozheng.uf.assistsystem.domain.dto.ufsystem.UfAccountDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-16 10:48
 */
public interface UaAccountMapper extends BaseMapper<UaAccount> {

    /**
     * 查询账套相关信息
     * @param wrapper Wrapper<UaAccountDto>
     * @return List<UaAccountDto>
     */
    @Select("select ua.cAcc_Id as accId,ua.cAcc_Name as accName ,uas.iYear as year from UA_Account ua " +
            "inner join (select cAcc_Id ,MAX(iYear) as iYear from UA_Account_sub uas where iYear <> 9999 GROUP BY cAcc_Id) uas on ua.cAcc_Id = uas.cAcc_Id " +
            "ORDER BY ua.cAcc_Id ")
    List<UfAccountDto> selectUaAccountInfo(@Param(Constants.WRAPPER) Wrapper<UfAccountDto> wrapper);
}
