package com.wf.sm.SpringBootMicroServices;

import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@ImportResource("/application-context.xml")
public class MessagehandlerRestController {

    @Resource(name="myList")
    List<String> list;

    @RequestMapping("/")
    public String getString(){

        return String.join("_", list);
    }



}
