package ar.com.kiosk_os.app.models.service;

import ar.com.kiosk_os.app.models.entity.Config;

import java.util.List;

public interface IConfigService {
    public List<Config> findAll();

    public Config findOne(Long id);

    public void save (Config config);

    public void delete (Long id);
}
