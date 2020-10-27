public class ContractMobile extends ContractDefault{
    private int mobileMinutes;
    private int mobileInternet;
    private int mobileSMS;
    public ContractMobile(int contractID, String startDate, String endDate, int contractNumber, Client client,
                          int mobileMinutes, int mobileInternet,int mobileSMS) {
        super(contractID, startDate, endDate, contractNumber, client);
        this.mobileInternet=mobileInternet;
        this.mobileMinutes=mobileMinutes;
        this.mobileSMS=mobileSMS;
    }
}
