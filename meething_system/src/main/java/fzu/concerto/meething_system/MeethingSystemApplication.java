package fzu.concerto.meething_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"fzu.concerto.meething_system.dao"})
@SpringBootApplication
public class MeethingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeethingSystemApplication.class, args);
    }

}
