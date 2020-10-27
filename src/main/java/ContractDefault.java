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

}
