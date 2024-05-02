package it.etsoft.studio.authorization.oauth2idp;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class Oauth2IdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2IdpApplication.class, args);
	}

}

@Controller
@ResponseBody
class MeController {

	@GetMapping("/me")
	public String getMethodName(Principal principal) {
		return "Heeelo  " + principal.getName();
	}
}
