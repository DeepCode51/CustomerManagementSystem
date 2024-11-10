package com.zrzcrm.service.impl;

import com.zrzcrm.domain.Customer;
import com.zrzcrm.domain.Emp;
import com.zrzcrm.domain.Track;
import com.zrzcrm.domain.TrackVo;
import com.zrzcrm.mapper.CustomerMapper;
import com.zrzcrm.mapper.EmpMapper;
import com.zrzcrm.mapper.TrackMapper;
import com.zrzcrm.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TrackServiceImpl  implements TrackService {

    @Autowired
    private TrackMapper trackMapper;

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public int addTrack(Track track) {
        int i = trackMapper.addTrack(track);
        return i;
    }

    @Override
    public int deleteTrack(int tid) {
        int i = trackMapper.deleteTrack(tid);
        return i;
    }

    @Override
    public int updateTrack(Track track) {
        int i = trackMapper.updateTrack(track);
        return i;
    }

    @Override
    public List<TrackVo> findAllTrack() {
        List<Track> allTrack = trackMapper.findAllTrack();
        List<TrackVo> list = new ArrayList<>();
        for (Track track : allTrack) {
            TrackVo trackVo = new TrackVo();
            Customer customer = customerMapper.findOneCustomer(track.getCid());
            Emp emp = empMapper.findEmpByEid(track.getEid());
            trackVo.setTid(track.getTid());
            trackVo.setCustomer(customer);
            trackVo.setEmp(emp);
            trackVo.setRecord(track.getRecord());
            trackVo.setIntention(track.getIntention());
            list.add(trackVo);
        }
        return list;
    }

    @Override
    public Track findOneTrack(int tid) {
        Track track = trackMapper.findOneTrack(tid);
        return track;
    }
}
