package jzx;


import jzx.ascii.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        AsciiPanel panel = ctx.getBean("mypanel",AsciiPanel.class);
        panel.showFont();

    }
}
