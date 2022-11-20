public class Client  extends  User{
    @Override
    public void setUpdate(Address address, int userID, String name, String last_name, String email, int phone_number) {
        super.setUpdate(address, userID, name, last_name, email, phone_number);
    }
}
