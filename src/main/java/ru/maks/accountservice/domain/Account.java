package ru.maks.accountservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Table(name = "account")
public class Account {

  @Id
  private String name;

  @Temporal(TemporalType.DATE)
  @Column(name = "lastSeen", nullable = false)
  private Date lastSeen;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(Date lastSeen) {
    this.lastSeen = lastSeen;
  }
}
