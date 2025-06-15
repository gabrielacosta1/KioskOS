package ar.com.kiosk_os.app.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.kiosk_os.app.models.dao.IItemDao;
import ar.com.kiosk_os.app.models.entity.Item;
import ar.com.kiosk_os.app.models.service.IItemService;

public class ItemServiceImpl implements IItemService {
    @Autowired
    private IItemDao iItemDao;

    @Override
    public List<Item> findAll() {
        return (List<Item>) iItemDao.findAll();
    }

    @Override
    public void save(Item item) {
        iItemDao.save(item);
    }

    @Override
    public Item findOne(Long id) {
        return iItemDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        iItemDao.deleteById(id);
    }

}
