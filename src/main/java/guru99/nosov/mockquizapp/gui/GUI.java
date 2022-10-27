package guru99.nosov.mockquizapp.gui;
import javax.swing.*;
import java.awt.*;

public class GUI {

    private static void addComponentsToPane(Container pane) {
        pane.setLayout(new FlowLayout());

        JLabel questionText = new JLabel("Que1: Which one among these is not datatype");
        pane.add(questionText);

        JRadioButtonMenuItem answerCheckBox1 = new JRadioButtonMenuItem("int");
        pane.add(answerCheckBox1);

        JRadioButtonMenuItem answerCheckBox2 = new JRadioButtonMenuItem("Float");
        pane.add(answerCheckBox2);

        JCheckBox answerCheckBox3 = new JCheckBox("boolean");
        pane.add(answerCheckBox3);

        JCheckBox answerCheckBox4 = new JCheckBox("char");
        pane.add(answerCheckBox4);

        JButton nextButton = new JButton("Next");
        pane.add(nextButton);

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
