

package librarymanagementsystem;


public class Student 
{
    String student_id, name, father, course, branch, year, semester;

    public Student(String student_id, String name, String father, String course, String branch, String year, String semester) {
        this.student_id = student_id;
        this.name = name;
        this.father = father;
        this.course = course;
        this.branch = branch;
        this.year = year;
        this.semester = semester;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getName() {
        return name;
    }

    public String getFather() {
        return father;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public String getBranch() {
        return branch;
    }

    public String getYear() {
        return year;
    }

    public String getSemester() {
        return semester;
    }
    
}
