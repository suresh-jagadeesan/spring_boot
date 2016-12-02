package org.myapp.controller;

import io.swagger.annotations.*;
import org.myapp.entity.Student;
import org.myapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by v-jagads-pho on 11/7/16.
 */


@RestController
@RequestMapping("/Students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "getStudents", nickname = "getStudents")
    @RequestMapping(method = RequestMethod.GET)

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Student.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")})
    public Collection<Student> getStudents() {
        return studentService.getStudents();
    }
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "User's ID", required = true, dataType = "int", paramType = "path", defaultValue="1")
    })
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") Integer id) {
        return studentService.getStudent(id);
    }
}
