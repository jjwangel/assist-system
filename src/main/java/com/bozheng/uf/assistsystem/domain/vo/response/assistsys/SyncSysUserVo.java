package com.bozheng.uf.assistsystem.domain.vo.response.assistsys;

import com.bozheng.uf.assistsystem.domain.entity.assistsys.SysUser;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 同步用友用户Vo
 * @author jianjiawen
 * @date 2021-2-25 20:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SyncSysUserVo {

    @ApiModelProperty(value = "创建系统用户数量")
    private int createUserCount;

    @ApiModelProperty(value = "更新系统用户数量")
    private int updateUserCount;

    @ApiModelProperty(value = "忽略系统用户数量")
    private int ignoreUserCount;
}
