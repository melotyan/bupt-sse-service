package cn.sse.bupt.service;

import cn.sse.bupt.enums.SenderStatusEnum;
import cn.sse.bupt.model.MailboxModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by melot on 2016/5/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:app_config/bupt-sse-service.xml"})
public class MailboxServiceTest {
    @Autowired
    private MailboxService mailboxService;

    MailboxModel mailboxModel = new MailboxModel();

    {
        mailboxModel.setUid(1);
        mailboxModel.setSenderName("sender");
        mailboxModel.setReceiverName("receiver");
        mailboxModel.setTitle("title");
        mailboxModel.setContent("content");
    }

    @Test
    public void testSendMail() {
        Assert.assertTrue(mailboxService.sendMail(mailboxModel) > 0);
    }

    @Test
    public void testSaveDraft() {
        mailboxModel.setTitle("draft");
        Assert.assertTrue(mailboxService.saveDraft(mailboxModel) > 0);
    }
    @Test
    public void testSendDraft() {
        Assert.assertTrue(mailboxService.sendDraft(1) > 0);
    }

    @Test
    public void testReadMail() {
        Assert.assertNotNull(mailboxService.readMail(1));
    }

    @Test
    public void testSetMailReaded() {
        Assert.assertTrue(mailboxService.setMailReaded(1) > 0);
    }

    @Test
    public void testViewInbox() {
        Assert.assertNotNull(mailboxService.viewInbox("receiver"));
    }

    @Test
    public void testViewOutbox() {
        Assert.assertNotNull(mailboxService.viewOutbox("sender"));
    }

    @Test
    public void testViewDrafts() {
        Assert.assertNotNull(mailboxService.viewDrafts("sender"));
    }

    @Test
    public void testDeleteSendedMail() {
        Assert.assertTrue(mailboxService.deleteSendedMail(1) > 0);
    }

    @Test
    public void testDeleteReceiverMail() {
        Assert.assertTrue(mailboxService.deleteReceivedMail(1) > 0);
    }



}
