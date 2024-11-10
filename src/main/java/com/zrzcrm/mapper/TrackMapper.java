package com.zrzcrm.mapper;

import com.zrzcrm.domain.Track;

import java.util.List;

public interface TrackMapper {
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
    List<Track> findAllTrack();

    /**
     * 通过tid查询单个意向
     */
    Track findOneTrack(int tid);
}
