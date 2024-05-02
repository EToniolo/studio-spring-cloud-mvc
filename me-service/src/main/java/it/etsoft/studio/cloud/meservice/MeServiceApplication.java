package it.etsoft.studio.cloud.meservice;

import java.security.Principal;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@EnableAsync
@SpringBootApplication
public class MeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeServiceApplication.class, args);
	}

}

@Controller
@ResponseBody
@Slf4j
class MeController {

	@GetMapping("/me")
	@PreAuthorize("hasRole('ROLE_USER')")
	public Map<String, String> me(Principal principal) {

		Authentication user = (Authentication) principal;


		log.info("User logged:{}-{}", user.getName(), user.getAuthorities());

		return Map.of("name", principal.getName());
	}
	

}
