// Program for login page
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.*;

class LoginDemo extends JFrame
{
    JPanel login_panel;
    JPanel signInPanel;
    JPanel signUpPanel;

    public LoginDemo()
    {
        login_panel = new JPanel(new GridBagLayout());

        GridBagConstraints cons = new GridBagConstraints();

        cons.insets = new Insets(2,2,4,4);

        // Labels
        JLabel email_lbl, password_lbl, title1, title2, signin_lbl, signup_lbl;

        JTextField email, password;

        JButton signin, join;

        signin_lbl = new JLabel("Sign In");
        signin_lbl.setFont(new Font("Arial", Font.PLAIN,26));
        signin_lbl.setForeground(Color.gray);

        email_lbl = new JLabel(" EMAIL");
        email_lbl.setFont(new Font("Arial", Font.PLAIN,12));
        email_lbl.setForeground(Color.lightGray);

        password_lbl = new JLabel("PASSWORD");
        password_lbl.setFont(new Font("Arial", Font.PLAIN,12));
        password_lbl.setForeground(Color.lightGray);

        signup_lbl = new JLabel("Sign Up");
        signup_lbl.setFont(new Font("Arial", Font.PLAIN,26));
        signup_lbl.setForeground(Color.gray);

        title1 = new JLabel("  Not a member of");
        title1.setFont(new Font("Arial", Font.ITALIC,15));
        title1.setForeground(Color.black);

        title2 = new JLabel("  TigerFire community");
        title2.setFont(new Font("Arial", Font.ITALIC,15));
        title2.setForeground(Color.black);

        // Text area
        email = new JTextField(25);
        password = new JTextField(25);

        // Buttons
        signin = new JButton("Sign in");

        join = new JButton("Join");

        // Arranging the components
        cons.anchor = GridBagConstraints.FIRST_LINE_START;
        cons.ipady = 10;

        cons.gridx = 0;
        cons.gridy = 0;
        login_panel.add(signin_lbl,cons);

        cons.anchor = GridBagConstraints.LINE_START;
        cons.gridx = 0;
        cons.gridy = 1;
        login_panel.add(email_lbl,cons);

        cons.gridx = 0;
        cons.gridy = 2;
        login_panel.add(email,cons);

        cons.gridx = 0;
        cons.gridy = 3;
        login_panel.add(email,cons);

        cons.gridx = 0;
        cons.gridy = 4;
        login_panel.add(password_lbl,cons);

        cons.gridx = 0;
        cons.gridy = 5;
        login_panel.add(password,cons);

        cons.gridx = 0;
        cons.gridy = 6;
        login_panel.add(new JLabel(""),cons);

        cons.anchor = GridBagConstraints.CENTER;

        cons.gridx = 0;
        cons.gridy = 7;
        login_panel.add(signin,cons);

        cons.gridheight = 2;
        cons.ipadx = 20;

        cons.gridx = 1;
        cons.gridy = 0;
        login_panel.add(signup_lbl,cons);

        cons.gridx = 1;
        cons.gridy = 1;
        login_panel.add(new JLabel(""),cons);

        cons.gridx = 1;
        cons.gridy = 2;
        login_panel.add(title1,cons);

        cons.gridx = 1;
        cons.gridy = 3;
        login_panel.add(title2,cons);

        cons.gridx = 1;
        cons.gridy = 4;
        login_panel.add(new JLabel(""),cons);

        cons.gridx = 1;
        cons.gridy = 5;
        login_panel.add(join,cons);

        signin.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                callSignIn();
            }
        });

        join.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                callSignUp();
            }
        });

        // customize login_panel
        login_panel.setSize(500,500);
        login_panel.setVisible(true);

        // add login_panel to JFrame
        this.add(login_panel);
    }

    // this method is called when sign in button is clicked
    void callSignIn()
    {
        login_panel.setVisible(false);
        signInPanelMethod();
    }

    // this method called when join buttin is clicked
    void callSignUp()
    {
        login_panel.setVisible(false);
        signUpPanelMethod();
    }

    // sign in panel method
    void signInPanelMethod()
    {
        signInPanel = new JPanel(new GridBagLayout());


    }

    // sign up panel method
    void signUpPanelMethod()
    {
        signUpPanel = new JPanel(new GridBagLayout());

        GridBagConstraints cons = new GridBagConstraints();

        JTextField email, password, phone, address, dob;

        JLabel email_lbl, password_lbl, phone_lbl, address_lbl, dob_lbl, gender_lbl, title1;

        JComboBox dd, mm, yyyy, gender;

        JButton create, back;

        title1 = new JLabel("Enter the details ");
        title1.setFont(new Font("Arial", Font.PLAIN,25));
        title1.setForeground(Color.gray);

        email_lbl = new JLabel("Email");
        email_lbl.setFont(new Font("Arial", Font.PLAIN,16));
        email_lbl.setForeground(Color.gray);

        password_lbl = new JLabel("Password");
        password_lbl.setFont(new Font("Arial", Font.PLAIN,16));
        password_lbl.setForeground(Color.gray);

        phone_lbl = new JLabel("Phone");
        phone_lbl.setFont(new Font("Arial", Font.PLAIN,16));
        phone_lbl.setForeground(Color.gray);

        address_lbl = new JLabel("Address");
        address_lbl.setFont(new Font("Arial", Font.PLAIN,16));
        address_lbl.setForeground(Color.gray);

        dob_lbl = new JLabel("Date of Birth");
        dob_lbl.setFont(new Font("Arial", Font.PLAIN,16));
        dob_lbl.setForeground(Color.gray);

        gender_lbl = new JLabel("Gender");
        gender_lbl.setFont(new Font("Arial", Font.PLAIN,16));
        gender_lbl.setForeground(Color.gray);

        email = new JTextField(25);
        password = new JTextField(25);
        phone = new JTextField(25);
        address = new JTextField(25);
        dob = new JTextField(25);

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

        gender = new JComboBox();
        gender.addItem("Male");
        gender.addItem("Female");
        gender.addItem("others");

        create = new JButton("Create");
        back = new JButton("Go Back");

        cons.gridwidth = 2;
        cons.anchor = GridBagConstraints.CENTER;

        cons.gridx = 0;
        cons.gridy = 0;
        signUpPanel.add(title1,cons);

        cons.gridx = 0;
        cons.gridy = 1;
        signUpPanel.add(new JLabel("---------------------------------------------"),cons);

        cons.insets = new Insets(5,5,5,5);
        cons.ipady = 10;
        cons.anchor = GridBagConstraints.WEST;
        cons.gridwidth = 1;

        cons.gridx = 0;
        cons.gridy = 2;
        signUpPanel.add(email_lbl,cons);

        cons.gridx = 0;
        cons.gridy = 3;
        signUpPanel.add(password_lbl,cons);

        cons.gridx = 0;
        cons.gridy = 4;
        signUpPanel.add(phone_lbl,cons);
        
        cons.gridx = 0;
        cons.gridy = 5;
        signUpPanel.add(address_lbl,cons);

        cons.gridx = 0;
        cons.gridy = 6;
        signUpPanel.add(dob_lbl,cons);
        
        cons.gridx = 0;
        cons.gridy = 7;
        signUpPanel.add(gender_lbl,cons);

        cons.gridwidth = 3;

        cons.gridx = 1;
        cons.gridy = 2;
        signUpPanel.add(email,cons);

        cons.gridx = 1;
        cons.gridy = 3;
        signUpPanel.add(password,cons);

        cons.gridx = 1;
        cons.gridy = 4;
        signUpPanel.add(phone,cons);


        cons.gridx = 1;
        cons.gridy = 5;
        signUpPanel.add(address,cons);

//        cons.gridx = 1;
//        cons.gridy = 4;
//        signUpPanel.add(dob,cons);

        cons.gridwidth = 1;

        cons.fill = GridBagConstraints.NONE;
        cons.gridx = 1;
        cons.gridy = 6;
        signUpPanel.add(dd,cons);

        cons.gridx = 2;
        cons.gridy = 6;
        signUpPanel.add(mm,cons);

        cons.gridx = 3;
        cons.gridy = 6;
        signUpPanel.add(yyyy,cons);

//        Container c  = this.getContentPane();
//        dd.setBounds(178,275,50,30);
//        c.add(dd);
//
//        mm.setBounds(240,275,50,30);
//        c.add(mm);
//
//        yyyy.setBounds(310,275,70,30);
//        c.add(yyyy);


        cons.gridx = 1;
        cons.gridy = 7;
        signUpPanel.add(gender,cons);

        cons.gridx = 1;
        cons.gridy = 8;
        signUpPanel.add(new JLabel("  "),cons);

        cons.gridx = 1;
        cons.gridy = 9;
        signUpPanel.add(create,cons);

        cons.gridx = 3;
        cons.gridy = 9;
        signUpPanel.add(back,cons);

        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            //     try {
            //         // connecting to mysql database
            //         DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tigerfirejet?user=root&password=2077");
            //         Statement stmt = con.createStatement();
            //         PreparedStatement ps;

            //         String em, pass, ph, addr, date, gen;

            //         em = email.getText();
            //         pass = password.getText();
            //         ph = phone.getText();
            //         addr = address.getText();
            //         date = Integer.toString((int) dd.getSelectedItem()) + " " + Integer.toString((int) mm.getSelectedItem()) + " " + Integer.toString((int) yyyy.getSelectedItem());
            //         gen = (String)gender.getSelectedItem();

            //         System.out.println(em);
            //         System.out.println(pass);
            //         System.out.println(ph);
            //         System.out.println(addr);
            //         System.out.println(date);
            //         System.out.println(gen);

            //         if (em.equals("") || pass.equals("") || ph.equals("") || addr.equals("") || gen.equals("")) {
            //             System.out.println("No");
            //         }
            //         else
            //         {
            //             ps = con.prepareStatement("INSERT INTO `tigerfirejet`.`user_details` (`email`, `password`, `phone_no`, `address`, `dob`, `gender`) VALUES (?,?,?,?,?,?)");
            //             ps.setString(1,em);
            //             ps.setString(2,pass);
            //             ps.setString(3,ph);
            //             ps.setString(4,addr);
            //             ps.setString(5,date);
            //             ps.setString(6,gen);

            //             int na = ps.executeUpdate();
            //             System.out.println(na+" row inserted");
            //         }

            //         con.close();
            //     }
            //     catch(Exception e)
            //     {
            //         System.out.println("Error occurred while executing");
            //         e.printStackTrace();
            //     }
            }
        });

        signUpPanel.setSize(500,500);
        signUpPanel.setVisible(true);

        this.add(signUpPanel);
    }
}

public class Login
{
    public static void main(String args[])
    {
        LoginDemo obj = new LoginDemo();
        obj.setTitle("Login page");
        obj.setSize(500,500);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
