import java.util.LinkedList;

public class FindByLastName implements FindUser{
    public LinkedList<User> list;
    public FindByLastName() {
        list  =new LinkedList<>();
    }
    @Override
    public User findUser(String userinfo) {
        for (User l : list) {
            if (l.getLast_name().equals(userinfo)) {
                return l;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "FindByLastName{" +
                "list=" + list +
                '}';
    }
}
