package de.nordakademie.common;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.NaturalId;

@Entity
public class Course {

  private Long id;
  private String fieldOfStudy;
  private int number;
  // TODO could be the PERSON !!
  private String lecturer;
  private String title;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  @NaturalId
  @Column(name = "field_of_study")
  public String getFieldOfStudy() {
    return fieldOfStudy;
  }

  public void setFieldOfStudy(final String fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
  }

  @NaturalId
  public int getNumber() {
    return number;
  }

  public void setNumber(final int number) {
    this.number = number;
  }

  @Basic
  public String getLecturer() {
    return lecturer;
  }

  public void setLecturer(final String lecturer) {
    this.lecturer = lecturer;
  }

  @Basic
  public String getTitle() {
    return title;
  }

  public void setTitle(final String title) {
    this.title = title;
  }
}
