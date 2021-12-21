import java.util.*;

public class HomeWorkMiniBank {
    static class Client {
        String name;

        public Client(String name) {
            this.name = name;
        }
    }

    static class Account {
        private final Client client;
        private int numberAccount;

        public Account(Client client, int numberAccount) {
            this.client = client;
            this.numberAccount = numberAccount;
        }

        public Client getClient() {
            return client;
        }

        @Override
        public String toString() {
            return client.name + " " + numberAccount;
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
    }

    public static void main(String[] args) {
        Client clientA = new Client("Ivan");
        Client clientB = new Client("Stepan");
        Client clientC = new Client("Maria");


        Account account1 = new Account(clientA, 12);
        Account account2 = new Account(clientA, 111);
        Account account3 = new Account(clientA, 31);
        Account account4 = new Account(clientB, 44);
        Account account5 = new Account(clientB, 65);
        Account account6 = new Account(clientC, 7);

        Bank newBank = new Bank();
        newBank.addAccount(account1);
        newBank.addAccount(account2);
        newBank.addAccount(account3);
        newBank.addAccount(account4);
        newBank.addAccount(account5);
        newBank.addAccount(account6);

        List<Account> accountsClientA = newBank.getAccounts(clientA);
        for (Account account : accountsClientA) {
            System.out.println(account);
        }

        Client clientAccount = account6.getClient();
        System.out.println(clientAccount.name);
    }
}