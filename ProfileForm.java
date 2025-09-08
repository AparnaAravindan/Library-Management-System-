import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProfileForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Profile Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Use GridBagLayout for neat alignment
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // padding
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Labels and TextFields
        JLabel lblFirstName = new JLabel("First Name:");
        JTextField txtFirstName = new JTextField(15);

        JLabel lblLastName = new JLabel("Last Name:");
        JTextField txtLastName = new JTextField(15);

        JLabel lblUsername = new JLabel("Username:");
        JTextField txtUsername = new JTextField(15);

        JLabel lblPhone = new JLabel("Phone Number:");
        JTextField txtPhone = new JTextField(15);

        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField(15);

        JButton btnSubmit = new JButton("Submit");

        // Add components (row by row)
        gbc.gridx = 0; gbc.gridy = 0; panel.add(lblFirstName, gbc);
        gbc.gridx = 1; panel.add(txtFirstName, gbc);

        gbc.gridx = 0; gbc.gridy = 1; panel.add(lblLastName, gbc);
        gbc.gridx = 1; panel.add(txtLastName, gbc);

        gbc.gridx = 0; gbc.gridy = 2; panel.add(lblUsername, gbc);
        gbc.gridx = 1; panel.add(txtUsername, gbc);

        gbc.gridx = 0; gbc.gridy = 3; panel.add(lblPhone, gbc);
        gbc.gridx = 1; panel.add(txtPhone, gbc);

        gbc.gridx = 0; gbc.gridy = 4; panel.add(lblEmail, gbc);
        gbc.gridx = 1; panel.add(txtEmail, gbc);

        gbc.gridx = 1; gbc.gridy = 5; panel.add(btnSubmit, gbc);

        // Add panel to frame
        frame.add(panel);

        // Submit button action
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "Profile Information:\n" +
                        "First Name: " + txtFirstName.getText() + "\n" +
                        "Last Name: " + txtLastName.getText() + "\n" +
                        "Username: " + txtUsername.getText() + "\n" +
                        "Phone Number: " + txtPhone.getText() + "\n" +
                        "Email: " + txtEmail.getText());
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}