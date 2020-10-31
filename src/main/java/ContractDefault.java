/**
 * класс с описанием родительского класса контрактов
 */

public class ContractDefault {
    private int contractID;
    private String startDate;
    private String endDate;
    private int contractNumber;
    private Client client;

    /**
     * объявление конструктора с полями:
     * @param contractID - ID контракта
     * @param startDate - дата начала контракта
     * @param endDate - дата окончания контракта
     * @param contractNumber - номер контракта
     * @param client - объект класса "клиент"
     */

    public ContractDefault(int contractID, String startDate, String endDate, int contractNumber, Client client){
        this.contractID=contractID;
        this.startDate=startDate;
        this.endDate=endDate;
        this.contractNumber=contractNumber;
        this.client=client;
    }

    /**
     * геттер ID контракта
     * @return - ID контракта
     */
    public int getContractID() {
        return contractID;
    }
}
