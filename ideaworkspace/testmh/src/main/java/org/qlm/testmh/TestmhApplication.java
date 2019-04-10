package org.qlm.testmh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.qlm.testmh.mapper")
public class TestmhApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmhApplication.class, args);
    }

}
