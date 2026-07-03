package org.maharnur.prathamesh.S47L06_BuildPhotos_UploadAlbum_Continues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SpringBootApplication
@SecurityScheme(name = "springboot-demo-api", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class SpringResDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringResDemoApplication.class, args);
	}

}
