import java.util.Date;

public class RegisteredUsers {
    private User userID;
    private Tour tourID;
    private boolean paymentstatus;
    private Date paymentdate;
    private Manager managerID;

    public RegisteredUsers(User user, Tour tour , boolean paymentstatus , Date paymentdate , Manager managerID) {
        this.userID = user;
        this.tourID = tour;
        this.paymentstatus=paymentstatus;
        this.paymentdate = paymentdate;
        this.managerID = managerID;
    }

    public Manager getManagerID() {
        return managerID;
    }

    public void setManagerID(Manager managerID) {
        this.managerID = managerID;
    }

    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    public boolean isPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(boolean paymentstatus) {
        this.paymentstatus = paymentstatus;
    }

    public Tour getTourID() {
        return tourID;
    }

    public void setTourID(Tour tourID) {
        this.tourID = tourID;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }
}
