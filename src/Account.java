public class Account {
    private final Client client;
    private final int numberAccount;

    Account(Client client, int numberAccount) {
        this.client = client;
        this.numberAccount = numberAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Client: " + client.getName() + ", numberAccount: " + getNumberAccount();
    }
}
