import java.util.LinkedList;
import java.util.Scanner;

public class TourManagement
{
    public LinkedList<Tour> list;

    public TourManagement() {
        list  =new LinkedList<>();
    }


    public void delete(int idNumber) {
        Tour tourDel = null;

        for (Tour l : list) {
            if (l.getTourID() == idNumber) {
                tourDel = l;
            }
        }
        if (tourDel == null) {
            System.out.println("Invalid Record Id");
        } else {
            list.remove(tourDel);
            System.out.println("Succesfully removed");
        }
    }

    public boolean find(int idNumber) {
        for (Tour l : list) {

            if (l.getTourID() == idNumber) {
                System.out.println(
                        "l"
                );
                return true;
            }
        }
        return false;
    }

    public void add(Tour tour) {
        if (!find(tour.getTourID())) {
            list.add(tour);
        } else {
            System.out.println("Tour already exists");
        }

    }
    public Tour findTour(int idnumber) {
        for (Tour l : list) {
            if (l.getTourID() == idnumber) {
                return l;
            }
        }
        return null;
    }

    public void update(int id, Scanner input) {
        if (find(id)) {
            Tour t = findTour(id);
            System.out.println("Tour ID>>>");
            int idNumber = input.nextInt();

            System.out.println("place>>>");
            String place = input.next();


            System.out.println("price>>>");
            int price = input.nextInt();


            System.out.println("about>>>");
            String about = input.next();


            System.out.println("water>>>");
            boolean waterstatus = input.nextBoolean();

            System.out.println("food>>>");
            boolean foodstatus = input.nextBoolean();

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
        for(Tour t: list){
            System.out.println(t.toString());
        }
    }

}
