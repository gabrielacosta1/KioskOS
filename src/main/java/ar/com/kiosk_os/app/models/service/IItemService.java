package ar.com.kiosk_os.app.models.service;

import java.util.List;

import ar.com.kiosk_os.app.models.entity.Item;

public interface IItemService {
    public List<Item> findAll();

    public void save(Item item);

    public Item findOne(Long id);

    public void delete(Long id);
    
}
