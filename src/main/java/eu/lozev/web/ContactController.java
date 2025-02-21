package eu.lozev.web;

import ch.qos.logback.core.model.Model;
import eu.lozev.model.binding.ContactMessageBindingModel;
//import eu.lozev.model.entity.MessageEntity;
import eu.lozev.services.EmailService;
import eu.lozev.services.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class ContactController {

    Logger logger = LoggerFactory.getLogger(ContactController.class);


    @Autowired
    private EmailService emailService;
    @Autowired
    private MessageService messageService;
    @ModelAttribute
    public ContactMessageBindingModel contactMessageBindingModel(){
        return new ContactMessageBindingModel();
    }
    @GetMapping("/contact")
    public String contact(Model model){

        return "contact";
    }

    @PostMapping("/contact")
    public String message(@Valid ContactMessageBindingModel contactMessageBindingModel,
                          BindingResult bindingResult,
                          RedirectAttributes redirectAttributes){

        String from = contactMessageBindingModel.getFrom();
        String about = contactMessageBindingModel.getAbout();
        String message = contactMessageBindingModel.getMessage();

       // MessageEntity messageEntity = messageService.saveMessage(contactMessageBindingModel);

        // emailService.sendEmail("lozev.bogdan@abv.bg", from + ": " + about, message);
        //TODO: return appropiate message
        return "contact";
    }

}
