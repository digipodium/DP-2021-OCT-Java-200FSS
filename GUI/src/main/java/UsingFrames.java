import javax.swing.JFrame;
import java.awt.*;

public class UsingFrames {

    public static void main(String[] args) {
        JFrame myframe = new JFrame("My First Frame");
        myframe.setSize(800, 600);
        myframe.setVisible(true);
        myframe.getContentPane().setBackground(Color.cyan);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
