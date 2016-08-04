package test.controller;

import com.dump.filter.annotation.Controller;
import com.dump.filter.annotation.Param;
import com.dump.filter.annotation.RequestMapping;
import test.model.Student;
import test.service.StudentService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/a")
    public String login(Student student,@Param("name")String name, HttpServletRequest request){
        studentService.test();
        return "/index.jsp";
    }
}