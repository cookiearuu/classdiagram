import java.util.Date;

public class Cards {
    public  User userID;
    public String type;
    public int cardNumber;
    public int CVV;
    public Date date;

    public Cards() {
    }

    public Cards(int cardNumber,int CVV,
                 User userID, Date date , String type) {
        this.cardNumber = cardNumber;
        this.CVV=CVV;
        this.userID=userID;
        this.date = date;
        this.type=type;
    }
}
