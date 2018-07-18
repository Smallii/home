package com.cloud.home.management.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "userroles", schema = "test", catalog = "")
public class UserrolesEntity {
    private int id;
    private Integer sysUserId;
    private Integer rolesId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sysUserId")
    public Integer getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    @Basic
    @Column(name = "rolesId")
    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserrolesEntity that = (UserrolesEntity) o;
        return id == that.id &&
                Objects.equals(sysUserId, that.sysUserId) &&
                Objects.equals(rolesId, that.rolesId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, sysUserId, rolesId);
    }
}
