
package librarymanagementsystem;

public class Account {
  String username,name, password, sec_question, sec_answer;

    public Account(String username, String name, String password, String sec_question, String sec_answer) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.sec_question = sec_question;
        this.sec_answer = sec_answer;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getSec_question() {
        return sec_question;
    }

    public String getSec_answer() {
        return sec_answer;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSec_question(String sec_question) {
        this.sec_question = sec_question;
    }

    public void setSec_answer(String sec_answer) {
        this.sec_answer = sec_answer;
    }
  
}
