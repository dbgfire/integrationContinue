package com.epsi.demo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class hello {

   /* @RequestMapping("/")
    public String index() {
        return "Hello it's me!!!";

    }*/
   @GetMapping("/greeting")
   public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
       model.addAttribute("name", name);
       return "greeting";
   }
}
