import java.util.LinkedList;

public class FindUserByName implements FindUser{
    public LinkedList <User> list;
    public FindUserByName() {
        list  =new LinkedList<>();
    }
    @Override
    public User findUser(String userinfo) {
        for (User l : list) {
            if (l.getName().equals(userinfo)) {
                return l;
            }
        }
        return null;
    }
}
