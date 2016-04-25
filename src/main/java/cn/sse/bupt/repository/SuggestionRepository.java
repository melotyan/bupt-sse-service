package cn.sse.bupt.repository;

import cn.sse.bupt.model.SuggestionModel;
import cn.sse.bupt.repository.dao.SuggestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hao.yan on 2016/1/12.
 */
@Repository("suggestionRepository")
public class SuggestionRepository {
    @Autowired
    private SuggestionDao suggestionDao;

    public int insert(SuggestionModel suggestionModel) {
        return suggestionDao.insert(suggestionModel);
    }

    public int updateTitleAndContentById(int id, String title, String content) {
        return suggestionDao.updateTitleAndContentById(id, title, content);
    }

    public int deleteById(int id) {
        return suggestionDao.deleteById(id);
    }

    public List<SuggestionModel> listByTypeAndOffsetAndSize(int type, int offset, int size) {
        return suggestionDao.listByTypeAndOffsetAndSize(type, offset, size);
    }

    public SuggestionModel findById(int id) {
        return suggestionDao.findById(id);
    }
}
