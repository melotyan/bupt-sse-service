package cn.sse.bupt.repository;

import cn.sse.bupt.model.InutatccmOfTenderModel;
import cn.sse.bupt.repository.dao.InutatccmOfTenderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by melot on 2016/4/4.
 */
@Repository("inutatccmOfTenderRepository")
public class InutatccmOfTenderRepository {
    @Autowired
    private InutatccmOfTenderDao inutatccmOfTenderDao;

    public int insert(InutatccmOfTenderModel inutatccmOfTenderModel) {
        return inutatccmOfTenderDao.insert(inutatccmOfTenderModel);
    }

    public int updateById(int id, String title, String content, String fileUrl) {
        return inutatccmOfTenderDao.updateById(id, title, content, fileUrl);
    }

    public int deleteById(int id) {
        return inutatccmOfTenderDao.deleteById(id);
    }

    public InutatccmOfTenderModel selectById(int id) {
        return inutatccmOfTenderDao.selectById(id);
    }

    public List<InutatccmOfTenderModel> listByCreateDateDesc(int start, int size) {
        return inutatccmOfTenderDao.listByCreateDateDesc(start, size);
    }


}
