package cn.sse.bupt.repository.dao;

import cn.sse.bupt.model.FileModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hao.yan on 2015/12/22.
 */
public interface FileDao {

    public int save(FileModel fileModel);

    public int deleteById(@Param("id") int id);

    public List<FileModel> selectByNid(@Param("nid") int nid);
}
