import java.util.*;

public class HomeWorkMiniBank {

    public static void main(String[] args) {
        Client clientA = new Client("Ivan", 1992, 11, 21);
        Client clientB = new Client("Stepan", 2005, 7, 12);
        Client clientC = new Client("Maria", 1967, 5, 1);

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

        //Выводим информацию по счетам клиента A.
        System.out.println("Выводим информацию по счетам клиента A.");
        List<Account> accountsClientA = newBank.getAccounts(clientA);
        try {
            for (Account account : accountsClientA) {
                System.out.println(account);
            }
        } catch (Exception e) {
            System.out.println("The client has no accounts because he is a teenager");
        }

        //Выводим имя клиента счета 6.
        System.out.println("\nВыводим имя клиента счета 6.");
        Client clientAccount = account6.getClient();
        System.out.println(clientAccount.name);

        //Выводим информацию по счетам клиента B.
        System.out.println("\nВыводим информацию по счетам клиента B.");
        List<Account> accountsClientB = newBank.getAccounts(clientB);
        try {
            for (Account account : accountsClientB) {
                System.out.println(account);
            }
        } catch (Exception e) {
            System.out.println("The client has no accounts because he is a teenager");
        }

    }
}