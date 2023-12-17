import javax.swing.*;
import java.awt.*;

class Bounce extends JFrame
{
    JPanel main;

    int y = 50, up = 10, down = 360;
    Bounce()
    {
        main = new JPanel(new FlowLayout());

        add(main);
        main.setSize(400,400);
        main.setVisible(true);
    }




    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        g.fillRect(0,0,400,400);


        g.setColor(Color.BLUE);
        g.fillOval(100,y,40,40);
    }
}

class CallPaint implements Runnable
{
    Bounce obj;
    CallPaint(Bounce obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        int j;
        try
        {
            for(int i=1;i<10000;i++) {
                j = i % 200;
                if(j < 100)
                {
                    obj.y += 2;
                }
                else
                {
                    obj.y -= 2;
                }
                obj.repaint();
                Thread.sleep(10);
            }
        }
        catch (Exception ie)
        {
            System.out.print("Interrupted ");
        }
    }
}


public class BallBounce  {
    public static void  main(String args[])
    {
        Bounce ball = new Bounce();
        ball.setTitle("Ball bouncer");
        ball.setSize(400,400);
        ball.setVisible(true);
        ball.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CallPaint cp = new CallPaint(ball);

        Thread t1 = new Thread(cp);
        t1.start();
    }
}