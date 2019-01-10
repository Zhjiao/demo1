package com.example.demo1.servicempl;

import com.example.demo1.entity.Student;
import com.example.demo1.repository.StudentRepository;
import com.example.demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service//spring扫描包
public class StudentSeriviceImpl implements StudentService{

    @Autowired//自动注入依赖
    private StudentRepository studentRepository;

    @Override//重写
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.saveAndFlush(student);
    }

    @Override
    public void deleteStudent(Integer stuID) {
     studentRepository.deleteById(stuID);
    }

    @Override
    public Student queryStudent(Integer stuID) {
        return studentRepository.findById(stuID).get();
    }
    @Override

    public List<Student> getAllstu(){return studentRepository.findAll();}
}