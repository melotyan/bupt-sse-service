package cn.sse.bupt.repository.dao;

import cn.sse.bupt.model.MailboxModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by melot on 2016/5/1.
 */
public interface MailboxDao {
    public int save(MailboxModel mailboxModel);

    public int updateSenderStatusById(@Param("id") int id, @Param("newStatus") int newStatus);

    public MailboxModel selectById(@Param("id") int id);

    public int updateReceiverStatusById(@Param("id") int id, @Param("newStatus") int newStatus);

    public List<MailboxModel> selectBySenderNameAndSenderStatus(@Param("senderName") String senderName, @Param("senderStatus") int senderStatus);

    public List<MailboxModel> selectByReceiverName(@Param("receiverName") String receivername);

}
