package cn.itcast.test;


import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author lyh
 * @date 2021/1/16-21:25
 */
public class ServiceTest {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        AccountService accountService = (AccountService) context.getBean("accountService");
        //调用方法
        accountService.findAll();
    }

}
