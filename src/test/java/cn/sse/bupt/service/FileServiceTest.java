package cn.sse.bupt.service;

import cn.sse.bupt.model.FileModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by hao.yan on 2015/12/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app_config/bupt-sse-service.xml")
public class FileServiceTest {
    @Autowired
    private FileService fileService;


    @Test
    public void testSaveFile() {
        FileModel fileModel = new FileModel();
        fileModel.setNid(1);
        fileModel.setTitle("新文件.doc");
        fileModel.setUrl("www.lslldlf.com");
        Assert.assertTrue(fileService.saveFile(fileModel) > 0);
        System.out.println(fileModel.getId());
    }

    @Test
    public void testDeleteById() {
        Assert.assertTrue(fileService.deleteFileById(1) > 0);
    }

    @Test
    public void testGetByNid() {
        Assert.assertNotNull(fileService.getFileByNid(1));
    }
}
