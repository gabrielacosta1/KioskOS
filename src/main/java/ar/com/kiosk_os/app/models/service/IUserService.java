package ar.com.kiosk_os.app.models.service;

import ar.com.kiosk_os.app.models.entity.User;

import java.util.List;

public interface IUserService {
    public List<User> findAll();

    public void save(User user);

    public User findOne(Long id);

    public void delete(Long id);
}
