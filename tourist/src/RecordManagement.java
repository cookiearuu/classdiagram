import java.util.LinkedList;
import java.util.Scanner;

public class RecordManagement {
    public LinkedList<User> list;

    public RecordManagement() {
        list  =new LinkedList<>();
    }


    public void delete(int idNumber) {
        User userDel = null;

        for (User l : list) {
            if (l.getUserID() == idNumber) {
                userDel = l;
            }
        }
        if (userDel == null) {
            System.out.println("Invalid Record Id");
        } else {
            list.remove(userDel);
            System.out.println("Succesfully removed");
        }
    }

    public boolean find(int idNumber) {
        for (User l : list) {

            if (l.getUserID() == idNumber) {
                System.out.println(
                        "l"
                );
                return true;
            }
        }
        return false;
    }

    public void add(User user) {
        if (!find(user.getUserID())) {
            list.add(user);
        } else {
            System.out.println("User already exists");
        }

    }
    public User findUser(int idnumber) {
        for (User l : list) {
            if (l.getUserID() == idnumber) {
                return l;
            }
        }
        return null;
    }

    public void update(int id, Scanner input) {
        if (find(id)) {
            User u = findUser(id);
            System.out.println("User ID>>>");
            int idNumber = input.nextInt();

            System.out.println("User name>>>");
            String name = input.next();

            System.out.println("User last name>>>");
            String lastname = input.next();

            System.out.println("User email>>>");
            String email = input.next();


            System.out.println("phone number>>>");
            int phoneNumber = input.nextInt();


            System.out.println("city>>>");
            String city = input.next();

            System.out.println("district>>>");
            String district = input.next();

            System.out.println("street>>>");
            String street = input.next();

            System.out.println("house>>>");
            int house = input.nextInt();

            System.out.println("flat>>>");
            int flat = input.nextInt();


            u.setUserID(idNumber);
            u.setLast_name(lastname);
            u.setName(name);
            u.setAddress(city,district,street,house,flat);
            System.out.println("success!");

        }

        else{
            System.out.println("not success");
        }
    }

    public void display(){
        if(list.isEmpty()){
            System.out.println("the list has no records");
        }
        for(User u: list){
            System.out.println(u.toString());
        }
    }

}
