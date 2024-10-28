package org.kosa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HelloController {
	@GetMapping
	public String index(HttpSession session) {
	    log.info("index...");
	    Integer count = (Integer) session.getAttribute("count");
	    if (count == null) {
	    	count = 0;
	    }
	    count++;
	    session.setAttribute("count", count);
		return "index";
	}
}
