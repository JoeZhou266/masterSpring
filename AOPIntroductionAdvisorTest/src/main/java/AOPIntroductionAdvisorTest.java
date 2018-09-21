package com.zjg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zjg.ForumService;
import com.zjg.Monitorable;

public class AOPIntroductionAdvisorTest {

    public static void main(String[] args) {
        testBeforeAdviceByCode();
    }

    private static void testBeforeAdviceByCode() {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("aop.xml");
        ForumService forumService = (ForumService) ctx.getBean("forumService");
        forumService.removeForum(10);
        forumService.removeTopic(1022);
        Monitorable moniterable = (Monitorable) forumService;
        moniterable.setMonitorActive(true);
        forumService.removeForum(10);
        forumService.removeTopic(1022);

    }
}
