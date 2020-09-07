package com.xxl.job.executor.service.jobhandler;

import java.util.Date;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

@Component
public class HelloJobHandler extends IJobHandler {

    @XxlJob("helloJobHandler")
    @Override
    public ReturnT<String> execute(String param) {
        String now = new Date().toString();
        System.out.println(now + "XXL-JOB, Hello World.");
        return SUCCESS;
    }

}