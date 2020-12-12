
package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class RemoveLibrarian extends JFrame implements ActionListener{

    private JPanel contentPane;
    JDateChooser dateChooser;
    private JTextField t1,t2,t3,t4,t5,t6,t7;
    private JButton b1,b2,b3,b4;

    public static void main(String[] args) {
	new RemoveLibrarian().setVisible(true);
			
    }

    public RemoveLibrarian() {
        setBounds(300, 200, 500, 450);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);
	
	setLocationRelativeTo(null);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	ImageIcon iconLogoMain  = new ImageIcon(ClassLoader.getSystemResource("icons/logoMain.png"));
    Image imageLogoMain = iconLogoMain.getImage().getScaledInstance(240, 240,Image.SCALE_DEFAULT);
    setIconImage(imageLogoMain);

	
	JLabel l1 = new JLabel("Lib: Code");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(new Color(47, 79, 79));
	l1.setBounds(47, 63, 100, 23);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Monospace", Font.BOLD, 14));
	l2.setBounds(47, 97, 100, 23);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Age");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Monospace", Font.BOLD, 14));
	l3.setBounds(47, 131, 100, 23);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Contact");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Monospace", Font.BOLD, 14));
	l4.setBounds(47, 165, 100, 23);
	contentPane.add(l4);

	t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Monospace", Font.BOLD, 14));
	t1.setBounds(126, 66, 86, 20);
	contentPane.add(t1);
	
	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(new Color(78, 205, 196));
        b1.setForeground(Color.WHITE);
	b1.setFont(new Font("Monospace", Font.BOLD, 14));
	b1.setBounds(234, 59, 100, 30);
	contentPane.add(b1);

	t2 = new JTextField();
	t2.setEditable(false);
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Monospace", Font.BOLD, 14));
	t2.setBounds(126, 100, 208, 20);
	contentPane.add(t2);
	t2.setColumns(10);

	t3 = new JTextField();
	t3.setEditable(false);
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Monospace", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(126, 131, 208, 20);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setEditable(false);
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Monospace", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(126, 168, 208, 20);
	contentPane.add(t4);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(78, 205, 196), 2, true), "Remove Librarian",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setFont(new Font("Monospace", Font.BOLD, 14));
	panel.setBounds(10, 38, 445, 250);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
        
        b2 = new JButton("Remove");
	b2.addActionListener(this);
	b2.setFont(new Font("Monospace", Font.BOLD, 14));
	b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b2.setBounds(47, 307, 128, 33);
	b2.setBackground(new Color(78, 205, 196));
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

	b3 = new JButton("Back");
	b3.addActionListener(this);
	b3.setFont(new Font("Monospace", Font.BOLD, 14));
	b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b3.setBounds(299, 307, 120, 33);
	b3.setBackground(new Color(78, 205, 196));
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

    }
    public boolean checkValid()
    {
        String date=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        if(t1.getText().equals("")  && t2.getText().equals("") && date.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Error..!");
            return false;
        }
        if(t1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Book ID must be entered..!");
            return false;
        }
        
        if(t2.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Book Name must be entered..!"); 
        }
        
        if(date.equals("")){
            JOptionPane.showMessageDialog(null, "Date  must be entered..!");
            return false;
        }
        
        
        return true;
    }
    public void actionPerformed(ActionEvent ae){
        DAO dao=new DAOImplement();
        try
        {
            if(ae.getSource() == b1){
                Librarian librarian=dao.getLibrarian(t1.getText());
                if(librarian!=null)
                {
                    t2.setText(librarian.getName());
                t3.setText(librarian.getAge());
                t4.setText(librarian.getContact());
                }
                else
                    JOptionPane.showMessageDialog(null, "Invalid ID");
                
            }
            else if(ae.getSource() == b2)
            {
                boolean isRemoved=dao.removeLibrarian(t1.getText());
                if(isRemoved)
                {
                    JOptionPane.showMessageDialog(null, "Record Deleted !");
                }
                else
                    JOptionPane.showMessageDialog(null, "Could not delete record !");
		
            }
            else if(ae.getSource()==b3)
            {
               new Admin().setVisible(true);
            }
        }catch(Exception e){
             System.out.println(e);
        }
    }
}
