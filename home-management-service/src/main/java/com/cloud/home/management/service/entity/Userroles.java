package com.cloud.home.management.service.entity;


public class Userroles {

  private long id;
  private long sysUserId;
  private long rolesId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSysUserId() {
    return sysUserId;
  }

  public void setSysUserId(long sysUserId) {
    this.sysUserId = sysUserId;
  }


  public long getRolesId() {
    return rolesId;
  }

  public void setRolesId(long rolesId) {
    this.rolesId = rolesId;
  }

}
