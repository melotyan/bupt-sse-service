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

    public int updateNoticeStatusAndUpdateUidById(@Param("id") int id, @Param("updateUid") int updateUid, @Param("newStatus") int newStatus);
}
