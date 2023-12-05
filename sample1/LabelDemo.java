// package sample1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabelDemo extends JFrame
{
    JButton back;
    JLabel lbl;
    JPanel p2;
    JFrame mainObj;
    JPanel main;

    public LabelDemo(JFrame mainObj,JPanel main)
    {
        this.main = main;
        this.mainObj = mainObj;

        p2 = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.insets = new Insets(5,5,5,5);

        back = new JButton("Back");
        lbl = new JLabel("This is panel 2");

        constraints.gridx = 0;
        constraints.gridy = 0;
        p2.add(back,constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        p2.add(lbl,constraints);

        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                System.out.println("Back button pressed");
                panel1(p2);
            }
        });

        p2.setSize(400,400);
        p2.setVisible(true);
    }

    void panel1(JPanel p2)
    {
        mainObj.remove(p2);
        main.setVisible(true);
    }
}

// class Panel2
// {
//     public static void main(String args[])
//     {
//         LabelDemo b = new LabelDemo();
//     }
// }