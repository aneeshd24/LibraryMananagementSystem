

package librarymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;

public class Signup extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton b1, b2;
    private JComboBox comboBox;


    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

    public Signup() {
        setBounds(600, 250, 606, 406);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(new Color(149, 175, 192));
	contentPane.setLayout(null);
	
	setLocationRelativeTo(null);
	setTitle("Sign Up");
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	ImageIcon iconLogoMain  = new ImageIcon(ClassLoader.getSystemResource("icons/user.png"));
    Image imageLogoMain = iconLogoMain.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT);
    setIconImage(imageLogoMain);

	JLabel lblUsername = new JLabel("Username :");
	lblUsername.setForeground(Color.DARK_GRAY);
	lblUsername.setFont(new Font("Monospaced", Font.BOLD, 14));
	lblUsername.setBounds(99, 86, 92, 26);
	contentPane.add(lblUsername);

	JLabel lblName = new JLabel("Name :");
	lblName.setForeground(Color.DARK_GRAY);
	lblName.setFont(new Font("Monospaced", Font.BOLD, 14));
	lblName.setBounds(99, 123, 92, 26);
	contentPane.add(lblName);

	JLabel lblPassword = new JLabel("Password :");
	lblPassword.setForeground(Color.DARK_GRAY);
	lblPassword.setFont(new Font("Monospaced", Font.BOLD, 14));
	lblPassword.setBounds(99, 160, 92, 26);
	contentPane.add(lblPassword);

	JLabel lblAnswer = new JLabel("Answer :");
	lblAnswer.setForeground(Color.DARK_GRAY);
	lblAnswer.setFont(new Font("Monospaced", Font.BOLD, 14));
	lblAnswer.setBounds(99, 234, 92, 26);
	contentPane.add(lblAnswer);

	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Your NickName?", "Your Lucky Number?",
			"Your child SuperHero?", "Your childhood Name ?" }));
	comboBox.setBounds(265, 202, 148, 20);
	contentPane.add(comboBox);

	JLabel lblSecurityQuestion = new JLabel("Security Question :");
	lblSecurityQuestion.setForeground(Color.DARK_GRAY);
	lblSecurityQuestion.setFont(new Font("Monospaced", Font.BOLD, 14));
	lblSecurityQuestion.setBounds(99, 197, 140, 26);
	contentPane.add(lblSecurityQuestion);

        textField = new JTextField();
	textField.setBounds(265, 91, 148, 20);
        textField.setFont(new Font("Monospaced", Font.BOLD, 14));
	contentPane.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setColumns(10);
        textField_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	textField_1.setBounds(265, 128, 148, 20);
	contentPane.add(textField_1);

        textField_2 = new JTextField();
	textField_2.setColumns(10);
        textField_2.setFont(new Font("Monospaced", Font.BOLD, 14));
	textField_2.setBounds(265, 165, 148, 20);
	contentPane.add(textField_2);

	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(265, 239, 148, 20);
        textField_3.setFont(new Font("Monospaced", Font.BOLD, 14));
	contentPane.add(textField_3);

	b1 = new JButton("Create");
	b1.addActionListener(this);
	b1.setFont(new Font("Monospaced", Font.BOLD, 13));
	b1.setBounds(140, 289, 100, 30);
        b1.setBackground(new Color(34, 166, 179));
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setFont(new Font("Monospaced", Font.BOLD, 13));
	b2.setBounds(300, 289, 100, 30);
	b2.setBackground(new Color(34, 166, 179));
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	JPanel panel = new JPanel();
	panel.setForeground(new Color(34, 139, 34));
	panel.setBorder(new TitledBorder(new LineBorder(new Color(78, 205, 196), 2), "Create Your Account",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setBounds(10, 10, 565, 340);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
    }
    
    public void actionPerformed(ActionEvent ae){
       DAO dao=new DAOImplement();
       if(ae.getSource() == b1)
       {
            String username=textField.getText();
            String name=textField_1.getText();
            String password=textField_2.getText();
            String sec_q=(String) comboBox.getSelectedItem();
            String sec_ans=textField_3.getText();
            Account account=new Account(username,name,password,sec_q,sec_ans);
            boolean isAdded=dao.addAccount(account);
            if (isAdded)
            {
                JOptionPane.showMessageDialog(null, "successfully Created");
                textField.setText("");
                textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
            }

            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Login_user().setVisible(true);
			
            }
    }
}

