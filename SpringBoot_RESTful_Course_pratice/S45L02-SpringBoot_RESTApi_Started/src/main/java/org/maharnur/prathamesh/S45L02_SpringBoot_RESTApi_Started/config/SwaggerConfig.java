package org.maharnur.prathamesh.S45L02_SpringBoot_RESTApi_Started.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@Configuration
@OpenAPIDefinition(
    info=@Info(
        title="Spring Boot REST API Demo",
        version="Version 1.0",
        contact=@Contact(
            name="Prathamesh Maharnur",
            email="prathamesh@gmail.com",
            url="https://www.prathamesh.com"
        ),
        license = @License(
            name="Apache 2.0",
            url="https://www.apache.org/licenses/LICENSE-2.0"

        ),
        termsOfService="https://www.prathamesh.com/",
        description="Spring Boot REST API Demo by Prathamesh Maharnur"
    )
)
public class SwaggerConfig {
    
}
