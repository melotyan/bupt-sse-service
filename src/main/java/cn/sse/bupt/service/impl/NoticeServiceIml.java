package cn.sse.bupt.service.impl;

import cn.sse.bupt.enums.NoticeStatusEnum;
import cn.sse.bupt.model.NoticeModel;
import cn.sse.bupt.repository.NoticeRepository;
import cn.sse.bupt.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hao.yan on 2015/12/11.
 */
@Service("noticeService")
public class NoticeServiceIml implements NoticeService {

    @Autowired
    private NoticeRepository noticeRepository;

    @Override
    public int publishNotice(NoticeModel noticeModel) {
        return noticeRepository.insert(noticeModel);
    }

    @Override
    public int updateNotice(int id, int updateUid, String title, String content) {
        return noticeRepository.updateTitleAndContentById(id, updateUid, title, content);
    }

    @Override
    public int deleteNotice(int id, int updateUid) {
        return noticeRepository.updateNoticeStatusAndUpdateUidById(id, updateUid, NoticeStatusEnum.DELETED.getValue());
    }

    @Override
    public List<NoticeModel> findNoticeByUid(int uid, int startId, int pageSize) {
        return noticeRepository.findByUid(uid, startId, pageSize);
    }
}
