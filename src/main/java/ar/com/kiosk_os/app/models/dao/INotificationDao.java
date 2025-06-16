package ar.com.kiosk_os.app.models.dao;

import ar.com.kiosk_os.app.models.entity.Notification;
import org.springframework.data.repository.CrudRepository;

public interface INotificationDao extends CrudRepository<Notification,Long> {
}
