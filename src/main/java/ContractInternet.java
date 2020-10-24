public class ContractInternet extends ContractDefault{
    private int internetSpeed;
    public ContractInternet(int contractID, String startDate, String endDate, int contractNumber, Client client, int internetSpeed) {
        super(contractID, startDate, endDate, contractNumber, client);
        this.internetSpeed = internetSpeed;
    }

    public int getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(int internetSpeed) {
        this.internetSpeed = internetSpeed;
    }
}
