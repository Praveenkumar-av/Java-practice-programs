// Create a program with a combo box (drop-down list) containing three items: "Option 1," "Option
// 2," and "Option 3." When an item is selected from the combo box, display the selected item in a
// label.
// Add a "Submit" button to the program. When the button is clicked, display a message based on
// the selected item in the combo box. For example, if "Option 1" is selected, display "You chose
// Option 1."

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    Choice c1;
    String msg;
    Button b1;

    MyFrame()
    {
        setLayout(new FlowLayout());

        c1 = new Choice();

        c1.add("Option 1");
        c1.add("Option 2");
        c1.add("Option 3");

        add(c1);

        b1 = new Button("Submit");

        add(b1);

        b1.addActionListener(this);

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
        if(ae.getActionCommand().equals("Submit"))
        {
            repaint();
        }
    }

    public void paint(Graphics g)
    {
        msg = "You chose :";
        msg += c1.getItem(c1.getSelectedIndex());
        g.drawString(msg,20,100);
    }
}

class Ex7_Q2
{
    public static void main(String args[])
    {
        MyFrame f1 = new MyFrame();
        f1.setTitle("My frame");
        f1.setSize(400,400);
        f1.setVisible(true);
    }
}