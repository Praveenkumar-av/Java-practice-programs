// package sample1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonDemo extends JFrame
{
    JButton next;
    JPanel main;

    public ButtonDemo()
    {
        main = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(5,5,5,5);

        next = new JButton("Next");

        constraints.gridx = 0;
        constraints.gridy = 0;

        main.add(next,constraints);

        next.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                System.out.println("Next button pressed");
                panel2(main);
            }
        });

        this.add(main);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    void panel2(JPanel main)
    {
        main.setVisible(false);
        LabelDemo l = new LabelDemo(this,main);
        this.add(l.p2);
    }
}

class MainPanel1
{
    public static void main(String args[])
    {
        ButtonDemo b = new ButtonDemo();
    }
}