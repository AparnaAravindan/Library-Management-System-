import javax.swing.*;
import java.awt.*;

public class MenuPage extends JFrame {

    public MenuPage() {
        // Frame setup
        setTitle("Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen

        // Main panel with GridBagLayout for custom positioning
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(240, 248, 255)); // Light background
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15); // spacing

        // Common button style
        Dimension buttonSize = new Dimension(200, 40);
        Font buttonFont = new Font("Arial", Font.BOLD, 14);
        Color buttonBg = new Color(100, 149, 237); // Cornflower blue
        Color buttonFg = Color.WHITE;

        // Buttons
        JButton bookSearchBtn = createStyledButton("Book Search", buttonSize, buttonFont, buttonBg, buttonFg);
        JButton bookIssueBtn = createStyledButton("Book Issue", buttonSize, buttonFont, buttonBg, buttonFg);
        JButton bookDonationBtn = createStyledButton("Book Donation", buttonSize, buttonFont, buttonBg, buttonFg);
        JButton ebookBtn = createStyledButton("E-Book", buttonSize, buttonFont, buttonBg, buttonFg);
        JButton secondHandBtn = createStyledButton("Second Hand Book Selling", buttonSize, buttonFont, buttonBg, buttonFg);
        JButton profileBtn = createStyledButton("Profile", buttonSize, buttonFont, buttonBg, buttonFg);

        // Left side buttons
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(bookSearchBtn, gbc);

        gbc.gridy = 1;
        panel.add(bookIssueBtn, gbc);

        gbc.gridy = 2;
        panel.add(bookDonationBtn, gbc);

        // Right side buttons
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(ebookBtn, gbc);

        gbc.gridy = 1;
        panel.add(secondHandBtn, gbc);

        gbc.gridy = 2;
        panel.add(profileBtn, gbc);

        // Add panel to frame
        add(panel);
        setVisible(true);
    }

    // Helper method to style buttons
    private JButton createStyledButton(String text, Dimension size, Font font, Color bg, Color fg) {
        JButton button = new JButton(text);
        button.setPreferredSize(size);
        button.setFont(font);
        button.setBackground(bg);
        button.setForeground(fg);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuPage::new);
    }
}
