package ar.com.kiosk_os.app.models.service;

import ar.com.kiosk_os.app.models.entity.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> findAll();

    public void save(Role role);

    public Role findOne(Long id);

    public void delete(Long id);
}
