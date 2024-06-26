package com.lcx.pojo.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentScore {
    private int id;
    private String name;
    private String school;
    private String idCard;
    private int session;
    private float score;
    private String prize;

}
