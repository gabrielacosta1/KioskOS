package ar.com.kiosk_os.app.models.service;

import ar.com.kiosk_os.app.models.entity.Notification;

import java.util.List;

public interface INotificationService {
    public List<Notification> findAll();

    public Notification findOne(Long id);

    public void save (Notification notification);

    public void delete (Long id);
}
