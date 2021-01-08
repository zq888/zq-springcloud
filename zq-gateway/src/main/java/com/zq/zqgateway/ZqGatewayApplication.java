package com.zq.zqgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author zhangqiang
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZqGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZqGatewayApplication.class, args);
    }

}
