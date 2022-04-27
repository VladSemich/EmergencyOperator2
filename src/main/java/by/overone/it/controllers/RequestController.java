package by.overone.it.controllers;

import by.overone.it.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes ({"userId","role"})
public class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping("/request")
    public String showRequestPageWithListOfRequest(Model model) {
        model.addAttribute("ThisIsCreationRequestSage",false);
        return "requests_page";
    }

       @GetMapping("/create-request")
     public String showPageForCreatingRequest(Model model){
           model.addAttribute("ThisIsCreationRequestSage",true);
        return  "request_page";


    }

}
