package com.kgc.service.impl;

import com.kgc.mapper.StudentinfoMapper;
import com.kgc.pojo.Studentinfo;
import com.kgc.pojo.StudentinfoExample;
import com.kgc.service.StudentinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 14:19
 */
@Service("studentinfoService")
public class StudentinfoServiceImpl implements StudentinfoService {
    @Resource
    StudentinfoMapper studentinfoMapper;

    @Override
    public List<Studentinfo> sel() {
        return studentinfoMapper.selectByExample(null);
    }

    @Override
    public Studentinfo sel2(Integer sid) {
        return studentinfoMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int upd(Studentinfo studentinfo) {
        return studentinfoMapper.updateByPrimaryKey(studentinfo);
    }


}
