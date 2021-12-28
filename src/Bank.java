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
        long age = account.ageClient;
        if (age >= 18) {

            List<Account> existingAccounts = clientToAccounts.get(account.client);
            if (existingAccounts == null) {
                existingAccounts = new ArrayList<>();
                clientToAccounts.put(account.client, existingAccounts);
            }
            if (!existingAccounts.contains(account)) {
                existingAccounts.add(account);
            }
        }
    }
}
