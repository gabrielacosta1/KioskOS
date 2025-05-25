package ar.com.kiosk_os.app.models.service.impl;

import ar.com.kiosk_os.app.models.dao.IRoleDao;
import ar.com.kiosk_os.app.models.entity.Role;
import ar.com.kiosk_os.app.models.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleDao iRoleService;

    @Override
    public List<Role> findAll() {
        return (List<Role>) iRoleService.findAll();
    }

    @Override
    public void save(Role role) {
        iRoleService.save(role);
    }

    @Override
    public Role findOne(Long id) {
        return iRoleService.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        iRoleService.deleteById(id);
    }
}
