package cn.sse.bupt.service;

import cn.sse.bupt.enums.AccountStatusEnum;
import cn.sse.bupt.enums.UserTypeEnum;
import cn.sse.bupt.model.UserModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by hao.yan on 2015/12/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:app_config/bupt-sse-service.xml"})
public class UserServiceTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    private UserModel userModel = new UserModel();
    private String username = "yanhao7";
    private String password = "12345";
    private int uid = 9;


    @Test
    public void testRegister() {
        userModel.setUsername(username);
        userModel.setPassword(password);
        userModel.setUserType(UserTypeEnum.CUSTOMER.getValue());
        userModel.setCreateTime(new Date());
        userModel.setAccountStatus(AccountStatusEnum.UNACTIVATED.getValue());
        userModel.setEmail("email");
        userModel.setPhone("phone");
        userModel.setNickname("yanhao");
        userModel.setAddress("address");
        uid = userService.register(userModel);
        Assert.assertTrue(uid > 0);
    }

    @Test
    public void testLogin() {
        Assert.assertTrue(userService.login(username, password));
    }

    @Test
    public void testHasRegister() {
        Assert.assertTrue(userService.hasRegistered(username));
    }

    @Test
    public void testActiveAccount() {
        Assert.assertTrue(userService.activeAccount(uid) > 0);
    }

    @Test
    public void testIsActivated() {
        Assert.assertTrue(userService.isActivated(username));
    }

    @Test
    public void testFindByUsername() {
        Assert.assertNotNull(userService.findUserByUsername(username));
    }

    @Test
    public void testFindById() {
        Assert.assertNotNull(userService.findUserById(uid));
    }
}
