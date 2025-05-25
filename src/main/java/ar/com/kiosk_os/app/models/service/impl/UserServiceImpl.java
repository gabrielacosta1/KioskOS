package ar.com.kiosk_os.app.models.service.impl;

import ar.com.kiosk_os.app.models.dao.IUserDao;
import ar.com.kiosk_os.app.models.entity.User;
import ar.com.kiosk_os.app.models.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao iUserDao;

    @Override
    public List<User> findAll() {
        return (List<User>) iUserDao.findAll();
    }

    @Override
    public void save(User user) {
        iUserDao.save(user);
    }

    @Override
    public User findOne(Long id) {
        return iUserDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        iUserDao.deleteById(id);
    }
}
