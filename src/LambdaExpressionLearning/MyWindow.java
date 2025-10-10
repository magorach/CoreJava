package LambdaExpressionLearning;

import javax.swing.*;

public class MyWindow {
    public static void main(String[] args) {

        //window - object JFrame
        JFrame jFrame = new JFrame("My Window");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        // button create
        JButton jButton = new JButton("Click me !");

        jFrame.add(jButton);
    }
}
