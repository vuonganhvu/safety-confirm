package jp.co.willware.aca.safety.service;

import jp.co.willware.aca.safety.dao.DevicesDao;
import jp.co.willware.aca.safety.entity.DevicesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulerServiceImpl implements SchedulerService {

    @Autowired
    private DevicesDao devicesDao;

    @Override
    public void findOne(long id) {
        DevicesEntity devicesEntity = (devicesDao.findById(id)).get();
        devicesDao.findByLoginId("android");
    }
}
