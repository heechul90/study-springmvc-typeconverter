package study.springmvc.typeconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.springmvc.typeconverter.type.IpPort;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping(value = "/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data");
        Integer intValue = Integer.valueOf(data);
        System.out.println("intValue = " + intValue);
        return "ok";
    }

    @GetMapping(value = "/hello-v2")
    public String helloV2(@RequestParam("data") Integer data) {
        System.out.println("data = " + data);
        return "ok";
    }

    @GetMapping(value = "/ip-port")
    public String ipPort(@RequestParam IpPort ipPort) {
        System.out.println("ipPort Ip = " + ipPort.getIp());
        System.out.println("ipPort Port = " + ipPort.getPort());
        return "ok";
    }

}
