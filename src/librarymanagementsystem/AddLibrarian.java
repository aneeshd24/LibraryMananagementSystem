package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddLibrarian extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4;
    private JPasswordField t5,t6;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;

    public static void main(String[] args) {
        new AddLibrarian().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(10000 + 1));
    }

    
    public AddLibrarian() {
        super("Add Librarian");
	setBounds(700, 200, 550, 450);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	setLocationRelativeTo(null);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	ImageIcon iconLogoMain  = new ImageIcon(ClassLoader.getSystemResource("icons/logoMain.png"));
    Image imageLogoMain = iconLogoMain.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT);
    setIconImage(imageLogoMain);

	JLabel l1 = new JLabel("Librarian_Code");
	l1.setForeground(new Color(25, 25, 112));
	l1.setFont(new Font("Monospaced", Font.BOLD, 14));
	l1.setBounds(23, 46, 112, 32);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(25, 25, 112));
	l2.setFont(new Font("Monospaced", Font.BOLD, 14));
	l2.setBounds(23, 80, 112, 22);
	contentPane.add(l2);

        JLabel l3 = new JLabel("Age");
	l3.setForeground(new Color(25, 25, 112));
	l3.setFont(new Font("Monospaced", Font.BOLD, 14));
	l3.setBounds(23, 114, 112, 32);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Contact");
	l4.setForeground(new Color(25, 25, 112));
	l4.setFont(new Font("Monospaced", Font.BOLD, 14));
	l4.setBounds(23, 148, 102, 22);
	contentPane.add(l4);

        
	JLabel l5 = new JLabel("Password");
	l5.setForeground(new Color(25, 25, 112));
	l5.setFont(new Font("Monospaced", Font.BOLD, 14));
	l5.setBounds(23, 182, 102, 22);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Confirm Password");
	l6.setForeground(new Color(25, 25, 112));
	l6.setFont(new Font("Monospaced", Font.BOLD, 14));
	l6.setBounds(23, 216, 142, 22);
	contentPane.add(l6);

	t1 = new JTextField();
	t1.setEditable(false);
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Monospaced", Font.BOLD, 14));
	t1.setBounds(269, 46, 156, 20);
	contentPane.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Monospaced", Font.BOLD, 14));
	t2.setColumns(10);
	t2.setBounds(269, 80, 156, 20);
	contentPane.add(t2);

        t3 = new JTextField();
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Monospaced", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(269, 114, 156, 20);
	contentPane.add(t3);
        
        t4 = new JTextField();
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Monospaced", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(269, 148, 156, 20);
	contentPane.add(t4);
        
	t5 = new JPasswordField();
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Monospaced", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(269, 182, 156, 20);
	contentPane.add(t5);

	t6 = new JPasswordField();
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Monospaced", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(269, 216, 156, 20);
	contentPane.add(t6);

	b1 = new JButton("Add");
	b1.addActionListener(this);
	b1.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128)), null));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b1.setBounds(22, 290, 148, 33);
	b1.setBackground(new Color(34, 166, 179));
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBounds(292, 290, 148, 33);
	b2.setBackground(new Color(34, 166, 179));
        b2.setForeground(Color.WHITE);
	
	contentPane.add(b2);

	JPanel panel = new JPanel();
	panel.setForeground(new Color(34, 139, 34));
	panel.setBorder(new TitledBorder(new LineBorder(new Color(78, 205, 196), 2), "Add Librarian",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setBounds(10, 10, 510, 325);
        panel.setBackground(Color.WHITE);
        contentPane.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
	random();
    }
    
    public void actionPerformed(ActionEvent ae){
        DAO dao=new DAOImplement();
        try{
            
            if(ae.getSource() == b1){
                try{
                if(!(t5.getText().equals(t6.getText())))
                {
                   JOptionPane.showMessageDialog(null, "Incorrect Confirm Password");
                   
                }
                else{
                if(checkNumber()){
                String librarianCode=t1.getText();
                String name=t2.getText();
                String age=t3.getText();
                String contact=t4.getText();
                String passwordAccount=t5.getText();
                Librarian librarian=new Librarian(librarianCode,name,age,contact,passwordAccount);
                boolean isAdded=dao.addLibrarian(librarian);
		if (isAdded)
                {
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                    this.setVisible(false);
                    new Admin().setVisible(true);
                }
		else
                    JOptionPane.showMessageDialog(null, "error");
                }
                else{
                      JOptionPane.showMessageDialog(null, "Invalid contact Number");
                }
                }
                
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Admin().setVisible(true);		
            }
        }catch(Exception e){
            
        }
    }
    public boolean checkNumber()
    {
        int age=Integer.parseInt(t3.getText());
        if(age>20 && age<75 && t4.getText().length()>=8)
        {
            return true;
        }
        return false;
    }
}

