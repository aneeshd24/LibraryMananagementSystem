

package librarymanagementsystem;

public class Issue
{
    String book_id, student_id, book_name, student_name, course, branch, dateOfIssue;

    public Issue(String book_id, String student_id, String book_name, String student_name, String course, String branch, String dateOfIssue) {
        this.book_id = book_id;
        this.student_id = student_id;
        this.book_name = book_name;
        this.student_name = student_name;
        this.course = course;
        this.branch = branch;
        this.dateOfIssue = dateOfIssue;
    }

    public String getBook_id() {
        return book_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getCourse() {
        return course;
    }

    public String getBranch() {
        return branch;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }
    
    
}
