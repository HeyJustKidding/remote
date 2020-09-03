package com.remote.remotedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// exclude 是不启用默认加载数据库的类，否则启动的时候会报错，要么就需要在application.properties里面加上数据库配置
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.remote"})
public class RemotedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemotedemoApplication.class, args);
    }

}
