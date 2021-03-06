/**  
 * Project Name:StoreManager  
 * File Name:TaskExecutePool.java  
 * Package Name:com.util.ThreadPool  
 * Date:2018年1月30日上午9:16:35  
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.thread;  

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;  

//@Configuration  
//@EnableAsync
public class TaskExecutePool {
//	 @Autowired  
	 private TaskThreadPoolConfig config;  
	  
	 public Executor TaskAsyncPool() {  
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();  
        executor.setCorePoolSize(config.getCorePoolSize());  
        executor.setMaxPoolSize(config.getMaxPoolSize());  
        executor.setQueueCapacity(config.getQueueCapacity());  
        executor.setKeepAliveSeconds(config.getKeepAliveSeconds());  
//        executor.setThreadNamePrefix("MyExecutor-");  
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务  
        // CALLER_RUNS：不在新线程中执行任务，而是由调用者所在的线程来执行  
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());  
        executor.initialize();  
        return executor;  
    }  
}  
  
