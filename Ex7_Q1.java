// Create a program that has a window with a "Close" button. When the "Close" button is clicked, it
// should ask the user for confirmation before closing the window. If the user confirms, close the
// window; otherwise, keep it open.
// Extend the program to handle the window's "Minimize" button. When the "Minimize" button is
// clicked, minimize the window to the taskbar.

import java.awt.*;
import java.awt.event.*;

class Frame1 extends Frame
{
    Frame1()
    {
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                Frame2 f2 = new Frame2();
                f2.setTitle("Confirmation");
                f2.setSize(200,200);
                f2.setVisible(true);
            }
        });
    }
}

class Frame2 extends Frame implements ActionListener
{
    Button y, n, b1;

    Frame2()
    {
        y = new Button("Yes");
        n = new Button("No");
        b1 = new Button("Dummy");  // dummy button

        add(y);
        add(n);
        
        y.setBounds(30,80,60,30);
        n.setBounds(30,80,100,30);
        b1.setBounds(120,100,80,40);

        y.addActionListener(this);
        n.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("Yes"))
        {
            System.exit(0);
        }
        else if(ae.getActionCommand().equals("No"))
        {
            dispose();
        }
    }
}

class Ex7_Q1
{
    public static void main(String args[])
    {
        Frame1 f1 = new Frame1();
        f1.setTitle("My frame");
        f1.setSize(400,400);
        f1.setVisible(true);
    }
}