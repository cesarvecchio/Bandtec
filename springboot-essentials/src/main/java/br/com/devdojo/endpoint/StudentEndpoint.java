package br.com.devdojo.endpoint;


import br.com.devdojo.error.CustomErrorType;
import br.com.devdojo.model.Student;
import br.com.devdojo.util.DateUtil;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("students")
public class StudentEndpoint {
    private DateUtil dateUtil;

    @Autowired
    public StudentEndpoint(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> listAll() {

        return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") Integer id) {
        Student student = new Student();
        student.setId(id);
        Integer index = Student.studentList.indexOf(student);

        if (index == -1)
            return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(Student.studentList.get(index), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Student student) {
        Student.studentList.add(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
