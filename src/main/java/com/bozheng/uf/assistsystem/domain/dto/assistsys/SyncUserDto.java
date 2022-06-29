package com.bozheng.uf.assistsystem.domain.dto.assistsys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 同步用友用户DTO
 * @author jianjiawen
 * @date 2021-2-25 20:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SyncUserDto {
    /**
     * 同步用户数
     */
    private Integer syncUserCount = 0;
}
