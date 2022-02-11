import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class App extends JFrame {
    public static void main(String[] args) throws IOException {
        ProfilView profilView = new ProfilView();
        JFrame frame = new JFrame("STU.ART");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(600,600);
        ImageIcon image = new ImageIcon("Stuart.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0xFFFFFFF));

        frame.add(profilView.show());
        frame.setVisible(true);

    }
}
