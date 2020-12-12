

package librarymanagementsystem;

public class Librarian {
    String librarian_code, name, age, contact, password;

    public Librarian(String librarian_code, String name, String age, String contact) {
        this.librarian_code = librarian_code;
        this.name = name;
        this.age = age;
        this.contact = contact;
    }
    public Librarian(String librarian_code, String name, String age, String contact,String password) {
        this.librarian_code = librarian_code;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.password = password;
    }
    

    public void setLibrarian_code(String librarian_code) {
        this.librarian_code = librarian_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLibrarian_code() {
        return librarian_code;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getContact() {
        return contact;
    }

    public String getPassword() {
        return password;
    }
    
}
