package jp.co.willware.aca.safety.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Usersテーブルエンティティ
 *
 * @author p-khanhnv.
 */
@Entity
@Table(name = "users")
public class UsersEntity extends BaseEntity {
    @Column(name = "login_id")
    private String loginId;

    @Column(name = "passwd", nullable = false)
    private String passwd;

    @Column(name = "division_id")
    private Long divisionsId;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "address")
    private String userAddress;

    private String userEmail;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "fixed_phone")
    private String fixedPhone;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @Column(name = "fax_number")
    private String faxNumber;

    @Column(name = "status")
    private Boolean status = Boolean.TRUE;

}
