import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CA2_Q3_1 extends Frame implements ActionListener
{
    GridBagLayout gbag;
    GridBagConstraints cons;
    TextField display;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;

    Button clearbt;

    Button callbt;

    Button hangbt;

    String str="";

    CA2_Q3_1()
    {
        gbag = new GridBagLayout();
        setLayout(gbag);

        cons = new GridBagConstraints();

        cons.insets = new Insets(3,3,0,0);

        display = new TextField(12);

        cons.gridwidth = 3;
        cons.gridx = 0;
        cons.gridy = 0;
        gbag.setConstraints(display,cons);
        this.add(display);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");
        clearbt = new Button("Clear");
        callbt = new Button(" Call  ");
        hangbt = new Button("Hang up");

        cons.insets = new Insets(3,3,0,0);
        cons.gridwidth = 1;

        cons.gridx = 0;
        cons.gridy = 1;
        gbag.setConstraints(b1,cons);
        this.add(b1);

        cons.gridx = 1;
        cons.gridy = 1;
        gbag.setConstraints(b2,cons);
        this.add(b2);

        cons.gridx = 2;
        cons.gridy = 1;
        gbag.setConstraints(b3,cons);
        this.add(b3);

        cons.gridx = 0;
        cons.gridy = 2;
        gbag.setConstraints(b4,cons);
        this.add(b4);

        cons.gridx = 1;
        cons.gridy = 2;
        gbag.setConstraints(b5,cons);
        this.add(b5);

        cons.gridx = 2;
        cons.gridy = 2;
        gbag.setConstraints(b6,cons);
        this.add(b6);

        cons.gridx = 0;
        cons.gridy = 3;
        gbag.setConstraints(b7,cons);
        this.add(b7);

        cons.gridx = 1;
        cons.gridy = 3;
        gbag.setConstraints(b8,cons);
        this.add(b8);

        cons.gridx = 2;
        cons.gridy = 3;
        gbag.setConstraints(b9,cons);
        this.add(b9);

        cons.gridx = 1;
        cons.gridy = 4;
        gbag.setConstraints(b0,cons);
        this.add(b0);

        cons.gridx = 0;
        cons.gridy = 4;
        gbag.setConstraints(clearbt,cons);
        this.add(clearbt);

        cons.gridx = 2;
        cons.gridy = 4;
        gbag.setConstraints(callbt,cons);
        this.add(callbt);

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
        clearbt.addActionListener(this);
        callbt.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) str+="1";
        else if(e.getSource() == b2) str+="2";
        else if(e.getSource() == b3) str+="3";
        else if(e.getSource() == b4) str+="4";
        else if(e.getSource() == b5) str+="5";
        else if(e.getSource() == b6) str+="6";
        else if(e.getSource() == b7) str+="7";
        else if(e.getSource() == b8) str+="8";
        else if(e.getSource() == b9) str+="9";
        else if(e.getSource() == b0) str+="0";
        else if(e.getSource() == clearbt) str = "";
        else if(e.getSource() == callbt) {
            if(e.getActionCommand().equals("Hang up")) System.exit(0);
            callbt.setLabel("Hang up");
        }

        display.setText(str);

    }

    public static void main(String args[])
    {
        CA2_Q3_1 phone = new CA2_Q3_1();

        phone.setTitle("Phone App");

        phone.setSize(400,400);

        phone.setVisible(true);
    }
}