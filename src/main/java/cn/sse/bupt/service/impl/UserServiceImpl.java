package cn.sse.bupt.service.impl;

import cn.sse.bupt.enums.AccountStatusEnum;
import cn.sse.bupt.model.UserModel;
import cn.sse.bupt.repository.UserRepository;
import cn.sse.bupt.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hao.yan on 2015/12/1.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public int register(UserModel userModel) {
        return userRepository.insert(userModel);
    }

    @Override
    public boolean login(String username, String password) {
        UserModel userModel = userRepository.findByUsername(username);
        if (userModel != null)
            return password.equals(userModel.getPassword());
        return false;
    }

    @Override
    public boolean hasRegistered(String username) {
        return userRepository.findByUsername(username) == null ? false : true;
    }

    @Override
    public int logout(UserModel userModel) {
        return 0;
    }

    @Override
    public int activeAccount(int id) {
        return userRepository.updateAccountStatus(id, AccountStatusEnum.ACTIVITATED.getValue());
    }

    @Override
    public boolean isActivated(String username) {
        UserModel userModel = userRepository.findByUsername(username);
        if (userModel == null)
            return false;
        if (userModel.getAccountStatus() != AccountStatusEnum.ACTIVITATED.getValue())
            return false;
        return true;
    }

    @Override
    public UserModel findUserByUsername(String username) {
        LOGGER.info("find user :{}", username);
        return userRepository.findByUsername(username);
    }

    @Override
    public UserModel findUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public int updateUserInfo(UserModel userModel) {
        return userRepository.updateUserModelById(userModel);
    }
}
