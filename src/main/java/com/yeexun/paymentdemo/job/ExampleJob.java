package com.yeexun.paymentdemo.job;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class ExampleJob {
    public static void main(String[] args) throws Exception {

        SchedulerFactory schedFact = new StdSchedulerFactory();
        //任务调度器
        Scheduler sched = schedFact.getScheduler();

        sched.start(); //触发 trigger

        JobDetail job = JobBuilder.newJob(HelloJob.class)
                .withIdentity("dummyJobName", "group1").build();

        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("dummyTriggerName", "group1")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever()).build();

        sched.scheduleJob(job, trigger);
    }

}
/**
 * JobDetail 定义Jobs的实例，里面包含了Job的所有信息：名称、所属的组，Job的类等.
 *
 * Tigger	任务的触发器，由它来定义计划，规定Job何时被触发执行
 *
 * Scheduler 生命周期是从 SchedulerFactory 创建它开始，直到 Scheduler 调用 shutdown 方法时结束；
 *
 * Scheduler 被创建后，可以增加、删除和列举 Job 和 Tigger，以及执行其他调度相关操作（如暂停 Tigger）但是，Scheduler
 * 只有在调用 start() 方法后才会真正的触发 tirgger。
 *
 * 当 job 的一个 tigger 被触发后，execute() 方法会被 Scheduler 的一个工作线程调用；
 *
 */
















