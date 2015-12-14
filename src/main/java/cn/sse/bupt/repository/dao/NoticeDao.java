package cn.sse.bupt.repository.dao;

import cn.sse.bupt.model.NoticeModel;
import org.apache.ibatis.annotations.Param;

/**
 * Created by hao.yan on 2015/12/11.
 */
public interface NoticeDao {

    public int insert(NoticeModel noticeModel);

    public int updateTitleAndContentById(@Param("id") int id, @Param("updateUid") int updateUid, @Param("title") String title, @Param("content") String content);

    public NoticeModel findByUid(@Param("uid") int uid);

    public int updateNoticeStatusAndUpdateUidById(@Param("id") int id, @Param("updateUid") int updateUid, @Param("newStatus") int newStatus);
}
