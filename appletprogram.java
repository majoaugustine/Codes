import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="appletprogram" width=200 height=60>
</applet>
*/

public class appletprogram extends Applet{
    public void paint(Graphics g){
        g.drawString("hello",30,20);
    }
}