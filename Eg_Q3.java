// Write a java program that uses a bar chart to display the pass percentage of five courses
// for your class using java applets. Get input from the user through the text field.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Ex7_Q3 extends Applet implements ActionListener {
    TextField[] textFields;
    Button button;
    int[] passPercentages;

    public void init() {
        // Create text fields for input
        textFields = new TextField[5];
        for (int i = 0; i < 5; i++) {
            textFields[i] = new TextField(5);
            add(new Label("Course " + (i+1) + " Pass Percentage: "));
            add(textFields[i]);
        }

        // Create button to generate chart
        button = new Button("Generate Chart");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Get input from text fields
        passPercentages = new int[5];
        for (int i = 0; i < 5; i++) {
            passPercentages[i] = Integer.parseInt(textFields[i].getText());
        }

        // Repaint the applet to display the chart
        repaint();
    }

    public void paint(Graphics g) {
        // Draw the bar chart
        int x = 50;
        int y = 50;
        int width = 20;
        int height;
        for (int i = 0; i < 5; i++) {
            height = passPercentages[i] * 2;
            g.fillRect(x, y+200-height, width, height);
            g.drawString("Course " + (i+1), x, y+220);
            x += 50;
        }
    }
}
