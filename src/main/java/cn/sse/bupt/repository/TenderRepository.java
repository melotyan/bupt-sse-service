package cn.sse.bupt.repository;

import cn.sse.bupt.model.TenderModel;
import cn.sse.bupt.repository.dao.TenderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by melot on 2016/4/4.
 */
@Repository("tenderRepository")
public class TenderRepository {
    @Autowired
    private TenderDao tenderDao;

    public int insert(int uid, int tid, String title, String url) {
        return tenderDao.insert(uid, tid, title, url);
    }

    public List<TenderModel> selectByTid(int tid) {
        return tenderDao.selectByTid(tid);
    }

    public List<TenderModel> selectByUid(int uid) {
        return tenderDao.selectByUid(uid);
    }
}
