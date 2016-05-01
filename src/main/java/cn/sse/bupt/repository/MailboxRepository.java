package cn.sse.bupt.repository;

import cn.sse.bupt.model.MailboxModel;
import cn.sse.bupt.repository.dao.MailboxDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by melot on 2016/5/1.
 */
public class MailboxRepository {
    @Autowired
    private MailboxDao mailboxDao;

    public int save(MailboxModel mailboxModel) {
        return mailboxDao.save(mailboxModel);
    }

    public int updateSenderStatusById(int id, int newStatus) {
        return mailboxDao.updateSenderStatusById(id, newStatus);
    }

    public MailboxModel selectById(int id) {
        return mailboxDao.selectById(id);
    }

    public int updateReceiverStatusById(int id, int newStatus) {
        return mailboxDao.updateReceiverStatusById(id, newStatus);
    }

    public List<MailboxModel> selectBySenderName(String senderName) {
        return mailboxDao.selectBySenderName(senderName);
    }

    public List<MailboxModel> selectByReceiverName(String receivername) {
        return mailboxDao.selectByReceiverName(receivername);
    }

}