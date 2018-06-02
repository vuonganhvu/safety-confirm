package jp.co.willware.aca.safety.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * UsersManageDeviceテーブルエンティティ
 *
 * @author p-khanhnv.
 */
@Entity
@Table(name = "users_manage_devices")
public class UsersManageDevicesEntity extends BaseEntity {
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "devisions_has_devices_id")
    private Long divisionsHasDevicesId;
    @Column(name = "description")
    private String description;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDivisionsHasDevicesId() {
        return divisionsHasDevicesId;
    }

    public void setDivisionsHasDevicesId(Long divisionsHasDevicesId) {
        this.divisionsHasDevicesId = divisionsHasDevicesId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
