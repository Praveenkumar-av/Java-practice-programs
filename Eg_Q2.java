// 2.	Develop the program that displays a 10-by-IO square matrix as shown in below figure. 
// Each element in the matrix is O or 1.

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Ex7_Q2 extends Frame {
    private int[][] matrix = new int[10][10];

    public Ex7_Q2() {
        setTitle("10-by-10 Matrix");
        setSize(500, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        // fill the matrix with random 0s and 1s
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(2);
            }
        }
    }

    public void paint(Graphics g) {
        int x = 50, y = 50;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    g.fillRect(x, y, 30, 30);
                } 
                else {
                    g.drawRect(x, y, 30, 30);
                }
                x += 35;
            }
            x = 50;
            y += 35;
        }
    }

    public static void main(String[] args) {
        new Ex7_Q2();
    }
}
