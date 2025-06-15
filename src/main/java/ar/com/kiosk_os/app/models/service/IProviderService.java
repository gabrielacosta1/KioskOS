package ar.com.kiosk_os.app.models.service;

import java.util.List;
import ar.com.kiosk_os.app.models.entity.Provider;

public interface IProviderService {
    public List<Provider> findAll();

    public void save(Provider provider);

    public Provider findOne(Long id);

    public void delete(Long id);

}
