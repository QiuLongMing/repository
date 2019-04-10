package cn.cityworks;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主启动类
 */
@SpringBootApplication
@MapperScan("cn.cityworks.repository")
public class IncludeApplication {

    public static void main(String[] args) {
        SpringApplication.run(IncludeApplication.class, args);
    }
}
