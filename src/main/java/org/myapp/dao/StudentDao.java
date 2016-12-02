package org.myapp.dao;

import org.myapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by v-jagads-pho on 11/7/16.
 */

@Repository
public class StudentDao {

    @Autowired
    private static Map<Integer,Student> students;

    static {
        students = new HashMap<Integer,Student>() {

            {
                put(1, new Student(1, "Sam", "CSE"));
                put(2, new Student(2, "Terry", "Accounts"));
                put(3, new Student(3, "Tamy", "Maths"));
            }
        };

    }

    public Collection<Student> getStudents() {
        return this.students.values();
    }

    public Student getStudent(Integer id) {
        return this.students.get(id);
    }
}
