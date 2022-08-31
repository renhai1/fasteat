package com.sherry.fasteat;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @program: fasteat
 * @description: fasteat启动类
 * @author: renhai
 * @Date ：2022/6/11 17:05
 **/
@Slf4j
@SpringBootApplication
@ServletComponentScan
public class FastEatApplication {
    public static void main(String[] args) {
        SpringApplication.run(FastEatApplication.class, args);
        log.info("项目启动成功");
    }
}
