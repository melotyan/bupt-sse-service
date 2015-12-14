package cn.sse.bupt.service;

import cn.sse.bupt.enums.NoticeStatusEnum;
import cn.sse.bupt.model.NoticeModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by hao.yan on 2015/12/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app_config/bupt-sse-service.xml")
public class NoticeServiceTest {
    @Autowired
    private NoticeService noticeService;

    private NoticeModel noticeModel = new NoticeModel();
    private int id = 1;
    private int updateUid = 1;
    private String title = "更新的title";
    private String content = "更新的content";

    @Test
    public void testPublishNotice() {
        noticeModel.setTitle(title);
        noticeModel.setContent(content);
        noticeModel.setUid(updateUid);
        noticeModel.setUpdateUid(updateUid);
        noticeModel.setNoticeStatus(NoticeStatusEnum.NORMAL.getValue());
        noticeModel.setCreateTime(new Date());
        Assert.assertTrue(noticeService.publishNotice(noticeModel) > 0);
    }

    @Test
    public void testUpdateNotice() {
        Assert.assertTrue(noticeService.updateNotice(id, updateUid, title, content) > 0);
    }

    @Test
    public void testDeleteNotice() {
        Assert.assertTrue(noticeService.deleteNotice(id, updateUid) > 0);
    }

    @Test
    public void testFindNoticeByUid() {
        Assert.assertNotNull(noticeService.findNoticeByUid(updateUid));
    }

}
