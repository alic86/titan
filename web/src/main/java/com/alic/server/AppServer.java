package com.alic.server;

/*import org.apache.catalina.Context;
import org.apache.catalina.Host;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;*/

import javax.servlet.ServletException;
import java.io.File;

/**
 * 应用服务
 *
 * @author suxingzhe
 * @create 2018-04-10 下午10:29
 **/
public class AppServer {
    /*public static void main(String[] args) throws LifecycleException, ServletException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8821);
        Host host = tomcat.getHost();
        host.setName("localhost");
        host.setAppBase("webapps");

        String webApp = System.getProperty("user.dir") + File.separator + "web" + File.separator + "src" + File.separator + "main" + File.separator + "webapp";
        String contextPath = "/";

        Context context = tomcat.addWebapp(contextPath, webApp);
        if(context instanceof StandardContext){
            StandardContext standardContext = (StandardContext)context;
            standardContext.setDefaultWebXml(webApp + File.separator + "conf/web.xml");
        }

        //启动tomcat服务器
        tomcat.start();
        //强制等待tomcat服务器，避免main线程执行结束关闭
        tomcat.getServer().await();
    }*/
}
