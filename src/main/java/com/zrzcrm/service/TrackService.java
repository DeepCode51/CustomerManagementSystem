package com.zrzcrm.service;

import com.github.pagehelper.PageInfo;
import com.zrzcrm.domain.Track;
import com.zrzcrm.domain.TrackVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrackService {

    /**
     * 添加意向
     */
    int addTrack(Track track);

    /**
     * 删除意向
     */
    int deleteTrack(int tid);

    /**
     * 修改意向
     */
    int updateTrack(Track track);

    /**
     * 查询所有意向
     */
    List<TrackVo> findAllTrack();

    /**
     * 通过tid查询单个意向
     */
    Track findOneTrack(int tid);
}
