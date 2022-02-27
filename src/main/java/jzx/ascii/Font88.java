package jzx.ascii;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Font88 extends AsciiFont{
    Font88(){
        this.myKind = "8*8";
    }

    @Bean
    public Font88 font(){
        return new Font88();
    }
}
