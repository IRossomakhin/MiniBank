import java.time.LocalDate;

public class Client {
    private String name;
    private LocalDate birthDay;

    Client(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }
}

