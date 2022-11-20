import java.util.LinkedList;

public class FindByEmail implements FindUser {
    public String userinfo;
    public LinkedList<User> list;

    public FindByEmail() {
        list = new LinkedList<>();
    }

    @Override
    public User findUser(String userinfo) {
        for (User l : list) {
            if (l.getEmail().equals(userinfo)) {
                return l;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "FindByEmail{" +
                "userinfo='" + userinfo + '\'' +
                ", list=" + list +
                '}';

    }
}
