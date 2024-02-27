package service;
import dto.UserDTO;
import model.User;

import java.util.List;
import java.util.Objects;

public class UserService {
    private List<User> userList = UserDTO.readFile();
    public static User currentUser = null;

    public void register(User user) {
        userList.add(user);
        UserDTO.writeFile(userList);
    }

    public boolean checkLogin(User user) {
        for (User u: userList) {
            if(Objects.equals(u.getUsername(), user.getUsername()) && Objects.equals(u.getPassword(), user.getPassword())){
                currentUser = u;
                return true;
            }
        }
        return false;
    }

    public void logout() {
        currentUser = null;
    }
}
