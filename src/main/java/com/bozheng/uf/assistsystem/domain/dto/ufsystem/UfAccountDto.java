package com.bozheng.uf.assistsystem.domain.dto.ufsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jianjiawen
 * @date 2021-2-16 17:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UfAccountDto {

    private String accId;

    private String accName;

    private Short year;

}
