package eu.lozev.web;

import ch.qos.logback.core.model.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SkillsController {
    Logger logger = LoggerFactory.getLogger(SkillsController.class);
    @GetMapping("/skills")
    public String skills(Model model){
        return "skills";
    }
}
