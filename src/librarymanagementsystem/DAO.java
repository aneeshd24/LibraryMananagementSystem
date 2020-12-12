package librarymanagementsystem;

public interface DAO {
    public boolean addBook(Book book);
    public boolean addLibrarian(Librarian librarian);
    public boolean addStudent(Student student);
    public boolean removeLibrarian(String id);
    public Librarian getLibrarian(String libCode);
    public boolean addAccount(Account account);
    public Book getBook(String id);
    public boolean isValidUser(String username,String password);
    public Account getUserAccount(String userName);
}
