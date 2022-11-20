import java.util.Date;

public class FinishedTours  {
    private Tour tourID;
    private String place;
    private float price;
    private Date date;
    private int amount;

    public FinishedTours(int amount , Date date ,
    float price ,String place , Tour tourID) {
        this.tourID=tourID;
        this.amount = amount;
        this.place=place;
        this.price = price;
        this.date=date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Tour getTourID() {
        return tourID;
    }

    public void setTourID(Tour tourID) {
        this.tourID = tourID;
    }
}

