package cn.sse.bupt.repository;

import cn.sse.bupt.model.NewsModel;
import cn.sse.bupt.repository.dao.NewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by melot on 2016/4/14.
 */
@Repository("newsRepository")
public class NewsRepository {
    @Autowired
    private NewsDao newsDao;

    public int insert(NewsModel newsModel) {
        return newsDao.insert(newsModel);
    }

    public int deleteById(int id) {
        return newsDao.deleteById(id);
    }

    public int updateById(NewsModel newsModel) {
        return newsDao.updateById(newsModel);
    }

    public List<NewsModel> selectByIdDesc(int start, int offset) {
        return newsDao.selectByIdDesc(start, offset);
    }

    public NewsModel selectById(int id) {
        return newsDao.selectById(id);
    }
}
