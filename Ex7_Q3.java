// Create a Java program that displays a window with a button. When the button is clicked, a
// message "Button Clicked" should be displayed in a label.
// Extend the previous program to include two buttons, "Red" and "Blue." When the "Red" button
// is clicked, change the background color of the window to red, and when the "Blue" button is
// clicked, change it to blue.

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    Button b1, b2;  
    Label l;
    String msg="";

    MyFrame()
    {
        setLayout(new FlowLayout());

        b1 = new Button("Red");
        b2 = new Button("Blue");

        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        l = new Label("You selected : null");
        add(l);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae)
    {
        msg = ae.getActionCommand();
        l.setText("You selected :"+msg);

        if(msg.equals("Red"))
            this.setBackground(Color.RED);
        else if(msg.equals("Blue"))
            this.setBackground(Color.BLUE);
    }
}

class Ex7_Q3
{
    public static void main(String args[])
    {
        MyFrame f = new MyFrame();
        f.setTitle("My frame");
        f.setSize(500,500);
        f.setVisible(true);
    }
}