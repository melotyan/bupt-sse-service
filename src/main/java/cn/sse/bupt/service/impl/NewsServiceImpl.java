package cn.sse.bupt.service.impl;

import cn.sse.bupt.model.NewsModel;
import cn.sse.bupt.repository.NewsRepository;
import cn.sse.bupt.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by melot on 2016/4/14.
 */
@Service("newsService")
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public int publishNews(NewsModel newsModel) {
        return newsRepository.insert(newsModel);
    }

    @Override
    public int deleteNews(int id) {
        return newsRepository.deleteById(id);
    }

    @Override
    public int editNews(NewsModel newsModel) {
        return newsRepository.updateById(newsModel);
    }

    @Override
    public List<NewsModel> listNews(int page, int pageSize) {
        if (page < 1)
            page = 1;
        int start = (page - 1) * pageSize;
        return newsRepository.selectByIdDesc(start, pageSize);
    }

    @Override
    public NewsModel viewNewsDetail(int id) {
        return newsRepository.selectById(id);
    }
}
