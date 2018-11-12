package com.fish.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fish on 2018/11/12.
 */
@Component
public class TestJob {

    //    每分钟启动
    @Scheduled(cron = "0 0/1 * * * ?")
    public void timerToNow() {
        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }


}
