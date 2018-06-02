package jp.co.willware.aca.safety.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;

/**
 * Baseテーブルエンティティ
 *
 * @author p-khanhnv.
 */
@Data
@MappedSuperclass
@Where(clause = "delete_flg = 0")
public abstract class BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "update_by")
    private Long updateBy;

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "delete_flg")
    private Boolean deleteFlg = Boolean.FALSE;

}
