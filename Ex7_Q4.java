// Define a custom event named "TemperatureChangeEvent." Create a program that has a slider
// representing a temperature control. When the slider value changes, fire the
// "TemperatureChangeEvent" and display the new temperature in a label.
// Implement an event listener for the "TemperatureChangeEvent" that checks whether the
// temperature is above a certain threshold. If it is, change the label text to "Warning: High
// Temperature."

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
class Myslider extends JFrame implements ChangeListener
{
    JSlider js;  // slider
    JLabel jl1;  // JLabel
    JLabel jl2;

    Myslider()
    {
        // create a container
        Container c = this.getContentPane();

        c.setLayout(new FlowLayout());

        // create a label
        jl1 = new JLabel();
        jl2 = new JLabel();
        
        jl2.setForeground(Color.red);

        // create a slider
        js = new JSlider(0,200,120);

        // paint the ticks and tracks 
        js.setPaintTrack(true);
        js.setPaintTicks(true);
        js.setPaintLabels(true);

        // set the spacing
        js.setMajorTickSpacing(50);
        js.setMinorTickSpacing(5);

        // add ChangeListener method to JFrame
        js.addChangeListener(this);

        // add slider to panel
        c.add(js);
        c.add(jl1);
        c.add(jl2);
    }

    // if jslider value is changed
    public void stateChanged(ChangeEvent ce)
    {
        int val = js.getValue();
        jl1.setText("Value of slider is :"+val);
        if(val > 100)
        {
            jl2.setText("Warning : High temperature");
        }
        else 
            jl2.setText("");
    }
}

class Ex7_Q4
{
    public static void main(String args[])
    {
        Myslider obj = new Myslider();

        obj.setTitle("Temperature");

        obj.setSize(400,400);

        obj.setVisible(true);

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}