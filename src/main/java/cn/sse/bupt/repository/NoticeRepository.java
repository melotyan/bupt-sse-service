package cn.sse.bupt.repository;

import cn.sse.bupt.model.NoticeModel;
import cn.sse.bupt.repository.dao.NoticeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by hao.yan on 2015/12/11.
 */
@Repository
public class NoticeRepository {

    @Autowired
    private NoticeDao noticeDao;

    public int insert(NoticeModel noticeModel) {
        return noticeDao.insert(noticeModel);
    }

    public int updateTitleAndContentById(int id, int updateUid, String title, String content) {
        return noticeDao.updateTitleAndContentById(id, updateUid, title, content);
    }

    public int updateNoticeStatusAndUpdateUidById(int id, int updateUid, int newStatus) {
        return noticeDao.updateNoticeStatusAndUpdateUidById(id, updateUid, newStatus);
    }

    public NoticeModel findByUid(int uid) {
        return noticeDao.findByUid(uid);
    }
}
