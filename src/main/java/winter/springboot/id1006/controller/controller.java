package winter.springboot.id1006.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import winter.springboot.id1006.model.collection;
import winter.springboot.id1006.service.service;

@Controller
@RequestMapping("/form")
public class controller {

    @Autowired
    private service serviceobject;

    @GetMapping("/")
    public String getWebPage() {
        return "form"; 
    }

    @PostMapping("/emp")
    public String getDetails(@ModelAttribute collection collectionobject){
        serviceobject.saveDetails(collectionobject);
        return "Details Saved Successfully";
    }
}