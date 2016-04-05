package cn.sse.bupt.service;

import cn.sse.bupt.model.InutatccmOfTenderModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by melot on 2016/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:app_config/bupt-sse-service.xml"})
public class InutatccmOfTenderServiceTest {
    @Autowired
    private InutatccmOfTenderService inutatccmOfTenderService;

    InutatccmOfTenderModel inutatccmOfTenderModel = new InutatccmOfTenderModel();
    {
        inutatccmOfTenderModel.setTitle("title");
        inutatccmOfTenderModel.setContent("content");
        inutatccmOfTenderModel.setFileUrl("fileUrl");
        inutatccmOfTenderModel.setCreateDate(new Date());
    }

    @Test
    public void testCreateTenderInfo() {
        Assert.assertTrue(inutatccmOfTenderService.createTenderInfo(inutatccmOfTenderModel) > 0);
    }

    @Test
    public void testEditTenderInfo() {
        Assert.assertTrue(inutatccmOfTenderService.editTenderInfo(1, "titleUpdate", "content", "fileUrl") > 0);
    }

    @Test
    public void testListTenderInfos() {
        Assert.assertNotNull(inutatccmOfTenderService.listTenderInfos(1, 100));
    }

    @Test
    public void testViewDetail() {
        Assert.assertNotNull(inutatccmOfTenderService.viewTenderDetail(2));
    }
    @Test
    public void testDeleteTenderInfo() {
        Assert.assertTrue(inutatccmOfTenderService.deleteTenderInfo(1) > 0);
    }

}
