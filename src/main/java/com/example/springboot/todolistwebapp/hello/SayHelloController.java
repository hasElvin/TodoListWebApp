package com.example.springboot.todolistwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, what are you learning today?";
    }

    @RequestMapping("say-hello-html-2")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html>\n" +
                "    <head>\n" +
                "        <title>My first HTML</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        My first HTML page with body\n" +
                "    </body>\n" +
                "</html>");
        return stringBuffer.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
 