package eu.lozev.web;

import ch.qos.logback.core.model.Model;
import eu.lozev.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/")
    public String home(Model model){
        logger.debug("i`m in home controller!");
        return "index";
    }

}
