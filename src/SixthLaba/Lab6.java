package SixthLaba;

import java.awt.*;
import java.awt.event.*;
class Tenis extends Frame implements Runnable, KeyListener
{
    public void keyPressed(KeyEvent e)
    {
        if ((e.getKeyCode()==KeyEvent.VK_UP) & (rY > 20))
            rY-=10;
        if ((e.getKeyCode()==KeyEvent.VK_DOWN) & (rY < getSize().height- racketHeight))
            rY+=10;
        repaint();
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    int bX, bY; // стартова позиція м'ячика
    int stepx=5, stepy=3;
    int racketHeight = 200, racketWidth = 10; //розміри ракетки;
    int ballWidth, ballHeight; // розміри м'ячика;
    int rY=40, rX = 40; // координати ракетки
    int pause; // скорость
    int level=1, count=0;
    boolean flag=true;
    public void run()
    {
        while (flag)
        {
            try
            {
                bX +=stepx;
                bY +=stepy;
                if ((bX < rX) & (rY < bY) & ((rY+ racketHeight) > bY))
                {
                    stepx=-stepx;
                    count++;
                }
                if (count > 0)
                {
                    pause=(int)(pause-pause/10);
                    racketHeight =(int)(racketHeight - racketHeight /10);
                    count=0;
                    level++;
                    setTitle("Level = "+ level);
                }
                if (bX < 0)
                {
                    flag=false;
                    dispose();
                    System.out.println("Жы есть ?? : "+level);
                    System.exit(0);
                }
                if (bX > getSize().width-20) stepx=-stepx;
                if ((bY < 20)|(bY > getSize().height-20)) stepy=-stepy;
                repaint();
                Thread.sleep(pause);
            }
            catch(InterruptedException e){}
        }
    }
    public void paint(Graphics g)
    {
        g.fillOval(bX, bY,ballWidth,ballHeight);
        g.fillRect(rX,rY,racketWidth, racketHeight);
    }
    public Tenis()
    {
        super("Level 1");
        addKeyListener(this);
        setSize(800,600);
        bX =100;
        bY =120; // стартова позиція м'ячика
        ballWidth = 20;
        ballHeight = 20; // розміри м'ячика;
        pause=10; // скорость
        setVisible(true);
        Thread myThr = new Thread(this);
        myThr.start();
    }
    public Tenis(int xStart, int yStart, int radius, int speed){
        super("Level 1");
        addKeyListener(this);
        setSize(800,600);
        this.bX = xStart;
        this.bY = yStart;
        this.ballWidth = radius;
        this.ballHeight = radius;
        this.pause = speed;
        setVisible(true);
        Thread myThr = new Thread(this);
        myThr.start();
    }
    public static void main (String[] args)
    {
        new Tenis();
    }
}
