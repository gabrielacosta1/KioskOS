package ar.com.kiosk_os.app.models.dao;

import ar.com.kiosk_os.app.models.entity.AuditUser;
import org.springframework.data.repository.CrudRepository;

public interface IAuditUserDao extends CrudRepository<AuditUser, Long> {
}
