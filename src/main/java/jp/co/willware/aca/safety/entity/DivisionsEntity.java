package jp.co.willware.aca.safety.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Divisionsテーブルエンティティ
 *
 * @author p-khanhnv.
 */
@Entity
@Table(name = "divisions")
public class DivisionsEntity extends BaseEntity {
    @Column(name = "address")
    private String divisionAddress;

    @Column(name = "name")
    private String divisionName;

    @Column(name = "mail")
    private String divisionMail;

    @Column(name = "parent_divisions_id")
    private Long parentDivisionsId;

    @Column(name = "users_id")
    private Long usersId;

    @Column(name = "code")
    private String divisionCode;

    public String getDivisionAddress() {
        return divisionAddress;
    }

    public void setDivisionAddress(String divisionAddress) {
        this.divisionAddress = divisionAddress;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }


    public Long getParentDivisionsId() {
        return parentDivisionsId;
    }

    public void setParentDivisionsId(Long parentDivisionsId) {
        this.parentDivisionsId = parentDivisionsId;
    }

    public Long getUsersId() {
        return usersId;
    }

    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    public String getDivisionMail() {
        return divisionMail;
    }

    public void setDivisionMail(String divisionMail) {
        this.divisionMail = divisionMail;
    }

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }
}
