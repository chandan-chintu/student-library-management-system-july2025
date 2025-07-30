package com.example.student_library_management_system.converters;

import com.example.student_library_management_system.model.Student;
import com.example.student_library_management_system.requestdto.StudentRequestDto;

public class StudentConverter {

    // converter - it converts the request dto into model classes so that the model class gets saved in database as table data.

    public static Student convertStudentRequestDtoIntoStudent(StudentRequestDto studentRequestDto){
        Student student = new Student();

        student.setName(studentRequestDto.getName());
        student.setEmail(studentRequestDto.getEmail());
        student.setAddress(studentRequestDto.getAddress());
        student.setGender(studentRequestDto.getGender());
        student.setDept(studentRequestDto.getDept());
        student.setDob(studentRequestDto.getDob());
        student.setSem(studentRequestDto.getSem());
        student.setMobile(studentRequestDto.getMobile());

        return student;
    }
}
