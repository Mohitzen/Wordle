import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main_file extends JFrame{
    public Main_file() {
        JFrame f = new JFrame("Welcome to Wordle");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(127,255,0));


        JLabel l1 = new JLabel("WORDLE CLONE");
        l1.setBounds(160, 100, 600, 200);
        l1.setFont(new Font("Sans Serif", Font.BOLD, 60));
        l1.setForeground(new Color(25,25,112));

        JButton b1=new JButton("PLAY");
        b1.setBounds(380,400,100,50);
        b1.setBackground(Color.BLACK);
        b1.setSize(100, 50);
        b1.setFont(new Font("Serif",Font.BOLD, 20));
        b1.setForeground(Color.WHITE);

        JButton b2=new JButton("HELP");
        b2.setBounds(380,500,100,50);
        b2.setBackground(Color.BLACK);
        b2.setSize(100, 50);
        b2.setFont(new Font("Serif",Font.BOLD, 20));
        b2.setForeground(Color.WHITE);


        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new Game_Area();
                f.dispose();
            }
        });

        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new Help_Window();
                f.dispose();
            }
        });


        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.setLayout(null);
        f.setSize(900, 900);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Main_file();
    }

}






