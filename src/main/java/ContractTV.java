public class ContractTV extends ContractDefault {
    private int tvChannels;

    public ContractTV(int contractID, String startDate, String endDate, int contractNumber, Client client, int tvChannels) {
        super(contractID, startDate, endDate, contractNumber, client);
        this.tvChannels = tvChannels;
    }

}
