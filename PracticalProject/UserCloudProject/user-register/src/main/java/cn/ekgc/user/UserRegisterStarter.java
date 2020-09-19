package cn.ekgc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>注册中心启动器</b>
 * @author Kirito
 * @version 4.1.0
 * @since 4.1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class UserRegisterStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserRegisterStarter.class,args);
	}
}
