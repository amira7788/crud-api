package com.tachla.CRUD.managecrudbackendapi.crudWebHello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    // "say-hello" => "Hello! what are you learning today?"
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! what are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer body = new StringBuffer();
        return body.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
