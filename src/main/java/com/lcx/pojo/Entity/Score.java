package com.lcx.pojo.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Score {

    private int id;
    private int signNum;
    private int uid;
    private String contestantName;
    private int sid;
    private int jid;
    private String judgementName;
    private int score;

}
