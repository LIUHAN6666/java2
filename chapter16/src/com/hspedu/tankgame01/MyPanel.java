package com.hspedu.tankgame01;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyTank mytank = null;

    public MyPanel() {
        setBackground(Color.BLACK);
        mytank = new MyTank(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 100, 750);
        drawTank(mytank.getX(),mytank.getY(),g,0,0);
        drawTank(mytank.getX()+100,mytank.getY(),g,0,1);
    }

    public void drawTank(int x,int y,Graphics g, int direct,int type){
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
       switch(direct)  {
           case 0:
               g.fill3DRect(x,y,10,60,false);
               g.fill3DRect(x+30,y,10,60,false);
               g.fill3DRect(x+10,y+10,20,40,false);
               g.fillOval(x+10,y+20,20,20);
               g.drawLine(x+20,y+30,x+20,y);

               break;
           default:
               System.out.println("暂时不处理");
       }
    }
}
