package ar.com.kiosk_os.app.models.service;

import java.util.List;

import ar.com.kiosk_os.app.models.entity.Stock;

public interface IStockService {
    public List<Stock> findAll();
    
    public void save(Stock stock);

    public Stock findOne(Long id);

    public void delete(Long id);
    
}
