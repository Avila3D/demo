package test;
import javax.swing.JFrame;
import java.awt.*;

public class JFrameTest {

    public static void main(String[] args) {

        //objects
        JFrame frame = new JFrame();
        FrameTest content = new FrameTest();

        //set properties
        frame.setVisible(true);
        frame.setSize(new Dimension(760,480));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(content);
    }

}