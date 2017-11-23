package de.nordakademie.iaa.student.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import de.nordakademie.iaa.student.model.Student;
import de.nordakademie.iaa.student.service.StudentService;

public class StudentEditAction extends ActionSupport {

    private final StudentService studentService;

    private Student student;

    @Autowired
    public StudentEditAction(final StudentService studentService) {
        this.studentService = studentService;
    }

    public String getForm() {
        return SUCCESS;
    }

    public String saveStudent() {
        studentService.create(student);
        return SUCCESS;
    }

    @Override
    public void validate() {
        // more complicated validations go here!
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(final Student student) {
        this.student = student;
    }
}
