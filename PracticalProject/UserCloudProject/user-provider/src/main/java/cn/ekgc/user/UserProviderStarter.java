package cn.ekgc.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>项目 Provider 启动类</b>
 * @author Kirito
 * @version 4.1.0
 * @since 4.1.0
 */
@EnableEurekaClient
@MapperScan("cn.ekgc.user.dao")
@SpringBootApplication
public class UserProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserProviderStarter.class,args);
	}
}
