package com.m4u.study.config.segurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	
	
	
	
	// Configurações de autenticação.
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	}
	
	// Configurações de Autorizações
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/student").permitAll()
		.antMatchers(HttpMethod.GET, "/student/*").permitAll()
		.anyRequest().authenticated()
		.and().formLogin();
	}
	
	// Configurações de Recursos Estáticos(JS, CSS, Imagens, etc)
	@Override
	public void configure(WebSecurity web) throws Exception {
		
	}
}
