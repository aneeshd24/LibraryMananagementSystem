
package librarymanagementsystem;
import java.time.LocalDate;
import java.time.Duration;

public class Calculator {
    public int calculateFine(LocalDate issueDate, LocalDate returnDate)
    {
        Duration diff = Duration.between(issueDate.atStartOfDay(), returnDate.atStartOfDay());
        int diffDays = (int)diff.toDays();
        return diffDays;
    }
}
