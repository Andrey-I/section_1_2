package org.andrey.spring.section_1_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@Autowired
	private SimpleProperties prop;
	
    @RequestMapping("/")
    public String index() {
        return "Hello! " + prop.getDescription();
    }
}