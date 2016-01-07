package cn.sse.bupt.repository.dao;

import cn.sse.bupt.model.NoticeModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hao.yan on 2015/12/11.
 */
public interface NoticeDao {

    public int insert(NoticeModel noticeModel);

    public int updateTitleAndContentById(@Param("id") int id, @Param("updateUid") int updateUid, @Param("title") String title, @Param("content") String content);

    public List<NoticeModel> findByUid(@Param("uid") int uid, @Param("startId") int startId, @Param("pageSize") int pageSize);

    public int deleteById(@Param("id") int id);

    public NoticeModel findById(@Param("id") int id);

    public List<NoticeModel> listByOffsetAndSize(@Param("offset") int offset, @Param("pageSize") int pageSize);
}
