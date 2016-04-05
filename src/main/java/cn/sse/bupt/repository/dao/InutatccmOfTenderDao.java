package cn.sse.bupt.repository.dao;

import cn.sse.bupt.model.InutatccmOfTenderModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by melot on 2016/4/4.
 */
public interface InutatccmOfTenderDao {
    public int insert(InutatccmOfTenderModel inutatccmOfTenderModel);

    public int updateById(@Param("id") int id, @Param("title") String title, @Param("content") String content, @Param("fileUrl") String fileUrl);

    public int deleteById(@Param("id") int id);

    public InutatccmOfTenderModel selectById(@Param("id") int id);

    public List<InutatccmOfTenderModel> listByCreateDateDesc(@Param("start") int start, @Param("size") int size);
}
