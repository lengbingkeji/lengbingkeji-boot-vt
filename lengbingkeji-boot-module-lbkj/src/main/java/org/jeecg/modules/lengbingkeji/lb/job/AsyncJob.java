package org.jeecg.modules.lengbingkeji.lb.job;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.util.DateUtils;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * ClassName: AsyncJob
 * Package: org.jeecg.modules.lengbingkeji.lb.job
 * Description:
 *
 * @Author lengbing
 * @Create 2023/9/28 9:18
 * @Version 1.0
 */
@Slf4j
public class AsyncJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("------ 测试定时任务:lengbingkeji ------");
        log.info("---- 执行开始，时间：" + DateUtils.now() + " ----");
        try {
            //此处模拟任务执行时间为 5秒，任务表达式配置为每秒执行一次：0/1 * * * * ? *
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            //测试发现 每5秒执行一次
            log.info("---- 执行完毕，时间：" + DateUtils.now() + " ----");
        }
    }
}
