package com.project.restapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
		info = @Info(
				contact=@Contact(
			name = "Santhoshkumar",
			email="santhoshkumar@gmail.com",
			url="https://some-url.com"
				),
		description="This is open api documentation for e_commerce",
		title="SandyMedicals",
		version="1.0",
		license=@License(
				name="MIT",
				url="https://some-url.com"
				),
		termsOfService=
		"Terms of service"
				)
		)
public class OpenApiConfig {

}