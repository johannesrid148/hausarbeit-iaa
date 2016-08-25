package de.nordakademie.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NaturalId;

@Entity
public class Lecture {

  private Long id;
  private Date beginDate;
  private Date endDate;
  private Course course;
  private Room room;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  @NaturalId
  @Column(name = "begin_date")
  public Date getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(final Date beginDate) {
    this.beginDate = beginDate;
  }

  @Column(name = "end_date")
  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(final Date endDate) {
    this.endDate = endDate;
  }

  @ManyToOne(optional = false)
  @NaturalId
  public Course getCourse() {
    return course;
  }

  public void setCourse(final Course course) {
    this.course = course;
  }

  @ManyToOne(optional = false)
  public Room getRoom() {
    return room;
  }

  public void setRoom(final Room room) {
    this.room = room;
  }
}
