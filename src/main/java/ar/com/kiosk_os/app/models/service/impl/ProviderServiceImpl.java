package ar.com.kiosk_os.app.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.com.kiosk_os.app.models.entity.Provider;
import ar.com.kiosk_os.app.models.dao.IProviderDao;
import ar.com.kiosk_os.app.models.service.IProviderService;

@Service
public class ProviderServiceImpl implements IProviderService {
    @Autowired
    private IProviderDao iProviderDao;
    
    @Override
    public List<Provider> findAll() {
        return (List<Provider>) iProviderDao.findAll();
    }

    @Override
    public void save(Provider provider){
        iProviderDao.save(provider);
    }

    @Override
    public Provider findOne(Long id) {
        return iProviderDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id){
        iProviderDao.deleteById(id);
    }

}
