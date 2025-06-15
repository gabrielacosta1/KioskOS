package ar.com.kiosk_os.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import ar.com.kiosk_os.app.models.entity.Provider;

public interface IProviderDao extends CrudRepository<Provider,Long>{
    
}
