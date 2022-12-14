import java.util.LinkedList;
import java.util.Scanner;

public class User {
    private int userID;
    private String name ;
    private String last_name ;
    private String email;
    private int phone_number;
    public Address address;
    public LinkedList<User> list;


    public User(Address address,int userID , String name ,
                String last_name ,String email , int phone_number) {
        this.address = address;
        this.userID = userID;
        this.name = name ;
        this.last_name=last_name;
        this.email = email;
    }

    public User() {
        list = new LinkedList<>();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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
        if (!find(id)) {
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

    public void setAddress(String city, String district, String street, int house, int flat) {
        this.address= new Address(city,district,street,house,flat);

    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number=" + phone_number +
                ", address=" + address +
                ", list=" + list +
                '}';
    }
}
