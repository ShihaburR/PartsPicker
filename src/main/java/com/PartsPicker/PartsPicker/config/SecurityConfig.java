package com.PartsPicker.PartsPicker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private DataSource dataSource;

    //parse to a datasource(onto the server)
    @Autowired
    public SecurityConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("SELECT email, password, 'TRUE' as enabled FROM PCUSER WHERE email=?")
                .authoritiesByUsernameQuery("SELECT email, 'ROLE_USER' as authority FROM PCUSER WHERE email=?")
                .passwordEncoder(new BCryptPasswordEncoder());

    }
    //manage webpages with authentication
    //stopped at 36 mins on Lecture 7
    @Override
    public void configure(HttpSecurity http) throws Exception{

        http
                .authorizeRequests()
                .antMatchers("/")
                .permitAll()
                .antMatchers("/profile", "/buildPC")
                .authenticated()
                .and()
                .formLogin();

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }

}
