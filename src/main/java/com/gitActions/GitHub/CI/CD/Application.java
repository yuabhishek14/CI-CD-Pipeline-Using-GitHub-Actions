package com.gitActions.GitHub.CI.CD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/welcome")
	public String welcome(){
		return "DevOps MasterClass";
	}

/*	echo "# CI-CD-Pipeline-Using-GitHub-Actions" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/yuabhishek14/CI-CD-Pipeline-Using-GitHub-Actions.git
	git push -u origin main*/


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
