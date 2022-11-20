import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello world!");
        Address address1 = new Address("Almaty","Alatau","Abay",50,5);
        User user0 = new User(address1,1,"Almash","Yerzhanova","yerzhanova@gmail.com",12345);
        User user1 = new User(address1,2,"Aruzhan","Abylkassym","abylkassym@gmail.com",678910);
        User user2 = new User(address1,3,"Aliya","Nurmakhanova","yerzhanova@gmail.com",54321);
        User user3 = new User(address1,4,"Zhanerke","Aimzhan","akimzhan@gmail.com",109876);
        RecordManagement r = new RecordManagement();
        r.add(user0);
        r.add(user1);
        r.add(user2);
        r.add(user3);
//        r.update(1505902,input);
        r.display();
        System.out.println("---------------------------------------------------------------------------");


//        TourManagement t = new TourManagement();
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Date d = sdf.parse("21/12/2012");
//        Tour t1= new Tour(1,"Tau",5000,d,address1,true,"ASDFGHJK",true,false );
//

       System.out.println(r.getF(new FindByEmail()).findUser("yerzhanova@gmail.com"));
    }
}