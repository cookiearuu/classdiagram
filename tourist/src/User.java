public class User {
    private int userID;
    private String name ;
    private String last_name ;
    private String email;
    private int phone_number;
    private Address address;

    public User(Address address,int userID , String name ,
                String last_name ,String email , int phone_number) {
        this.address = address;
        this.userID = userID;
        this.name = name ;
        this.last_name=last_name;
        this.email = email;
    }

    public User() {
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

    public User getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }


    public void setUpdate(Address address,int userID , String name ,
                String last_name ,String email , int phone_number) {
        this.address = address;
        this.userID = userID;
        this.name = name ;
        this.last_name=last_name;
        this.email = email;
    }
}
