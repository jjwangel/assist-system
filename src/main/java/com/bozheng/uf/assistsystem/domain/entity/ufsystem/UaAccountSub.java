package com.bozheng.uf.assistsystem.domain.entity.ufsystem;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author jianjiawen
 * @date 2021-2-16 10:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "UA_Account_sub")
public class UaAccountSub {

    @TableId(value = "cAcc_Id",type = IdType.INPUT)
    private String accId;

    @TableField(value = "iYear")
    private Short year;

    @TableField(value = "cSub_Id")
    private String subId;

    @TableField(value = "bIsDelete")
    private Boolean isDelete;

    @TableField(value = "bClosing")
    private Boolean closing;

    @TableField(value = "iModiPeri")
    private Byte modiPeri;

    @TableField(value = "dSubSysUsed")
    private Date subSysUsed;

    @TableField(value = "cUser_Id")
    private String userId;

    @TableField(value = "dSubOriDate")
    private Date subOriDate;
}
