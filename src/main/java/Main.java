import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(12345, "a b", "m", "19991026", 1513134734);
        List<Object> list = new ArrayList<Object>();

        System.out.println(client1.clientGetAge(client1.getClientBirthday()));
    }
}
