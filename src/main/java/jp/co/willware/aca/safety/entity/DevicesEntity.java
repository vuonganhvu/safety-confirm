package jp.co.willware.aca.safety.entity;

import jp.co.willware.aca.safety.common.CarStatus;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "devices")
public class DevicesEntity extends BaseEntity {
    @Column(name = "login_id")
    private String loginId;
    @Column(name = "password")
    private String password;
    @Column(name = "login_token")
    private String loginToken;
    @Column(name = "salt")
    private String salt;
    @Column(name = "status_car")
    @Enumerated(EnumType.STRING)
    private CarStatus carStatus;
    @Column(name = "status")
    private Integer status;
    @Column(name = "device_type")
    private String deviceType;

}
