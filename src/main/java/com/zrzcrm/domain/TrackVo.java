package com.zrzcrm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName：
 * Description：
 *
 * @author：坏人曹怼怼
 * @date：2022/2/22 15:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackVo {
    private int tid;
    private Customer customer;
    private Emp emp;
    private String record;
    private String intention;
}
