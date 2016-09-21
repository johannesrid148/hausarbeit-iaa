package de.nak.iaaLecture.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NaturalId;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Lecture {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @NaturalId
  @Column(name = "begin_date")
  private String beginDate;
  @Column(name = "end_date")
  private String endDate;
  @ManyToOne(optional = false)
  @NaturalId
  private Course course;
  @ManyToOne(optional = false)
  private Room room;
}
