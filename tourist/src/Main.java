import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello world!");
        Address address1 = new Address("Almaty","Alatau","Abay",50,5);
        User user1 = new User(address1,160902,"Almash","Yerzhanova","yerzhanova@gmail.com",8705777);
        User user2 = new User(address1,1505902,"Almash","Yerzhanova","yerzhanova@gmail.com",8705777);
        User user3 = new User(address1,16090452,"Almash","Yerzhanova","yerzhanova@gmail.com",8705777);

        RecordManagement r = new RecordManagement();
        r.add(user2);
        r.display();
        r.update(1505902,input);
        r.display();
    }
}