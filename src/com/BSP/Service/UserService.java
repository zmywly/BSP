package com.BSP.Service;

import com.BSP.DAO.UserDAO;
import com.BSP.bean.User;

import java.util.List;

public class UserService {

    public List<User> findAllUser() {
        UserDAO userDAO = new UserDAO();
        return userDAO.findAllUser();
    }

    public void deleteUser(int id) {
        UserDAO userDAO = new UserDAO();
        userDAO.deleteUser(id);
    }

    public int findIdByUserName(String userName) {
        UserDAO userDAO = new UserDAO();
        User user = new User();
        user.setUserName(userName);
        User u = userDAO.findUserByName(user);
        return u.getId();
    }

    public boolean regist(User user) {
        UserDAO userDAO = new UserDAO();
        User u = userDAO.findUserByName(user);
        if (u != null) {
            return false;
        }
        userDAO.addUser(user);
        return true;
    }


    public int login(User user) {
        UserDAO userDAO = new UserDAO();
        User u = userDAO.findUserByName(user);
        if (u == null) {
            return 2;
        }
        if (!user.getPassword().equals(u.getPassword())) {
            return 1;
        }

        if (user.getUserName().equals("admin") && user.getPassword().equals("admin")) {
            return 4;
        }

        return 3;
    }

    public boolean updateUserPassword(User user) {
        UserDAO userDAO = new UserDAO();
        User u = userDAO.findUserByName(user);
        if (u == null) {
            return false;
        }
        userDAO.updateUserOnPassword(user);
        return true;

    }

    public boolean updateUserTel(User user) {
        UserDAO userDAO = new UserDAO();
        User u = userDAO.findUserByName(user);
        if (u == null) {
            return false;
        }
        userDAO.updateUserOntel(user);
        return true;

    }

}
