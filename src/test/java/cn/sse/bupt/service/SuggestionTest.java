package cn.sse.bupt.service;

import cn.sse.bupt.model.SuggestionModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by hao.yan on 2016/1/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:app_config/bupt-sse-service.xml")
public class SuggestionTest {
    @Autowired
    private SuggestionService suggestionService;


    @Test
    public void testMakeSuggestion() {
        SuggestionModel suggestionModel = new SuggestionModel();
        suggestionModel.setUid(1);
        suggestionModel.setTitle("意见TITLE");
        suggestionModel.setContent("意见CONTENT");
        suggestionModel.setCreateDate(new Date());
        Assert.assertTrue(suggestionService.makeSuggestion(suggestionModel) > 0);
    }

    @Test
    public void testEditSuggestion() {
        int id = 1;
        String title = "修改后的TITLE";
        String content = "修改后的content";
        Assert.assertTrue(suggestionService.editSuggestion(id, title, content) > 0);
    }

    @Test
    public void testViewSuggestion() {
        Assert.assertNotNull(suggestionService.viewSuggestion(1));
    }

    @Test
    public void testListSuggestions() {
        Assert.assertNotNull(suggestionService.listSuggestions(0, 100));
    }

    @Test
    public void testDeleteSuggestion() {
        Assert.assertTrue(suggestionService.deleteSuggestion(2) > 0);
    }
}
