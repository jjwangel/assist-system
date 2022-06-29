package com.bozheng.uf.assistsystem.domain.dto.assistsys;

import com.bozheng.uf.assistsystem.enums.user.UserSexEnum;
import com.bozheng.uf.assistsystem.utils.EnumUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author jianjiawen
 * @date 2021-4-8 20:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUserDto {
    /** 自增ID */
    private Long id;

    /** 登录ID */
    private String loginId;

    /** 用户姓名 */
    private String userName;

    /** 性别：0：男、1：女 */
    private Byte sex;

    /** 所属部门 */
    private String department;

    /** 手机号 */
    private String mobileNum;

    /** 电子邮箱 */
    private String email;

    /** 描述 */
    private String description;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    /** 最近登录时间 */
    private Date latestLoginTime;

    /** 登录次数 */
    private Integer loginCount;

    /** 是否删除 */
    private Byte isDelete;

    @JsonIgnore
    public UserSexEnum getUserSexEnum(Integer code) {
        return EnumUtil.getByCode(code, UserSexEnum.class);
    }
}
