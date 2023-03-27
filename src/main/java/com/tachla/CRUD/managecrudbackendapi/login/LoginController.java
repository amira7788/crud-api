package com.tachla.CRUD.managecrudbackendapi.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login",method = RequestMethod.GET)
    public String goToLogin() {
        return "login";
    }

    @RequestMapping(value="login",method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        model.put("name", name);
      //Authentication logic
        // name and password should be admin admin

        if(authenticationService.autheticateUser(name, password))
        return "welcome";

        model.put("errorMessage", "Invalid login or password!");
        return "login";
    }

//    private Logger logger = LoggerFactory.getLogger(LoginController.class);
   // @RequestMapping("login")
//    public String goToLoginexemple(@RequestParam String name, ModelMap model) {
//        model.put("name", name);
////        logger.debug("debug {}",name);
////        logger.info("info {}",name);
//        return "login";
//    }
}
