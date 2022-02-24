package jzx.ascii;

public class AsciiPanel {
    private AsciiFont font;

    public void setFont(AsciiFont font) {
        this.font = font;
    }

    public void showFont(){
        this.font.showKind();
    }
}
