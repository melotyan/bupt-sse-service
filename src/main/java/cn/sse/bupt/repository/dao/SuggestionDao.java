package cn.sse.bupt.repository.dao;

import cn.sse.bupt.model.SuggestionModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hao.yan on 2016/1/12.
 */
public interface SuggestionDao {
    public int insert(SuggestionModel suggestionModel);

    public int updateTitleAndContentById(@Param("id") int id, @Param("title") String title, @Param("content") String content);

    public SuggestionModel findById(@Param("id") int id);

    public int deleteById(@Param("id") int id);

    public List<SuggestionModel> listByOffsetAndSize(@Param("offset") int offset, @Param("size") int size);
}
