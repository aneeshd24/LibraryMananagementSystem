
package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class aboutUs extends JFrame{

	private static final long serialVersionUID = 1L;//auto generated default
	
	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
            
            ImageIcon iconLogoMain  = new ImageIcon(ClassLoader.getSystemResource("icons/aboutUs.png"));
            Image imageLogoMain = iconLogoMain.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT);
            setIconImage(imageLogoMain);
            
            setLocationRelativeTo(null);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l3 = new JLabel("Digital Library Management");
            l3.setForeground(new Color(52, 73, 94));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
            l3.setBounds(180, 10, 500, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("System");
            l4.setForeground(new Color(52, 73, 94));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
            l4.setBounds(300, 60, 405, 40);
            contentPane.add(l4);

            JLabel l6 = new JLabel("Developed By");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l6.setBounds(10, 118, 650, 35);
            contentPane.add(l6);
            
            JLabel kaushali = new JLabel("Kaushali Patel: I am a senior majoring in Computer and Information Technology.");
            kaushali.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
            kaushali.setBounds(10, 165, 680, 35);
            kaushali.setForeground(new Color(60, 99, 130));
            contentPane.add(kaushali);
            
            JLabel aneesh_Dundigalla = new JLabel("Kaushali Patel: I am a junior pursuing a computer and IT.");
            aneesh_Dundigalla.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
            aneesh_Dundigalla.setBounds(10, 190, 680, 35);
            aneesh_Dundigalla.setForeground(new Color(56, 173, 169));
            contentPane.add(aneesh_Dundigalla); 
            
            JLabel bhargavi_katuru = new JLabel("Bhargavi Katuru:  I am a junior pursuing a computer and IT.");
            bhargavi_katuru.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
            bhargavi_katuru.setBounds(10, 215, 680, 35);
            bhargavi_katuru.setForeground(new Color(248, 194, 145));
            contentPane.add(bhargavi_katuru);
            
            JLabel simran_bansal = new JLabel("Simran Bansal: I am Junior at P:urdue University and majoring in computer and IT.");
            simran_bansal.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
            simran_bansal.setBounds(10, 240, 680, 35);
            simran_bansal.setForeground(new Color(41, 128, 185));
            contentPane.add(simran_bansal);
            
            
            JLabel l7 = new JLabel("Contact Us : abc@gmail.com");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(10, 285, 600, 34);
            l7.setForeground(new Color(52, 73, 94));
            contentPane.add(l7);

            JLabel l8 = new JLabel("Further Contact at : +91xxxxxxxxxx");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(10, 325, 600, 34);
            l8.setForeground(new Color(52, 73, 94));
            contentPane.add(l8);

            JPanel panel2 = new JPanel();
            panel2.setBorder(new TitledBorder(new LineBorder(new Color(78, 205, 196), 2), "About Us", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(233, 150, 122)));
            panel2.setBounds(5, 5, 670, 470);
            panel2.setBackground(Color.WHITE);
            contentPane.add(panel2);
                
            contentPane.setBackground(Color.WHITE);
	}
        

}

