package com.bozheng.uf.assistsystem.other;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.img.Img;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.Tailer;
import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.StrUtil;
import com.bozheng.uf.assistsystem.domain.entity.assistsys.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jianjiawen
 * @date 2021-2-21 16:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class HuToolTest {

    @Test
    public void dateTest() {
//        Date date = DateUtil.parse("2000-1-1");
//        Console.log(date);

        Console.log(DateUtil.year(DateUtil.date()));
    }

    @Test
    public void strTest() {
        String a = null;
        Console.log(StrUtil.hasEmpty(a));
    }

    @Test
    public void tailTest() {
        Tailer tailer = new Tailer(FileUtil.file("f:/test.log"), Tailer.CONSOLE_HANDLER, 2);
        tailer.start();
    }

    @Test
    public void idCardTest() {
        String province = IdcardUtil.getProvinceByIdCard("442000198007117650");
        Console.log(province);
    }

    @Test
    public void validateMobileTest(){
        Console.log(Validator.isCitizenId("442000198007117659"));
    }

    @Test
    public void sortPageAllTest() {
//        CollUtil.sortPageAll()
    }

    @Test
    public void imgTest() {
        Img.from(FileUtil.file("f:/1.png"))
                .setPositionBaseCentre(true)
                .pressText("版权所有", Color.RED, //
                        new Font("黑体", Font.BOLD, 100), //
                        0, //
                        100, //
                        1f)
                .write(FileUtil.file("f:/2.png"));
    }

    @Test
    public void listFilterTest() {
        List<SysUser> lstUser = new ArrayList<SysUser>();

        SysUser u1 = new SysUser();
        u1.setLoginId("1");
        SysUser u2 = new SysUser();
        u2.setLoginId("2");
        SysUser u3 = new SysUser();
        u3.setLoginId("3");

        lstUser.add(u1);
        lstUser.add(u2);
        lstUser.add(u3);

        SysUser u4 = new SysUser();


        List<SysUser> newUser= ListUtil.filter(lstUser,v -> v.getLoginId().equals(u4.getLoginId()) ? v : null);

        Console.log(newUser.isEmpty());
    }

    @Test
    public void collectTest() {
        List<Long> lstId = new ArrayList<>();
        lstId.add(0L);
        lstId.add(1L);
        lstId.add(2L);

        Console.log(CollectionUtil.join(lstId,","));

    }



}
