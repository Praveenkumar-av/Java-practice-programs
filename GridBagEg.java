import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GridBagEg extends JFrame
{
    JPanel main;                                                                                                                
    GridBagConstraints cons;

    JButton submitButton;

    JLabel name;
    JLabel age;
    JLabel address;
    JLabel phNo;
    JLabel dob;

    JTextField namefield;
    JTextField agefield;
    JTextField addressField;
    JTextField phNoField;

    JComboBox dd;
    JComboBox mm;
    JComboBox yyyy;

    GridBagEg()
    {
        main = new JPanel(new GridBagLayout());

        cons = new GridBagConstraints();
        cons.anchor = GridBagConstraints.WEST;
        cons.insets = new Insets(5,5,5,5);

        submitButton = new JButton("Submit");

        name = new JLabel("Name :");
        age = new JLabel("Age :");
        address = new JLabel("Address :");
        phNo = new JLabel("Phone number :");
        dob = new JLabel("Date of Birth :");

        namefield = new JTextField(20);
        agefield = new JTextField(20);
        addressField = new JTextField(20);
        phNoField = new JTextField(20);

        int i;
        dd = new JComboBox();
        for(i=1;i<32;i++)
            dd.addItem(i);
        
        mm = new JComboBox();
        for(i=1;i<13;i++)
            mm.addItem(i);

        yyyy = new JComboBox();
        for(i=1980;i<2024;i++)
            yyyy.addItem(i);

        // Labels
        cons.gridx = 0;
        cons.gridy = 0;
        main.add(name,cons);

        cons.gridx = 0;
        cons.gridy = 1;
        main.add(age,cons);

        cons.gridx = 0;
        cons.gridy = 2;
        main.add(address,cons);

        cons.gridx = 0;
        cons.gridy = 3;
        main.add(phNo,cons);

        cons.gridx = 0;
        cons.gridy = 4;
        main.add(dob,cons);

        // TextFields 
        cons.gridx = 1;
        cons.gridy = 0;
        main.add(namefield,cons);

        cons.gridx = 1;
        cons.gridy = 1;
        main.add(agefield,cons);

        cons.gridx = 1;
        cons.gridy = 2;
        main.add(addressField,cons);

        cons.gridx = 1;
        cons.gridy = 3;
        main.add(phNoField,cons);

        // ComboBox
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.gridx = 1;
        cons.gridy = 4;
        main.add(dd,cons);

        cons.gridx = 2;
        cons.gridy = 4;
        main.add(mm,cons);

        cons.gridx = 3;
        cons.gridy = 4;
        main.add(yyyy,cons);

        // Button
        cons.gridx = 0;
        cons.gridy = 10;
        main.add(submitButton,cons);

        submitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                displayForm();
            }
        });

        add(main);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
    }

    void displayForm()
    {
        main.setVisible(false);

        JPanel form = new JPanel(new GridBagLayout());

        cons.gridx = 0;
        cons.gridy = 0;
        form.add(name,cons);

        cons.gridx = 0;
        cons.gridy = 1;
        form.add(age,cons);

        cons.gridx = 0;
        cons.gridy = 2;
        form.add(address,cons);

        cons.gridx = 0;
        cons.gridy = 3;
        form.add(phNo,cons);

        cons.gridx = 0;
        cons.gridy = 4;
        form.add(dob,cons);

        cons.gridx = 1;
        cons.gridy = 0;
        form.add(new JLabel(namefield.getText()),cons);

        cons.gridx = 1;
        cons.gridy = 1;
        form.add(new JLabel(agefield.getText()),cons);

        cons.gridx = 1;
        cons.gridy = 2;
        form.add(new JLabel(addressField.getText()),cons);

        cons.gridx = 1;
        cons.gridy = 3;
        form.add(new JLabel(phNoField.getText()),cons);

        cons.gridx = 1;
        cons.gridy = 4;
        form.add(new JLabel(dd.getSelectedItem()+"/"+mm.getSelectedItem()+"/"+yyyy.getSelectedItem()),cons);

        add(form);
        form.setSize(800,800);
        form.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        GridBagEg obj = new GridBagEg();
    }
}