import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
public class T2 extends Applet{
public void paint(Graphics g){drawLines(g);}
public void drawLines(Graphics g){
Color bluecolor=new Color(0,0,255);
g.setColor(bluecolor);
g.drawLine(50,50,150,150);
g.drawRect(80,80,180,180);
g.drawArc(20,20,100,50,60,120);
int[]x={100,200,300,100};
int[]y={400,300,200,400};
g.drawPolygon(x,y,4);
}}