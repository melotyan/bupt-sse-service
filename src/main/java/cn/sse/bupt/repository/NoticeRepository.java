package cn.sse.bupt.repository;

import cn.sse.bupt.model.NoticeModel;
import cn.sse.bupt.repository.dao.NoticeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public int deleteById(int id) {
        return noticeDao.deleteById(id);
    }

    public List<NoticeModel> findByUid(int uid, int startId, int pageSize) {
        return noticeDao.findByUid(uid, startId, pageSize);
    }

    public NoticeModel findById(int id) {
        return noticeDao.findById(id);
    }

    public List<NoticeModel> listByOffsetAndSize(int offset, int pageSize) {
        return noticeDao.listByOffsetAndSize(offset, pageSize);
    }
}
