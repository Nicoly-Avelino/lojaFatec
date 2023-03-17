package com.fatec.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/papelaria")
    public String papelaria(){
        return "papelaria";
    }

    //@GetMapping("/departamento/{depto}")
    //public String departamento(@PathVariable String depto, ModelMap model){
    //    model.addAttribute("depto", depto);
     //   return nomeDepto();
   // }

}
