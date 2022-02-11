import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProfilView{
    private JLabel nameLabel;
    private JLabel meritLabel;
    private JLabel passwLabel;
    private JLabel emailLabel;
    private JButton updateEmail;
    private JButton updatePassword;
    private JPanel profilePanel;

    public ProfilView() throws IOException {

        Server server = new Server();
        nameLabel.setText(server.readName()+" "+server.readLastname());
        emailLabel.setText(server.readEmail());
        passwLabel.setText(server.readPassw());
        meritLabel.setText(server.readMerit());



        updateEmail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                try {
                    String newEmail = JOptionPane.showInputDialog("Enter new email");
                    server.updateEmail(newEmail);
                    emailLabel.setText(server.readEmail());

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        updatePassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String newPassw = JOptionPane.showInputDialog("Enter new password");
                    server.updatePassw(newPassw);
                    passwLabel.setText(server.readPassw());

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            }
        });
    }


    public Component show() {
        profilePanel.setBackground(Color.WHITE);



        return profilePanel;
    }



}
