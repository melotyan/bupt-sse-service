package cn.sse.bupt.repository;

import cn.sse.bupt.model.UserModel;
import cn.sse.bupt.repository.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by hao.yan on 2015/12/1.
 */
@Repository
public class UserRepository {
    @Autowired
    private UserDao userDao;

    public int insert(UserModel userModel) {
        return userDao.insert(userModel);
    }

    public UserModel findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}