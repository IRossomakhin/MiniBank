import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    private final Map<Client, List<Account>> clientToAccounts = new HashMap<>();

    List<Account> getAccounts(Client client) {
        return clientToAccounts.get(client);
    }

    void addAccount(Account account) {
        long age = ChronoUnit.YEARS.between(account.getClient().getBirthDay(), LocalDate.now());
        if (age >= 18) {

            List<Account> existingAccounts = clientToAccounts.get(account.getClient());
            if (existingAccounts == null) {
                existingAccounts = new ArrayList<>();
                clientToAccounts.put(account.getClient(), existingAccounts);
            }
            if (!existingAccounts.contains(account)) {
                existingAccounts.add(account);
            }
        }
    }
}
