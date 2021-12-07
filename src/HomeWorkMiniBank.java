import java.util.*;

public class HomeWorkMiniBank {
    static class Client {
        //int age; - возраст клиента, есть в условие задания, не используется
        String name;

        public Client(String name) {
            this.name = name;
        }
    }

    static class Account {
        private final Client client;
        //        private int amount; накопления золотых монет, не используется
        private int id; //номер счета

        public Account(Client client, int id) {
            this.client = client;
            this.id = id;
        }

        public Client getClient() {
            return client;
        }

        @Override //переопределенеие метода toString
        public String toString() {
            return client.name + " " + id;
        }
    }

    static class Bank {
        private final Map<Client, List<Account>> clientToAccounts = new HashMap<>();

        List<Account> getAccounts(Client client) {
            List<Account> accounts = clientToAccounts.get(client);
            return accounts;
        }

        void addAccount(Account account) {
            List<Account> existingAccounts = clientToAccounts.get(account.client);
            if (existingAccounts == null) {
                existingAccounts = new ArrayList<>();
                clientToAccounts.put(account.client, existingAccounts);
            }
            if (!existingAccounts.contains(account)) {
                existingAccounts.add(account);
            }
        }

        Client findClient(Account account) {
            return account.getClient();
        }
    }

    public static void main(String[] args) {
        Client clientA = new Client("Ivan");
        Client clientB = new Client("Stepan");

        Account account1 = new Account(clientA, 12);
        Account account2 = new Account(clientA, 111);
        Account account3 = new Account(clientA, 31);
        Account account4 = new Account(clientB, 44);
        Account account5 = new Account(clientB, 65);

        Bank newBank = new Bank();
        newBank.addAccount(account1);
        newBank.addAccount(account2);
        newBank.addAccount(account3);
        newBank.addAccount(account4);
        newBank.addAccount(account5);

        List<Account> accountsClientA = newBank.getAccounts(clientA);
        for (Account account : accountsClientA) {
            System.out.println(account);
        }

        Client clientAccount = newBank.findClient(account4);
        System.out.println(clientAccount.name);
    }
}