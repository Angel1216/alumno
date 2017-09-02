package com.practica.alumno.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
 

/**
* Copyright (c)  2017 Nova Solution Systems S.A. de C.V.
* Mexico D.F.
* Todos los derechos reservados.
*
* @author NombreDelDesarrollador
*
* ESTE SOFTWARE ES INFORMACIÓN CONFIDENCIAL. PROPIEDAD DE NOVA SOLUTION SYSTEMS.
* ESTA INFORMACIÓN NO DEBE SER DIVULGADA Y PUEDE SOLAMENTE SER UTILIZADA DE ACUERDO CON LOS TÉRMINOS DETERMINADOS POR LA EMPRESA SÍ MISMA.
*/

@Configuration
public class AppConfig {
	
	/*
	 * Configuracion de Cors.
	 * 
	 */
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registro) {
            	registro.addMapping("/obtenerProfesores").allowedOrigins("*");
            	registro.addMapping("/obtenerHorario").allowedOrigins("*");
            }
        };
    }	
}
