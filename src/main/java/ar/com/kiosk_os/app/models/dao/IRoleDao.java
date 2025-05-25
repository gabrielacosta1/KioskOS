package ar.com.kiosk_os.app.models.dao;

import ar.com.kiosk_os.app.models.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface IRoleDao extends CrudRepository<Role,Long> {

}
