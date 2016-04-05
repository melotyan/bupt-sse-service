package cn.sse.bupt.repository.dao;

import cn.sse.bupt.model.TenderModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by melot on 2016/4/4.
 */
public interface TenderDao {
    public int insert(@Param("uid") int uid, @Param("tid") int tid, @Param("title") String title, @Param("fileUrl") String fileUrl);

    public List<TenderModel> selectByTid(@Param("tid") int tid);
}
