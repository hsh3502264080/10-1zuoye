package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Projectinfo;

/**
 * @author shkstart
 * @create 2020-10-04 17:16
 */
public interface ProjectinfoService {
    PageInfo<Projectinfo> select(Integer pageIndex, int pageSize, Integer status);
    int upd(Projectinfo projectinfo);
}
