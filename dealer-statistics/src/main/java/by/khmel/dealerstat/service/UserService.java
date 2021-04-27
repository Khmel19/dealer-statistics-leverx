package by.khmel.dealerstat.service;

import by.khmel.dealerstat.dao.UserDao;
import by.khmel.dealerstat.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }


    public void save(User user){
        userDao.save(user);
    }


    public User getById(Long id){
        return userDao.getById(id);
    }


    public void delete(Long id){
        userDao.delete(id);
    }


    public List<User> getAll(){
        return userDao.getAll();
    }
}
