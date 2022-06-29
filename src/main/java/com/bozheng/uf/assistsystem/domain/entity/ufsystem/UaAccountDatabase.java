package com.bozheng.uf.assistsystem.domain.entity.ufsystem;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jianjiawen
 * @date 2021-2-16 9:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "UA_AccountDatabase")
public class UaAccountDatabase {

    @TableId(value = "cAcc_Id" ,type = IdType.INPUT)
    private String accId;

    @TableField(value = "iBeginYear")
    private Short beginYear;

    @TableField(value = "iEndYear")
    private Short endYear;

    @TableField(value = "cDatabase")
    private String accDataBase;

}
