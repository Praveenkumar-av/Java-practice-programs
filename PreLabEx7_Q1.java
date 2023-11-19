import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ActionListener,MouseListener,KeyListener,FocusListener,ListSelectionListener
{
    JButton b1;
    JLabel lbl1, lbl2, lbl3;
    JTextArea ta;
    JTextField tf;
    JList lst;
    String msg;
    Object arr[];

    MyFrame()
    {
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

        b1 = new JButton("Button 1");
        c.add(b1);

        b1.addActionListener(this);

        lbl1 = new JLabel();
        lbl2 = new JLabel();
        lbl3 = new JLabel();
        c.add(lbl1);
        c.add(lbl2);
        c.add(lbl3);

        ta = new JTextArea("",5,20);
        ta.addMouseListener(this);
        ta.addKeyListener(this);

        c.add(ta);

        tf = new JTextField("Enter here",20);
        tf.addFocusListener(this);
        c.add(tf);

        String items[] = {"India","America","Japan"};
        lst = new JList(items);
        c.add(lst);
        lst.addListSelectionListener(this);
    }
    // Button event
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1) 
            lbl1.setText("Button Clicked!");
    }

    // Mouse event
    public void mouseClicked(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {}
    public void mouseExited(MouseEvent me) {}
    public void mousePressed(MouseEvent me)
    {
        int x, y;
        x = me.getX();
        y = me.getY();
        ta.setText("Mouse position x :"+x+" y :"+y);
    }
    public void mouseReleased(MouseEvent me) {}

    // Key event
    public void keyPressed(KeyEvent ke)
    {
        int keycode = ke.getKeyCode();

        ta.setText(ke.getKeyText(keycode));
    }
    public void keyReleased(KeyEvent ke) {}
    public void keyTyped(KeyEvent ke) {}

    // Text field event
    public void focusGained(FocusEvent fe)
    {
        lbl2.setText("Text field has Focus");
    }

    public void focusLost(FocusEvent fe)
    {
        lbl2.setText("Text field lost focus");
    }

    // List event listener
    public void valueChanged(ListSelectionEvent le)
    {
        arr = lst.getSelectedValues();
        
        for(int i=0;i<arr.length;i++)
            msg += (String)arr[i]+'\n';

        ta.setText("Selected :"+msg);
        msg = "";
    }
}

class PreLabEx7_Q1
{
    public static void main(String args[])
    {
        MyFrame f = new MyFrame();
        f.setTitle("My frame");
        f.setSize(400,400);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}