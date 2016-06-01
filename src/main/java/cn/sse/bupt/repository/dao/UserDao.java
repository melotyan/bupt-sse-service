package cn.sse.bupt.repository.dao;

import cn.sse.bupt.model.UserModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hao.yan on 2015/12/1.
 */
public interface UserDao {

    public int insert(UserModel userModel);

    public UserModel findByUsername(@Param("username") String username);

    public int updateAccountStatus(@Param("id") int id, @Param("newStatus") int newStatus);

    public UserModel findById(@Param("id") int id);

    public int updateUserModelById(UserModel userModel);

    public int updateUserTypeAndAccountStatus(int id, int userType, int accountStatus);

    public List<UserModel> selectAll();
}
