

package librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DAOImplement implements DAO
{

    private static Connection con=conn.getConnection();
    @Override
    public boolean addBook(Book book) 
    {
        try
        {
            String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages) values(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            // st.setInt(1, Integer.parseInt(textField.getText()));
            st.setString(1, book.getId());
            st.setString(2, book.getName());
            st.setString(3, book.getIsbn());
            st.setString(4, book.getPublisher());
            st.setString(5, book.getEdition());
            st.setString(6, book.getPrice());
            st.setString(7, book.getPages());
            int rs = st.executeUpdate();
            if (rs > 0)
                return true;
		
        }catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Exception in adding a book");
        }
        return false;
    }

    @Override
    public boolean addLibrarian(Librarian librarian) {
        try
        {
            String sql = "INSERT INTO librarian(librarian_code, name, age, contact, passwordbaccount) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, librarian.getLibrarian_code());
            st.setString(2, librarian.getName());
            st.setString(3, librarian.getAge());
            st.setString(4, librarian.getContact());
            st.setString(5, librarian.getPassword());
            int i = st.executeUpdate();
            if(i>0)
                return true;
        }catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Exception in adding Librarian");
        }
        return false;
    }

    @Override
    public boolean addStudent(Student student) 
    {
        try
        {
            String sql = "insert into student(student_id, name, father, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, student.getStudent_id());
            st.setString(2, student.getName());
            st.setString(3, student.getFather());
            st.setString(4, student.getCourse());
            st.setString(5, student.getBranch());
            st.setString(6, student.getYear());
            st.setString(7, student.getSemester());
            int rs=st.executeUpdate();
            if(rs>0)
                return true;
        }catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Exception in adding student");
        }
        return false;
        
    }
    
    public Librarian getLibrarian(String libCode)
    {
        Librarian librarian=null;
        try
        {
            String sql = "select * from librarian where librarian_code = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, libCode);
            ResultSet rs = st.executeQuery();
            if (rs.next()) 
            {
                String librarianCode=rs.getString("librarian_code");
                String name=rs.getString("name");
                String age=rs.getString("age");
                String contact=rs.getString("contact");
                librarian=new Librarian(librarianCode,name,age,contact);
            }
        }catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Exception in getting Librarian");
        }
        return librarian;
        
        
    }

    @Override
    public boolean removeLibrarian(String id) {
        try
        {
            String sql = "delete from librarian where librarian_code=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, id);
            int rs = st.executeUpdate();
            if(rs>0)
                return true;
        }catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Exception in removing Librarian");
        }
        return false;
                
    }
    @Override
    public boolean addAccount(Account account) 
    {
        try
        {
            String sql = "insert into baccount(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, account.getUsername());
            st.setString(2, account.getName());
            st.setString(3, account.getPassword());
            st.setString(4, account.getSec_question());
            st.setString(5, account.getSec_answer());
            int i = st.executeUpdate();
            if (i > 0)
                    return true;
        }catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Exception in creating new Account");
        }
        return false;
        
    }

    @Override
    public Book getBook(String id)
    {
        Book book=null;
        try
        {
            String sql = "select * from book where book_id = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) 
            {
                String name=rs.getString("name");
                String isbn=rs.getString("isbn");
                String publisher=rs.getString("publisher");
                String edition=rs.getString("edition");
                String price=rs.getString("price");
                String pages=rs.getString("pages");
                book=new Book(id,name,isbn,publisher,edition,price,pages);
            }
        }catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Exception in getting Book");
        }
        return book;
        
    }
    

    @Override
    public boolean isValidUser(String username,String password) 
    {
        try
        {
           String sql = "select * from baccount where username='"+username+"' and password='"+password+"'"; 
           System.out.println("1");
           PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next())
                return true;
        }catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Exception invalid User");
        }
        return false;           
    }

    @Override
    public Account getUserAccount(String userName)
    {
        Account account=null;
        try
        {
            String sql = "select * from baccount where username=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,userName);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
                 String username=rs.getString("username");
            String name=rs.getString("name");
            String password=rs.getString("password");
            String sec_q=rs.getString("sec_q");
            String sec_ans=rs.getString("sec_ans");
            account=new Account(username,name,password,sec_q,sec_ans);
            }
           
        }catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Excecption getting account");
        }
        return account;
    }


    
}
