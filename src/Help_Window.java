import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Help_Window extends JFrame {
    public Help_Window() {
        JFrame f = new JFrame("Help");
        f.getContentPane().setBackground(Color.yellow);

        JLabel l1 = new JLabel("How To Play");
        l1.setBounds(150, 25, 600, 60);
        l1.setForeground(new Color(25,25,112));
        l1.setFont(new Font("Serif", Font.BOLD, 40));
        f.add(l1);

        JLabel l2 = new JLabel("Guess the Wordle in 6 tries.");
        l2.setBounds(150, 95, 600, 50);
        l2.setFont(new Font("Arial", Font.BOLD, 35));
        f.add(l2);

        JLabel l3 = new JLabel("|?|  Each guess must be a valid 5-letter word.");
        l3.setBounds(150, 150, 600, 35);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        f.add(l3);

        JLabel l4 = new JLabel("|?|  The colour  of the tiles will change to show");
        l4.setBounds(150, 185, 600, 35);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        f.add(l4);

        JLabel l5 = new JLabel("      how close your guess was to the word.");
        l5.setBounds(150, 220, 600, 35);
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        f.add(l5);

        JLabel l6 = new JLabel(
                "<html>=> When the tile turns <font color='rgb(0,255,0)'>GREEN</font>, it shows a right</html>");
        l6.setBounds(150, 275, 600, 35);
        l6.setFont(new Font("Arial", Font.BOLD, 20));
        l6.setForeground(Color.white);
        l6.setOpaque(true);
        l6.setBackground(Color.black);
        f.add(l6);

        JLabel l7 = new JLabel("        letter in the right spot.");
        l7.setBounds(150, 310, 600, 35);
        l7.setFont(new Font("Arial", Font.BOLD, 20));
        l7.setForeground(Color.white);
        l7.setOpaque(true);
        l7.setBackground(Color.black);
        f.add(l7);

        JLabel l8 = new JLabel(
                "<html>=>       When the tile turns <font color='yellow'>YELLOW</font>, it shows a right</html>");
        l8.setBounds(150, 345, 600, 35);
        l8.setFont(new Font("Arial", Font.BOLD, 20));
        l8.setForeground(Color.white);
        l8.setBackground(Color.black);
        l8.setOpaque(true);
        l8.setBackground(Color.black);
        f.add(l8);

        JLabel l9 = new JLabel("        letter in the wrong spot.");
        l9.setBounds(150, 380, 600, 35);
        l9.setFont(new Font("Arial", Font.BOLD, 20));
        l9.setForeground(Color.white);
        l9.setOpaque(true);
        l9.setBackground(Color.black);
        f.add(l9);

        JLabel l10 = new JLabel(
                "<html>=>  When the tile remains <font color='rgb(169,169,169)'>GRAY</font>, it shows the letter</html>");
        l10.setBounds(150, 415, 600, 35);
        l10.setFont(new Font("Arial", Font.BOLD, 20));
        l10.setForeground(Color.white);
        l10.setOpaque(true);
        l10.setBackground(Color.black);
        f.add(l10);

        JLabel l11 = new JLabel("        doesn't exist in any spot.");
        l11.setBounds(150, 450, 600, 35);
        l11.setFont(new Font("Arial", Font.BOLD, 20));
        l11.setForeground(Color.white);
        l11.setOpaque(true);
        l11.setBackground(Color.black);
        f.add(l11);

        JButton b = new JButton("BACK TO PLAY");
        b.setBounds(330, 600, 200, 50);
        b.setBackground(Color.BLACK);
        b.setFont(new Font("Arial", Font.BOLD, 20));
        b.setForeground(Color.WHITE);
        f.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main_file();
                f.dispose();
            }
        });

        f.setLayout(null);
        f.setSize(900, 900);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Help_Window();
    }
}
