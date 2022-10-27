package guru99.nosov.mockquizapp.gui;
import javax.swing.*;
import java.awt.*;

public class GUI {

    private static void addComponentsToPane(Container pane) {


    }

    public void createAndShowGUI() {
        JFrame frameQuiz = new JFrame();
        frameQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameQuiz.setSize(600,400);
        addComponentsToPane(frameQuiz.getContentPane());
        frameQuiz.pack();
        frameQuiz.setVisible(true);

    }
}
