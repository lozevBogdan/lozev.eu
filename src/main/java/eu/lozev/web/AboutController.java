package eu.lozev.web;

import ch.qos.logback.core.model.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    Logger logger = LoggerFactory.getLogger(AboutController.class);
    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }
}
