package cn.ekgc.user.transport;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>用户功能传输层接口</b>
 * @author Kirito
 * @version 4.1.0
 * @since 1.0.0
 */
@FeignClient(name = "user-provider")
@RequestMapping("/user")
public interface UserTransport {

}
