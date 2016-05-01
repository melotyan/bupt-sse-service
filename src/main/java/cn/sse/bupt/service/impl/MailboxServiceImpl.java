package cn.sse.bupt.service.impl;

import cn.sse.bupt.enums.ReceiverStatusEnum;
import cn.sse.bupt.enums.SenderStatusEnum;
import cn.sse.bupt.model.MailboxModel;
import cn.sse.bupt.repository.MailboxRepository;
import cn.sse.bupt.service.MailboxService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by melot on 2016/5/1.
 */
public class MailboxServiceImpl implements MailboxService {
    @Autowired
    private MailboxRepository mailboxRepository;

    @Override
    public int sendMail(MailboxModel mailboxModel) {
        return mailboxRepository.save(mailboxModel);
    }

    @Override
    public int sendDraft(int id) {
        return mailboxRepository.updateSenderStatusById(id, SenderStatusEnum.SENDED.getValue());
    }

    @Override
    public int saveDraft(MailboxModel mailboxModel) {
        return mailboxRepository.save(mailboxModel);
    }

    @Override
    public MailboxModel readMail(int id) {
        return mailboxRepository.selectById(id);
    }

    @Override
    public int setMailReaded(int id) {
        return mailboxRepository.updateReceiverStatusById(id, ReceiverStatusEnum.READED.getValue());
    }

    @Override
    public List<MailboxModel> viewInbox(String receiver) {
        return mailboxRepository.selectByReceiverName(receiver);
    }

    @Override
    public List<MailboxModel> viewOutbox(String sender) {
        return mailboxRepository.selectBySenderName(sender);
    }

    @Override
    public int deleteSendedMail(int id) {
        return mailboxRepository.updateSenderStatusById(id, SenderStatusEnum.DELETED.getValue());
    }

    @Override
    public int deleteReceivedMail(int id) {
        return mailboxRepository.updateReceiverStatusById(id, ReceiverStatusEnum.DELETED.getValue());
    }
}
