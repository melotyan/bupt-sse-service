package cn.sse.bupt.service.impl;

import cn.sse.bupt.model.InutatccmOfTenderModel;
import cn.sse.bupt.repository.InutatccmOfTenderRepository;
import cn.sse.bupt.service.InutatccmOfTenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by melot on 2016/4/4.
 */
@Service("inutatccmOfTenderService")
public class InutatccmOfTenderSerivceImpl implements InutatccmOfTenderService {
    @Autowired
    private InutatccmOfTenderRepository inutatccmOfTenderRepository;

    @Override
    public int createTenderInfo(InutatccmOfTenderModel inutatccmOfTenderModel) {
        return inutatccmOfTenderRepository.insert(inutatccmOfTenderModel);
    }

    @Override
    public int editTenderInfo(int id, String title, String content, String fileUrl) {
        return inutatccmOfTenderRepository.updateById(id, title, content, fileUrl);
    }

    @Override
    public int deleteTenderInfo(int id) {
        return inutatccmOfTenderRepository.deleteById(id);
    }

    @Override
    public List<InutatccmOfTenderModel> listTenderInfos(int page, int pageSize) {
        int start = (page - 1) * pageSize;
        return inutatccmOfTenderRepository.listByCreateDateDesc(start, pageSize);
    }
}
