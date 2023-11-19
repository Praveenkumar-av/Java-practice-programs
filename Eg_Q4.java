// Develop a java program that displays moving cars in the applet window.

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Ex7_Q4 extends Applet implements Runnable {
    private int x1, x2;
    private Thread thread;

    public void init() {
        setBackground(Color.white);
        x1 = 0;
        x2 = 0;
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void stop() {
        if (thread != null) {
            thread.stop();
            thread = null;
        }
    }

    public void run() {
        while (true) {
            x1 += 5;
            x2 += 3;
            if (x1 > getWidth()) {
                x1 = -100;
            }
            if (x2 > getWidth()) {
                x2 = -100;
            }
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x1, 50, 100, 50);
        g.setColor(Color.blue);
        g.fillRect(x2, 150, 100, 50);
    }
}
