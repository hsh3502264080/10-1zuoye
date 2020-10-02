package com.kgc.service;

import com.kgc.pojo.Studentinfo;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-02 14:18
 */
public interface StudentinfoService
{

    List<Studentinfo> sel();
    Studentinfo sel2(Integer sid);
    int upd(Studentinfo studentinfo);
}
