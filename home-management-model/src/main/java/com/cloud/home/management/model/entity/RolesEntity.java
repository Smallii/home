package com.cloud.home.management.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "roles", schema = "test", catalog = "")
public class RolesEntity {
    private int id;
    private String rname;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Rname")
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolesEntity that = (RolesEntity) o;
        return id == that.id &&
                Objects.equals(rname, that.rname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, rname);
    }
}
