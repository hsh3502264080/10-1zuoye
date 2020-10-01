package com.kgc.service.impl;

import com.kgc.mapper.MeetingroomMapper;
import com.kgc.pojo.Meetingroom;
import com.kgc.service.MeetingroomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-01 22:45
 */
@Service("meetingroomService")
public class MeetingroomServiceImpl implements MeetingroomService {
    @Resource
    MeetingroomMapper meetingroomMapper;
    @Override
    public List<Meetingroom> sel() {
        return meetingroomMapper.selectByExample(null);
    }

    @Override
    public int ins(Meetingroom meetingroom) {
        return meetingroomMapper.insert(meetingroom);
    }
}
