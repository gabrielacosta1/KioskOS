package ar.com.kiosk_os.app.models.dao;

import ar.com.kiosk_os.app.models.entity.Config;
import org.springframework.data.repository.CrudRepository;

public interface IConfigDao extends CrudRepository<Config,Long> {
}
