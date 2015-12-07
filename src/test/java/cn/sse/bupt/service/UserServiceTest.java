package cn.sse.bupt.service;

import cn.sse.bupt.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hao.yan on 2015/12/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:app_config/bupt-sse-service.xml"})
public class UserServiceTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void testInsert() {
        UserModel userModel = new UserModel();
        userModel.setUsername("yanhao4");
        userModel.setNickname("严浩");
        userModel.setEmail("yanhao@126.com");
        userModel.setAddress("北邮");
        userModel.setPassword("1234545");
        userModel.setPhone("123445");
        userService.register(userModel);
        LOGGER.info("test register:{}", userModel);
    }

}
