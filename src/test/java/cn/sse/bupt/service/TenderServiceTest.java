package cn.sse.bupt.service;

import cn.sse.bupt.model.TenderModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by melot on 2016/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:app_config/bupt-sse-service.xml"})
public class TenderServiceTest {
    @Autowired
    private TenderService tenderService;

    @Test
    public void testInsert() {
        Assert.assertTrue(tenderService.competitiveTender(1, 1, "title", "fileUrl") > 0);
    }

    @Test
    public void testListByTid() {
        Assert.assertNotNull(tenderService.listTenderByTid(1));
    }

}
