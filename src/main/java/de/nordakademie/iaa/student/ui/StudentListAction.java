package de.nordakademie.iaa.student.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;

import de.nordakademie.iaa.student.model.Student;
import de.nordakademie.iaa.student.service.StudentService;

public class StudentListAction implements Action {

    private final StudentService studentService;

    private List<Student> students;

    @Autowired
    public StudentListAction(final StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public String execute() {
        students = studentService.findAll();
        return SUCCESS;
    }

    public List<Student> getStudents() {
        return students;
    }
}
