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
 * @date 2021-2-25 19:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "UA_User")
public class UaUser {
    @TableId(value = "cUser_Id" ,type = IdType.INPUT)
    private String userId;

    @TableField(value = "cUser_Name")
    private String userName;

    @TableField(value = "cPassword")
    private String password;

    @TableField(value = "iAdmin")
    private Boolean admin;

    @TableField(value = "cDept")
    private String dept;

    @TableField(value = "cBelongGrp")
    private String belongGrp;

    @TableField(value = "nState")
    private Short state;

    @TableField(value = "cUserEmail")
    private String userEmail;

    @TableField(value = "cUserHand")
    private String userHand;

    @TableField(value = "SaveMailCount")
    private Integer saveMailCount;

    @TableField(value = "SaveSMSCount")
    private Integer saveSmsCount;

    @TableField(value = "localeid")
    private String localeId;

    @TableField(value = "iErrorCount")
    private Short errorCount;

    @TableField(value = "dPasswordDate")
    private Date passwordDate;

    @TableField(value = "cSysUserName")
    private String sysUserName;

    @TableField(value = "cSysUserPassword")
    private String sysUserPassword;

    @TableField(value = "bLogined")
    private Boolean logined;

    @TableField(value = "authenMode")
    private Integer authenMode;

    @TableField(value = "bRefuseModifyLoginDate")
    private Boolean refuseModifyLoginDate;

    @TableField(value = "iUserType")
    private Byte userType;

    @TableField(value = "bAutoCloseException")
    private Boolean autoCloseException;

    @TableField(value = "bDuaLoginException")
    private Boolean duaLoginException;

    @TableField(value = "dCrDate")
    private Date crDate;

    @TableField(value = "bModifyPWFirstLogin")
    private Boolean modifyPwFirstLogin;

    @TableField(value = "bAllinOneUser")
    private Boolean allinOneUser;

    @TableField(value = "bIMUser")
    private Boolean imUser;

    @TableField(value = "bCCUser")
    private Boolean ccUser;
}
