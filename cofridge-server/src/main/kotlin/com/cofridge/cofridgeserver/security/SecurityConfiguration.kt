package com.cofridge.cofridgeserver.security

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
class SecurityConfiguration() : WebSecurityConfigurerAdapter() {

    override fun configure(http : HttpSecurity) {
        http.cors().and()
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/api/public").permitAll()
            .anyRequest().authenticated()
                .and()
                .addFilter(JwtAuthenticationFilter(authenticationManager()))
    }
}