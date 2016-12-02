package org.myapp.test.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myapp.entity.Student;
import org.myapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;


/**
 * Created by v-jagads-pho on 11/11/16.
 */

public class StudentControllerTest extends AbstractTest{

    @Autowired
    private StudentService studentService;

    @Before
    public void setUp(){
    }

    @After
    public void tearDown(){

    }

    @Test
    public void testStudents() {

        Collection<Student> list = studentService.getStudents();

        Assert.assertNotNull("failure - expected not null", list);
        Assert.assertEquals("failure - expected size", 3, list.size());


    }

}
