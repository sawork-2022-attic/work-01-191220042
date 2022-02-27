package jzx.ascii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiPanel {
    @Autowired
    private AsciiFont font;

    public void setFont(AsciiFont font) {
        this.font = font;
    }

    public void showFont(){
        this.font.showKind();
    }

    @Bean
    public AsciiPanel myAsciiPanel(){
        return new AsciiPanel();
    }

}
