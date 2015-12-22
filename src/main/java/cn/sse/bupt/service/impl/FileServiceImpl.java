package cn.sse.bupt.service.impl;

import cn.sse.bupt.model.FileModel;
import cn.sse.bupt.repository.FileRepository;
import cn.sse.bupt.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hao.yan on 2015/12/22.
 */
@Service("fileService")
public class FileServiceImpl implements FileService {
    @Autowired
    private FileRepository fileRepository;

    @Override
    public int saveFile(FileModel fileModel) {
        return fileRepository.save(fileModel);
    }

    @Override
    public List<FileModel> getFileByNid(int nid) {
        return fileRepository.selectByNid(nid);
    }

    @Override
    public int deleteFileById(int id) {
        return fileRepository.deleteById(id);
    }
}
