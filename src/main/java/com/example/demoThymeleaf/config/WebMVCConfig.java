package com.example.demoThymeleaf.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
@EnableWebMvc
public class WebMVCConfig implements WebMvcConfigurer {
	
	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver slr = new CookieLocaleResolver();
		slr.setDefaultLocale(Locale.ITALY);
		return slr;
	}

	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
	   LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
	   localeChangeInterceptor.setParamName("lang");
	   return localeChangeInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	   registry.addInterceptor(localeChangeInterceptor());
	}
}
