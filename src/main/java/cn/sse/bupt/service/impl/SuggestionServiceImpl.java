package cn.sse.bupt.service.impl;

import cn.sse.bupt.model.SuggestionModel;
import cn.sse.bupt.repository.SuggestionRepository;
import cn.sse.bupt.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hao.yan on 2016/1/12.
 */
@Service("suggestionService")
public class SuggestionServiceImpl implements SuggestionService {
    @Autowired
    private SuggestionRepository suggestionRepository;

    @Override
    public int makeSuggestion(SuggestionModel suggestionModel) {
        return suggestionRepository.insert(suggestionModel);
    }

    @Override
    public int editSuggestion(int id, String title, String content) {
        return suggestionRepository.updateTitleAndContentById(id, title, content);
    }

    @Override
    public int deleteSuggestion(int id) {
        return suggestionRepository.deleteById(id);
    }

    @Override
    public SuggestionModel viewSuggestion(int id) {
        return suggestionRepository.findById(id);
    }

    @Override
    public List<SuggestionModel> listSuggestionsByType(int type, int offset, int pageSize) {
        return suggestionRepository.listByTypeAndOffsetAndSize(type, offset, pageSize);
    }


}
