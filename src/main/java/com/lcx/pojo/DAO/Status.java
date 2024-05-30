package com.lcx.pojo.DAO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Status {

    private String status;// 在线 || 离线

    private LocalDateTime time;// 登录时间 || 离线时间

}
