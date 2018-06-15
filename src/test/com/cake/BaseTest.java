package com.cake;
/**
 * Created by XuRui's Hands.
 * User:XuRui
 * Date:2017/1/2
 * Time:19:57
 */

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


//配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:Spring/spring-dao.xml",
                        "classpath:Spring/spring-service.xml",
                        "classpath:Spring/spring-mvc.xml"})
@Transactional
public class BaseTest {

}
