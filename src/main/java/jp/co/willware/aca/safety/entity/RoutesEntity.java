package jp.co.willware.aca.safety.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "routes")
public class RoutesEntity extends BaseEntity {
    @Column(name = "devices_id")
    private Long devicesId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "planed_routes_id")
    private Long planedRoutesId;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "actual_date")
    private Date actualDate;
    @Column(name = "active")
    private Boolean active;

}
