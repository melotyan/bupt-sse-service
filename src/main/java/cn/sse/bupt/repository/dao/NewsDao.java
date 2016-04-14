package cn.sse.bupt.repository.dao;

import cn.sse.bupt.model.NewsModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by melot on 2016/4/14.
 */
public interface NewsDao {

    public int insert(NewsModel newsModel);

    public int deleteById(@Param("id") int id);

    public int updateById(NewsModel newsModel);

    public List<NewsModel> selectByIdDesc(@Param("start") int start, @Param("offset") int offset);

    public NewsModel selectById(@Param("id") int id);
}
