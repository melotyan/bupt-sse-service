package cn.sse.bupt.service;

import cn.sse.bupt.model.UserModel;
import cn.sse.bupt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hao.yan on 2015/12/1.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
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
}
