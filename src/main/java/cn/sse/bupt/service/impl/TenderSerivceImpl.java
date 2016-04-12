package cn.sse.bupt.service.impl;

import cn.sse.bupt.model.TenderModel;
import cn.sse.bupt.repository.TenderRepository;
import cn.sse.bupt.service.TenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by melot on 2016/4/4.
 */
@Service("tenderService")
public class TenderSerivceImpl implements TenderService {
    @Autowired
    private TenderRepository tenderRepository;

    @Override
    public int competitiveTender(int uid, int tid, String title, String fileUrl) {
        return tenderRepository.insert(uid, tid, title, fileUrl);
    }

    @Override
    public List<TenderModel> listTenderByTid(int tid) {
        return tenderRepository.selectByTid(tid);
    }

    @Override
    public List<TenderModel> listTenderByUid(int uid) {
        return tenderRepository.selectByUid(uid);
    }
}
