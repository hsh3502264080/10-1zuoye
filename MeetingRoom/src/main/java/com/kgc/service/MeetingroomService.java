package com.kgc.service;

import com.kgc.mapper.MeetingroomMapper;
import com.kgc.pojo.Meetingroom;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-01 22:45
 */
public interface MeetingroomService {
    List<Meetingroom> sel();
    int ins(Meetingroom meetingroom);


}
