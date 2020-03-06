package com.yan.crowdfunding.listener;

import com.yan.crowdfunding.utils.Const;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author
 * @date 2020/3/6 12:01
 */
public class SystemListener implements ServletContextListener {

    /**
     * servlet启动时执行的方法
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        String path = servletContext.getContextPath();

        /**
         * 把上下文路径存放到application域对象中
         */
        servletContext.setAttribute(Const.PATH,path);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
