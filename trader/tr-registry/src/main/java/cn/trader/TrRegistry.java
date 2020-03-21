package cn.trader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class TrRegistry {
    public static void main(String[] args) {
        SpringApplication.run(TrRegistry.class);
    }
}
