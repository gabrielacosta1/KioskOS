package ar.com.kiosk_os.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import ar.com.kiosk_os.app.models.entity.Item;

public interface IItemDao extends CrudRepository<Item, Long> {

}