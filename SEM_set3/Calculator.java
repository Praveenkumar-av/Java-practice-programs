import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalaculatorFrame extends JFrame implements ActionListener
{
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, clear, add, sub, mult, div, result;
    JTextField display;

    boolean first = true;

    int val1=0, val2=0;
    String val="", op = "";
    CalaculatorFrame()
    {
        JPanel main = new JPanel(new GridBagLayout());

        GridBagConstraints cons = new GridBagConstraints();

        cons.insets = new Insets(5,5,3,3);

        cons.gridwidth = 4;

        display = new JTextField(20);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        clear = new JButton("Clear");
        result = new JButton("Ans");
        add = new JButton("+");
        sub = new JButton("-");
        mult = new JButton("*");
        div = new JButton("/");

        cons.gridx = 0;
        cons.gridy = 0;
        main.add(display,cons);

        cons.gridwidth = 1;

        cons.gridx = 0;
        cons.gridy = 1;
        main.add(b1,cons);

        cons.gridx = 1;
        cons.gridy = 1;
        main.add(b2,cons);

        cons.gridx = 2;
        cons.gridy = 1;
        main.add(b3,cons);

        cons.gridx = 0;
        cons.gridy = 2;
        main.add(b4,cons);

        cons.gridx = 1;
        cons.gridy = 2;
        main.add(b5,cons);

        cons.gridx = 2;
        cons.gridy = 2;
        main.add(b6,cons);

        cons.gridx = 0;
        cons.gridy = 3;
        main.add(b7,cons);

        cons.gridx = 1;
        cons.gridy = 3;
        main.add(b8,cons);

        cons.gridx = 2;
        cons.gridy = 3;
        main.add(b9,cons);

        cons.gridx = 1;
        cons.gridy = 4;
        main.add(b0,cons);

        cons.gridx = 2;
        cons.gridy = 4;
        main.add(add,cons);

        cons.gridx = 3;
        cons.gridy = 1;
        main.add(sub,cons);

        cons.gridx = 3;
        cons.gridy = 2;
        main.add(mult,cons);

        cons.gridx = 3;
        cons.gridy = 3;
        main.add(div,cons);

        cons.gridx = 0;
        cons.gridy = 4;
        main.add(clear,cons);

        cons.gridx = 3;
        cons.gridy = 4;
        main.add(result,cons);



        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        add.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mult.addActionListener(this);
        clear.addActionListener(this);
        result.addActionListener(this);

        add(main);
        main.setSize(400,400);
        main.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1) val += "1";
        else if(e.getSource() == b2) val += "2";
        else if(e.getSource() == b3) val += "3";
        else if(e.getSource() == b4) val += "4";
        else if(e.getSource() == b5) val += "5";
        else if(e.getSource() == b6) val += "6";
        else if(e.getSource() == b7) val += "7";
        else if(e.getSource() == b8) val += "8";
        else if(e.getSource() == b9) val += "9";
        else if(e.getSource() == b0) val += "0";

        if(e.getSource() == add)
        {
            first = false;
            val = "";
            display.setText("");
            op = "+";
        }
        else if(e.getSource() == sub)
        {
            first = false;
            val = "";
            display.setText("");
            op = "-";
        }
        else if(e.getSource() == mult)
        {
            first = false;
            val = "";
            display.setText("");
            op = "*";
        }
        else if(e.getSource() == div)
        {
            first = false;
            val = "";
            display.setText("");
            op = "/";
        }
        else if(e.getSource() == clear)
        {
            first = true;
            val = "";
            display.setText("");
        }
        else if(e.getSource() == result)
        {
            first = true;
            val = "";
            switch (op)
            {
                case "+" :
                    display.setText(String.valueOf(val1+val2));
                    break;
                case "-" :
                    display.setText(String.valueOf(val1-val2));
                    break;
                case "*" :
                    display.setText(String.valueOf(val1*val2));
                    break;
                case "/" :
                    display.setText(String.valueOf(val1/val2));
                    break;
            }
        }
        else
        {
            display.setText(val);

            if(first) val1 = Integer.parseInt(val);
            else val2 = Integer.parseInt(val);
        }
    }
}

public class Calculator extends JFrame{
    public static void main(String args[])
    {
        CalaculatorFrame c = new CalaculatorFrame();
        c.setName("Calculator");
        c.setSize(400,400);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
