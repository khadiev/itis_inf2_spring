package com.example.web2;

import com.example.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class GreetingController {

    @Autowired
    MySessionBean mySessionBean;

    @Autowired
    MyRequestBean myRequestBean;

//    @RequestParam(name="name", required=false, defaultValue="World") String name, @RequestParam(value = "id", defaultValue = "000" ) String idParam

    @GetMapping("/greeting/{id}/{name}")
    public ModelAndView greeting(@PathVariable Integer id, @PathVariable String name, @RequestParam String s, Model model) {
        myRequestBean.getData();
        model.addAttribute("newName",  name + " " +id + " " +s);
        Person person = new Person();
        person.setName("Hello");
        person.setSurname("World");
        return new ModelAndView("greeting", "person", person);
    }

    @GetMapping("/login")
    public ModelAndView login(Model model) {
        myRequestBean.getData();
//        model.addAttribute("newName",  name + " " +id + " " +s);
        Person person = new Person();
        person.setName("Hello");
        person.setSurname("World");
        return new ModelAndView("greeting", "person", person);
    }

    @RequestMapping(value = { "/updateperson" }, method = RequestMethod.POST)
    public ModelAndView savePerson(Model model, //
                             @ModelAttribute("person") Person person) {
        person.setName("new_" + person.getName());
        return new ModelAndView("greeting", "person", person);
    }
}
