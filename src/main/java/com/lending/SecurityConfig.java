package com.lending;

import com.lending.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.ArrayList;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private LoggingAccessDeniedHandler accessDeniedHandler;

    @Autowired
    private UserRepository userRepository;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(
                        "/", "/kontakt",
                        "../js/**",
                        "/manifest.json",
                        "/css/**",
                        "/startbootstrap-agency-gh-pages/vendor/**",
                        "/startbootstrap-agency-gh-pages/css/**",
                        "/startbootstrap-agency-gh-pages/**",
                        "/img/**",
                        "/images/**",
                        "/h2-console",
                        "/h2-console/**",
                        "/daterangepicker-master/**",
                        "/datepicker-popup/**",
                        "/webjars/**").permitAll()
                .antMatchers("/user/**").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/zaloguj")
                .permitAll()
                .defaultSuccessUrl("/moje-konto")
                .and()
                .logout()
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/zaloguj?logout")
                .permitAll()
                .and()
                .exceptionHandling()
                .accessDeniedHandler(accessDeniedHandler);
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(new AuthenticationProvider() {
            @Override
            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
                String email = authentication.getName();
                String password = authentication.getCredentials().toString();
                if (userRepository.checkIfUserExists(email) && userRepository.checkIfCredentialsAreCorrect(email, password))
                    return new UsernamePasswordAuthenticationToken(email, password, new ArrayList<>());
                else
                    return null;
            }

            @Override
            public boolean supports(Class<?> aClass) {
                return aClass.equals(UsernamePasswordAuthenticationToken.class);
            }
        });
        auth.inMemoryAuthentication()
                .withUser("admin@bm.pl").password("{noop}kotelki").roles("ADMIN");
    }

}
