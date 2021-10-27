package uz.sadirbaev.template.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

@Controller
@ApiIgnore
public class IndexController {

    @GetMapping({"/"})
    public String home(Map<String, Object> model){
        model.put("message", "Hello World!");
        return "test/index";
    }
}
