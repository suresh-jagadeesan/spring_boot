package org.myapp.service;

import org.myapp.dao.StudentDao;
import org.myapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by v-jagads-pho on 11/7/16.
 */

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getStudents(){
        return studentDao.getStudents();
    }

    public Student getStudent(Integer id) {
        return studentDao.getStudent(id);
    }
}
