package ar.com.kiosk_os.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import ar.com.kiosk_os.app.models.entity.Stock;

public interface IStockDao extends CrudRepository<Stock,Long>{
    
}
