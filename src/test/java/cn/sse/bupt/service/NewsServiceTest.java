package cn.sse.bupt.service;

import cn.sse.bupt.model.NewsModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by melot on 2016/4/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:app_config/bupt-sse-service.xml"})
public class NewsServiceTest {
    @Autowired
    private NewsService newsService;

    private NewsModel newsModel;
    {
        newsModel = new NewsModel();
        newsModel.setTitle("title");
        newsModel.setUid(1);
        newsModel.setUpdateUid(1);
        newsModel.setContent("content");
        newsModel.setFirstPic("firstPIc");
        newsModel.setFileUrls("fileUrls");
    }

    @Test
    public void testPublish() {
        Assert.assertTrue(newsService.publishNews(newsModel) > 0);
    }

    @Test
    public void testEdit() {
        newsModel.setTitle("edit title");
        Assert.assertTrue(newsService.editNews(newsModel) > 0);
    }

    @Test
    public void testViewDetail() {
        Assert.assertNotNull(newsService.viewNewsDetail(1));
    }

    @Test
    public void testListAll() {
        Assert.assertNotNull(newsService.listNews(1, 50));
    }

    @Test
    public void testDelete() {
        Assert.assertTrue(newsService.deleteNews(1) > 0);
    }
}
