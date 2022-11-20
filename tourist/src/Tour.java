import java.sql.Time;
import java.util.Date;

public class Tour {
    public int tourID;
    private String place;
    private float price;
    private Date date;
    private Address address;
    private Time time;
    private  boolean status ;
    private String about;
    private boolean food;
    private boolean water;

    public Tour() {
    }

    public Tour(int tourID, String place,
                float price , Date date , Address address,
                Time time , boolean status, String about, boolean food , boolean water) {
        this.tourID = tourID;
        this.place=place;
        this.price=price;
        this.date=date;
        this.address=address;
        this.time=time;
        this.status=status;
        this.about=about;
        this.food=food;
        this.water=water;
    }

    public int getTourID() {
        return tourID;
    }


    public void setTourID(int tourID) {
        this.tourID = tourID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }
}
