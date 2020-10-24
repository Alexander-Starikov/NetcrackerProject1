/*Все типы контрактов имеют поля
        ID
        Дата начала контракта
        Дата окончания контракта
        Номер контракта
        Владелец контракта(Сущность Человек)*/

public class ContractDefault {
    private int contractID;
    private String startDate;
    private String endDate;
    private int contractNumber;
    private Client client;

    public ContractDefault(int contractID, String startDate, String endDate, int contractNumber, Client client){
        this.contractID=contractID;
        this.startDate=startDate;
        this.endDate=endDate;
        this.contractNumber=contractNumber;
        this.client=client;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
