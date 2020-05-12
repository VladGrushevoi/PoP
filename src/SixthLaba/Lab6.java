package SixthLaba;

import java.awt.*;
import java.awt.event.*;
class Tenis extends Frame implements Runnable, KeyListener
{
    public void keyPressed(KeyEvent e)
    {
        if ((e.getKeyCode()==KeyEvent.VK_UP) & (rY > 20))
            rY-=10;
        if ((e.getKeyCode()==KeyEvent.VK_DOWN) & (rY < getSize().height-racket))
            rY+=10;
        repaint();
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    int x=100, y=120;
    int stepx=5, stepy=3;
    int racket=200;
    int rY=40;
    int pause=25;
    int level=1, count=0;
    boolean flag=true;
    public void run()
    {
        while (flag)
        {
            try
            {
                x+=stepx;
                y+=stepy;
                if ((x < 50) & (rY < y) & ((rY+racket) > y))
                {
                    stepx=-stepx;
                    count++;
                }
                if (count > 5)
                {
                    pause=(int)(pause-pause/10);
                    racket=(int)(racket-racket/10);
                    count=0;
                    level++;
                    setTitle("Level = "+ level);
                }
                if (x < 0)
                {
                    flag=false;
                    dispose();
                    System.out.println("Жы есть ?? : "+level);
                    System.exit(0);
                }
                if (x > getSize().width-20) stepx=-stepx;
                if ((y < 20)|(y > getSize().height-20)) stepy=-stepy;
                repaint();
                Thread.sleep(pause);
            }
            catch(InterruptedException e){}
        }
    }
    public void paint(Graphics g)
    {
        g.fillOval(x,y,100,100);
        g.fillRect(50,rY,10,racket);
    }
    public Tenis()
    {
        super("Level 1");
        addKeyListener(this);
        setSize(800,600);
        setVisible(true);
        Thread myThr = new Thread(this);
        myThr.start();
    }
    public static void main (String[] args)
    {
        new Tenis();
    }
}
