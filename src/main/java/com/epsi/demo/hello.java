
package com.epsi.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class hello {

    @RequestMapping("/")
    public String index() {
        return "Hello it's me!!!";

    }
}