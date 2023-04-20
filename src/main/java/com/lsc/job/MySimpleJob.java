package com.lsc.job;

import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySimpleJob implements SimpleJob {
    Logger logger = LoggerFactory.getLogger(MySimpleJob.class);

    @Override
    public void execute(ShardingContext shardingContext) {
        logger.info(String.format("Thread ID: %s, 作业分片总数: %s," + "当前分片项: %s.作业名称: %s",
                Thread.currentThread().getId(),
                shardingContext.getShardingTotalCount(),
                shardingContext.getShardingItem(),
                shardingContext.getJobName()));
    }
}
