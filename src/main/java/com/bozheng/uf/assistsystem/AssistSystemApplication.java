package com.bozheng.uf.assistsystem;

import com.mzt.logapi.starter.annotation.EnableLogRecord;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author jianjiawen
 * @date 2021-2-15 17:00
 */
@SpringBootApplication
@MapperScan("com.bozheng.uf.assistsystem.mapper")
@EnableLogRecord(tenant = "com.bozheng.uf.assistsystem")
public class AssistSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssistSystemApplication.class, args);
    }

}
