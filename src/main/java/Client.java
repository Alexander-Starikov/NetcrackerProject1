import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public String getClientBirthday() {
        return clientBirthday;
    }
// пока что для инициализации клиента нужно вводить дату в формате yyyyMMdd, ну и тип данных String

    public int clientGetAge(String clientBirthday) {
        int date1 = Integer.parseInt(clientBirthday);
        DateFormat formatForDateNow = new SimpleDateFormat("yyyyMMdd");
        Date dateNow = new Date();
        int date2 = Integer.parseInt(formatForDateNow.format(dateNow));
        int age = (date2 - date1)/10000;
        return age;
    }

    public int getClientID() {
        return clientID;
    }
}

