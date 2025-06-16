package ar.com.kiosk_os.app.models.service;

import ar.com.kiosk_os.app.models.entity.AuditUser;

import java.util.List;

public interface IAuditUserService {
    public List<AuditUser> findAll();

    public AuditUser findOne(Long id);

    public void save (AuditUser auditUser);

    public void delete (Long id);

}
