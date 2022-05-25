package cs.hku.metalibrary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(basePackages = "cs.hku")
@SpringBootApplication(scanBasePackages = "cs.hku")
public class MetaLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetaLibraryApplication.class, args);
    }

}
