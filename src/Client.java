import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Client {
    String name;
    int year;
    int month;
    int deyOfMonth;

    public Client(String name, int year, int month, int deyOfMonth) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.deyOfMonth = deyOfMonth;
    }

    public long ageCalculation(int year, int month, int deyOfMonth) {
        LocalDate birthDay = LocalDate.of(year, month, deyOfMonth);
        LocalDate currentDate = LocalDate.now();
        return ChronoUnit.YEARS.between(birthDay, currentDate);
    }
}

