package com.lcx.common.util;


public class RedisUtil {

    public static final String SUPERVISE_KEY = "supervise";
    public static final String SUPERVISE_OPEN = "1";
    public static final String SUPERVISE_CLOSE = "0";
    public static final String RATE_TIMES = "rate_times";
    public static final String RATE_NUMS = "rate_nums";

    public static String getProcessKey(String group, String zone) {
        return "process" + ":" + group + ":" + zone;
    }

    public static String getProcessValue(String process, String step) {
        return process + ":" + step;
    }

    public static String getRateTimesKey(int uid) {
        return RATE_TIMES + ":" + uid;
    }

    public static String getRateNumsKey(String group, String zone) {
        return RATE_NUMS + ":" + group + ":" + zone;
    }

    public static String getSignGroupsKey(String group, String zone) {
        return "sign_groups" + ":" + group + ":" + zone;
    }

    public static String getSignsKey(String group, String zone) {
        return "signs" + ":" + group + ":" + zone;
    }

    public static String stringNumAddOne(String num) {
        return num == null ? "1" : String.valueOf(Integer.parseInt(num) + 1);
    }
}
