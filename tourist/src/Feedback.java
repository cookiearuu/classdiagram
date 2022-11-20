public class Feedback {
    public String comment;
    public User user;
    public Tour tourID;

    public Feedback() {
    }

    public Feedback(String comment, User user , Tour tourID) {
        this.comment = comment;
        this.tourID=tourID;
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Tour getTourID() {
        return tourID;
    }

    public void setTourID(Tour tourID) {
        this.tourID = tourID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
