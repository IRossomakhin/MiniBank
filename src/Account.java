public class Account {
    public final Client client;
    public final int numberAccount;
    public final long ageClient;

    public Account(Client client, int numberAccount) {
        this.client = client;
        this.numberAccount = numberAccount;
        this.ageClient = client.ageCalculation(client.year, client.month, client.deyOfMonth);
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Client: " + client.name + ", age: " + ageClient + ", numberAccount: " + numberAccount;
    }
}
