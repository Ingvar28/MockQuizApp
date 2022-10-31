package guru99.nosov.mockquizapp.gui;
import javax.swing.*;
import java.awt.*;

public class GUI {

    private static final int frameWidth = 600;
    private static final int frameHeight = 350;



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

    private static Dimension getScreenSize() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        return toolkit.getScreenSize();
    }

    private static void getQuizFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(getScreenSize().width/2 - frameWidth/2,
                getScreenSize().height/2 - frameHeight/2,frameWidth,frameHeight);

        //frame.setIconImage();
        // addComponentsToPane(frame.getContentPane());
        // frame.pack();
        frame.setVisible(true);


    }

    public void createAndShowGUI() {
        getQuizFrame();
    }
}
