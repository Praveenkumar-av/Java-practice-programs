// Design a digital to analog clock. Get a time from the user in the digital form and display the
// equal analog clock using Applet window

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex7_Q1 extends Applet implements ActionListener {
    TextField hoursField, minutesField, secondsField;
    Button button;
    int hours, minutes, seconds;

    public void init() {
        // Create text fields for input
        hoursField = new TextField(5);
        add(new Label("Hours: "));
        add(hoursField);
        minutesField = new TextField(5);
        add(new Label("Minutes: "));
        add(minutesField);
        secondsField = new TextField(5);
        add(new Label("Seconds: "));
        add(secondsField);

        // Create button to generate chart
        button = new Button("Generate Clock");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Get input from text fields
        hours = Integer.parseInt(hoursField.getText());
        minutes = Integer.parseInt(minutesField.getText());
        seconds = Integer.parseInt(secondsField.getText());

        // Repaint the applet to display the clock
        repaint();
    }

    public void paint(Graphics g) {
        // Draw the clock
        int x = 200;
        int y = 200;
        int radius = 100;
        double angle;

        // Draw the clock face
        g.drawOval(x-radius, y-radius, radius*2, radius*2);

        // Draw the hour hand
        angle = Math.PI/2 - Math.PI/6 * hours - Math.PI/360 * minutes;
        g.setColor(Color.green);
        g.drawLine(x, y, x + (int)(radius * Math.cos(angle)), y - (int)(radius * Math.sin(angle)));

        // Draw the minute hand
        angle = Math.PI/2 - Math.PI/30 * minutes - Math.PI/1800 * seconds;
        g.setColor(Color.red);
        g.drawLine(x, y, x + (int)(radius * Math.cos(angle)), y - (int)(radius * Math.sin(angle)));

        // Draw the second hand
        angle = Math.PI/2 - Math.PI/30 * seconds;
        g.setColor(Color.black);
        g.drawLine(x, y, x + (int)(radius * Math.cos(angle)), y - (int)(radius * Math.sin(angle)));
    }
}