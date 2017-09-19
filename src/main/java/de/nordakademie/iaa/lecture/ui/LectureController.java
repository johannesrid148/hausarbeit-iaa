package de.nordakademie.iaa.lecture.ui;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import de.nordakademie.iaa.lecture.model.Lecture;
import de.nordakademie.iaa.lecture.service.LectureService;

@Path("/lectures")
public class LectureController {

  private final LectureService lectureService;

  @Autowired
  public LectureController(final LectureService lectureService) {
    this.lectureService = lectureService;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Lecture> findAll() {
    return lectureService.findAll();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Lecture saveLecture(final Lecture lecture) {
    return lectureService.create(lecture);
  }
}
