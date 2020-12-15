package orz.xuchao.controller;


import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import orz.xuchao.model.Student;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;

@Controller
public class StudentsController {

    public String list( Model model) {

        Collection<Student> list=new ArrayList<>();
        Student student=new Student("凌大",10,1);
        Student student1=new Student("唐二",10,1);
        Student student2=new Student("张三",10,1);
        Student student3=new Student("李四",10,1);
        Student student4=new Student("王五",10,1);
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        model.addAttribute("students",list);
        return "students/list";
    }

}
