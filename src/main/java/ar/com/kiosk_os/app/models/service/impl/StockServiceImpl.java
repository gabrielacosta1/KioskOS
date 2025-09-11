package ar.com.kiosk_os.app.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.kiosk_os.app.models.dao.IStockDao;
import ar.com.kiosk_os.app.models.entity.Stock;
import ar.com.kiosk_os.app.models.service.IStockService;

public class StockServiceImpl implements IStockService{
    @Autowired
    private IStockDao iStockDao;

    @Override
    public List<Stock> findAll() {
        return (List<Stock>) iStockDao.findAll();
    }

    @Override
    public void save(Stock stock) {
        iStockDao.save(stock);
    }

    @Override
    public Stock findOne(Long id) {
        return iStockDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        iStockDao.deleteById(id);
    }

    
    
}
