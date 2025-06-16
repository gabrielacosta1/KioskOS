package ar.com.kiosk_os.app.models.service.impl;

import ar.com.kiosk_os.app.models.dao.IAuditUserDao;
import ar.com.kiosk_os.app.models.entity.AuditUser;
import ar.com.kiosk_os.app.models.service.IAuditUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditUserServiceImpl implements IAuditUserService {
    @Autowired
    private IAuditUserDao iAuditUserDao;

    @Override
    public List<AuditUser> findAll() {
        return (List<AuditUser>) iAuditUserDao.findAll();
    }

    @Override
    public AuditUser findOne(Long id) {
        return iAuditUserDao.findById(id).orElse(null);
    }

    @Override
    public void save(AuditUser auditUser) {
        iAuditUserDao.save(auditUser);
    }

    @Override
    public void delete(Long id) {
        iAuditUserDao.deleteById(id);
    }
}
