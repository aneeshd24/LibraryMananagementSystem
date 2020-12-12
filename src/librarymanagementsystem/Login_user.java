
package librarymanagementsystem;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import javax.swing.*;

public class Login_user extends JFrame implements ActionListener{

	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
        private JButton b1,b2,b3;
        private String timeZone;
        Font font = new Font("Monospaced", Font.BOLD, 14);

        public Login_user() {
	setBackground(new Color(169, 169, 169));	
        setBounds(600, 300, 600, 400);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        ImageIcon iconLogoMain  = new ImageIcon(ClassLoader.getSystemResource("icons/user.png"));
        Image imageLogoMain = iconLogoMain.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT);
        setIconImage(imageLogoMain);
		
        panel = new JPanel();
	panel.setBackground(new Color(176, 224, 230));
	setContentPane(panel);
	panel.setLayout(null);

	JLabel l1 = new JLabel("Username : ");
	l1.setBounds(124, 89, 95, 30);
        l1.setFont(font);
	panel.add(l1);

	JLabel l2 = new JLabel("Password : ");
	l2.setBounds(124, 124, 95, 30);
        l2.setFont(font);
	panel.add(l2);

	textField = new JTextField();
	textField.setBounds(210, 93, 157, 30);
        l1.setFont(font);
	panel.add(textField);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(210, 128, 157, 30);
        l2.setFont(font);
	panel.add(passwordField);

	JLabel l3 = new JLabel("");
	l3.setBounds(377, 79, 46, 40);
        l3.setFont(font);
	panel.add(l3);

	JLabel l4 = new JLabel("");
	l4.setBounds(377, 124, 46, 40);
        l4.setFont(font);
	panel.add(l3);

	b1 = new JButton("Login");
	b1.addActionListener(this);
                
	b1.setForeground(new Color(46, 139, 87));
	b1.setBackground(new Color(250, 250, 210));
	b1.setBounds(149, 181, 113, 39);
        b1.setFont(font);
	panel.add(b1);
		
        b2 = new JButton("SignUp");
	b2.addActionListener(this);
	
	b2.setForeground(new Color(139, 69, 19));
	b2.setBackground(new Color(255, 235, 205));
	b2.setBounds(289, 181, 113, 39);
        b2.setFont(font);
	panel.add(b2);

	b3 = new JButton("Forgot Password");
	b3.addActionListener(this);
	
        b3.setForeground(new Color(205, 92, 92));
	b3.setBackground(new Color(253, 245, 230));
	b3.setBounds(199, 231, 179, 39);
        b2.setFont(font);
	panel.add(b3);

		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(144, 198, 149));
		panel2.setBounds(10, 10, 565, 330);
		panel.add(panel2);
	}
        
	public Login_user(String timeZone) {
	setBackground(new Color(169, 169, 169));	
        setBounds(600, 300, 600, 400);
        this.timeZone=timeZone;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        ImageIcon iconLogoMain  = new ImageIcon(ClassLoader.getSystemResource("icons/user.png"));
        Image imageLogoMain = iconLogoMain.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT);
        setIconImage(imageLogoMain);
		
        panel = new JPanel();
	panel.setBackground(new Color(176, 224, 230));
	setContentPane(panel);
	panel.setLayout(null);

	JLabel l1 = new JLabel("Username : ");
	l1.setBounds(124, 89, 95, 30);
        l1.setFont(font);
	panel.add(l1);

	JLabel l2 = new JLabel("Password : ");
	l2.setBounds(124, 124, 95, 30);
        l2.setFont(font);
	panel.add(l2);

	textField = new JTextField();
	textField.setBounds(210, 93, 157, 30);
        l1.setFont(font);
	panel.add(textField);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(210, 128, 157, 30);
        l2.setFont(font);
	panel.add(passwordField);

	JLabel l3 = new JLabel("");
	l3.setBounds(377, 79, 46, 40);
        l3.setFont(font);
	panel.add(l3);

	JLabel l4 = new JLabel("");
	l4.setBounds(377, 124, 46, 40);
        l4.setFont(font);
	panel.add(l3);

	b1 = new JButton("Login");
	b1.addActionListener(this);
                
	b1.setForeground(new Color(46, 139, 87));
	b1.setBackground(new Color(250, 250, 210));
	b1.setBounds(149, 181, 113, 39);
        b1.setFont(font);
	panel.add(b1);
		
        b2 = new JButton("SignUp");
	b2.addActionListener(this);
	
	b2.setForeground(new Color(139, 69, 19));
	b2.setBackground(new Color(255, 235, 205));
	b2.setBounds(289, 181, 113, 39);
        b2.setFont(font);
	panel.add(b2);

	b3 = new JButton("Forgot Password");
	b3.addActionListener(this);
	
        b3.setForeground(new Color(205, 92, 92));
	b3.setBackground(new Color(253, 245, 230));
	b3.setBounds(199, 231, 179, 39);
        b2.setFont(font);
	panel.add(b3);

		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(144, 198, 149));
		panel2.setBounds(10, 10, 565, 330);
		panel.add(panel2);
	}
        
       
        public void actionPerformed(ActionEvent ae)
        {
            DAO dao=new DAOImplement();
            if(ae.getSource() == b1){
                if (dao.isValidUser(textField.getText(),passwordField.getText()))
                {
                    this.setVisible(false);
                    new Loading(timeZone).setVisible(true);
                } 
                else
                    JOptionPane.showMessageDialog(null, "Invalid Login...!.");
            }
            if(ae.getSource() == b2){
                setVisible(false);
		Signup su = new Signup();
		su.setVisible(true);
            }   
            if(ae.getSource() == b3)
            {
                setVisible(false);
		Forgot forgot = new Forgot();
		forgot.setVisible(true);
            }
        }
        
  	public static void main(String[] args) {
                new Login_user().setVisible(true);
	}

}
