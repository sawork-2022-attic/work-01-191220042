package jzx;


import jzx.ascii.AsciiPanel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.scan("jzx");
        ctx.refresh();

        AsciiPanel panel = ctx.getBean("myAsciiPanel",AsciiPanel.class);
        panel.showFont();



    }
}
