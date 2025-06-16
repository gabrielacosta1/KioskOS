package ar.com.kiosk_os.app.models.service.impl;

import ar.com.kiosk_os.app.models.dao.IConfigDao;
import ar.com.kiosk_os.app.models.entity.Config;
import ar.com.kiosk_os.app.models.service.IConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigServiceImpl implements IConfigService {
    @Autowired
    private IConfigDao iConfigDao;

    @Override
    public List<Config> findAll() {
        return (List<Config>) iConfigDao.findAll();
    }

    @Override
    public Config findOne(Long id) {
        return iConfigDao.findById(id).orElse(null);
    }

    @Override
    public void save(Config config) {
        iConfigDao.save(config);
    }

    @Override
    public void delete(Long id) {
        iConfigDao.deleteById(id);
    }
}
