import javax.swing.*;
import java.awt.*;

public class BookDonationForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Book Donation Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(new BorderLayout());

        // Panel for the form
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Book Donation Form"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Name
        JLabel nameLabel = new JLabel("Name:");
        JTextField firstName = new JTextField(10);
        JTextField lastName = new JTextField(10);

        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(nameLabel, gbc);
        gbc.gridx = 1;
        panel.add(firstName, gbc);
        gbc.gridx = 2;
        panel.add(lastName, gbc);

        // Email/Phone
        JLabel contactLabel = new JLabel("Email/Phone:");
        JTextField contactField = new JTextField(20);
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(contactLabel, gbc);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panel.add(contactField, gbc);
        gbc.gridwidth = 1;

        // Donation Type
        JLabel donationLabel = new JLabel("Donation Type:");
        String[] donationOptions = {"Books", "E-books"};
        JComboBox<String> donationType = new JComboBox<>(donationOptions);
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(donationLabel, gbc);
        gbc.gridx = 1; gbc.gridwidth = 2;
        panel.add(donationType, gbc);
        gbc.gridwidth = 1;

        // Book Title & Author
        JLabel titleLabel = new JLabel("Book Title:");
        JTextField titleField = new JTextField(10);
        JLabel authorLabel = new JLabel("Author:");
        JTextField authorField = new JTextField(10);

        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(titleLabel, gbc);
        gbc.gridx = 1;
        panel.add(titleField, gbc);
        gbc.gridx = 2;
        panel.add(authorLabel, gbc);
        gbc.gridx = 3;
        panel.add(authorField, gbc);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        gbc.gridx = 1; gbc.gridy = 4; gbc.gridwidth = 2;
        panel.add(submitButton, gbc);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
