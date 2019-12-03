package pro.hyder.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Hyder
 * @version 1.0
 * @date 2019/12/2 下午4:55
 */
@ComponentScan(basePackages = "pro.hyder")
@EnableAspectJAutoProxy
public class Configuration {}
