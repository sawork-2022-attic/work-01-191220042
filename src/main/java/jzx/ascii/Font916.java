package jzx.ascii;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Font916 extends AsciiFont{
    Font916(){
        this.myKind = "9*16";
    }

    @Bean
    public Font916 myFont916(){
        return new Font916();
    }
}
