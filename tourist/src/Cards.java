import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Cards {
    public User userID;
    public String type;
    public int cardNumber;
    public int CVV;
    public Date date;
    public LinkedList<User> list;

    public Cards() {
        list = new LinkedList<>();
    }


    public Cards(int cardNumber, int CVV,
                 User userID, Date date, String type) {
        this.cardNumber = cardNumber;
        this.CVV = CVV;
        this.userID = userID;
        this.date = date;
        this.type = type;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUserID() {
        return userID.getUserID();
    }

    public void setUserID(int newuserID) {
        this.userID.setUserID(newuserID);
    }




}


