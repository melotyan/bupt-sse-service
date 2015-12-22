package cn.sse.bupt.repository;

import cn.sse.bupt.model.FileModel;
import cn.sse.bupt.repository.dao.FileDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hao.yan on 2015/12/22.
 */
@Repository
public class FileRepository {

    @Autowired
    private FileDao fileDao;

    public int save(FileModel fileModel) {
        return fileDao.save(fileModel);
    }

    public List<FileModel> selectByNid(int nid) {
        return fileDao.selectByNid(nid);
    }

    public int deleteById(int id) {
        return fileDao.deleteById(id);
    }

}
