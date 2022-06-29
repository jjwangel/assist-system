package com.bozheng.uf.assistsystem.domain.vo.request.assistsys;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author jianjiawen
 * @date 2021-3-25 20:44
 * @description 登录请求数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginInfoVo {
    @NotBlank(message = "登录ID不能为空")
    @ApiModelProperty(value = "登录ID", required = true)
    String loginId;

    @NotBlank(message = "登录密码不能为空")
    @ApiModelProperty(value = "登录密码", required = true)
    String loginPwd;

    @NotBlank(message = "登录账套号不能为空")
    @ApiModelProperty(value = "登录账套号", required = true)
    String accId;

    @NotBlank(message = "登录账套日期不能为空")
    @ApiModelProperty(value = "登录账套日期", required = true)
    String accDate;
}
