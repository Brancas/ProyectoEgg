
package ProyectoEgg.argus.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Agustin
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    protected  void configure (HttpSecurity http) throws Exception{
        http.authorizeRequests()
            .antMatchers("/css/*", "/js/*", "/img/*", "/**")
                .permitAll()
                .and()
                .csrf()
                .disable();
   
    }
    
    
    
    
}
