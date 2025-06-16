package ar.com.kiosk_os.app.models.service.impl;

import ar.com.kiosk_os.app.models.dao.INotificationDao;
import ar.com.kiosk_os.app.models.entity.Notification;
import ar.com.kiosk_os.app.models.service.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements INotificationService {
    @Autowired
    private INotificationDao iNotificationDao;

    @Override
    public List<Notification> findAll() {
        return (List<Notification>) iNotificationDao.findAll();
    }

    @Override
    public Notification findOne(Long id) {
        return iNotificationDao.findById(id).orElse(null);
    }

    @Override
    public void save(Notification notification) {
        iNotificationDao.save(notification);
    }

    @Override
    public void delete(Long id) {
        iNotificationDao.deleteById(id);
    }
}
