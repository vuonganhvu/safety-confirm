package jp.co.willware.aca.safety.dao;

import jp.co.willware.aca.safety.entity.DevicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface DevicesDao extends JpaRepository<DevicesEntity, Long> {
    Optional<DevicesEntity> findById(Long id);

    DevicesEntity findByLoginId(String loginId);
}
