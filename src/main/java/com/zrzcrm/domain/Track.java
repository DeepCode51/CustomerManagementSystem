package com.zrzcrm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Track {
    private int tid;
    private int cid;
    private int eid;
    private String record;
    private String intention;
}
