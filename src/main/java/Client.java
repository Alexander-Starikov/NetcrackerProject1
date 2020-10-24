public class Client {
    private int clientID;
    private String clientFullname;
    private String clientgender;
    private String clientBirthday;
    private int clientPassportID;

    public Client(int clientID, String clientFullname, String clientgender, String clientBirthday, int clientPassportID){
        this.clientID=clientID;
        this.clientFullname=clientFullname;
        this.clientgender=clientgender;
        this.clientBirthday=clientBirthday;
        this.clientPassportID=clientPassportID;
    }

    public int getClientID() {
        return clientID;
    }
}
