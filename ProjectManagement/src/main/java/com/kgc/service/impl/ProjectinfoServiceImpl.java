package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.mapper.ProjectinfoMapper;
import com.kgc.pojo.Projectinfo;
import com.kgc.pojo.ProjectinfoExample;
import com.kgc.service.ProjectinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-04 17:17
 */
@Service("projectinfoService")
public class ProjectinfoServiceImpl implements ProjectinfoService {
    @Resource
    ProjectinfoMapper projectinfoMapper;

    @Override
    public PageInfo<Projectinfo> select(Integer pageIndex, int pageSize, Integer status) {
        ProjectinfoExample example=new ProjectinfoExample();
        ProjectinfoExample.Criteria criteria = example.createCriteria();
        if(status!=0){
            criteria.andStatusEqualTo(status);
        }
        PageHelper.startPage(pageIndex, pageSize);
        List<Projectinfo> projectinfos = projectinfoMapper.selectByExample(example);
        PageInfo<Projectinfo> projectinfoPageInfo=new PageInfo<>(projectinfos);
        return projectinfoPageInfo;
    }

    @Override
    public int upd(Projectinfo projectinfo) {
        return projectinfoMapper.updateByPrimaryKey(projectinfo);
    }
}
