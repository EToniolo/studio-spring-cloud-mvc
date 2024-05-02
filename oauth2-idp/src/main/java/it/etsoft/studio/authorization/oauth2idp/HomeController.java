package it.etsoft.studio.authorization.oauth2idp;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @GetMapping("/me2")
    @ResponseBody
	public String getMethodName(Principal principal) {
		return "Heeelo" + principal.getName();
	}

  
}
