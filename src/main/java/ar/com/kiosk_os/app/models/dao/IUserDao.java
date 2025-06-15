package ar.com.kiosk_os.app.models.dao;

import ar.com.kiosk_os.app.models.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<User,Long> {

}
