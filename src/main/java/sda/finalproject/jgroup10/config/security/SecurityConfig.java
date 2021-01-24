package sda.finalproject.jgroup10.config.security;


/*
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

   */
/* @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password(passwordEncoder()
                        .encode("pass"))
                .authorities("ROLE_USER");

        auth.inMemoryAuthentication()
                .withUser("user12")
                .password(passwordEncoder()
                        .encode("pass12"))
                .authorities("ROLE_ADMIN");
    }*//*


*/
/*    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*//*


   @Override
    protected void configure(HttpSecurity http) throws Exception {


        http.authorizeRequests()
                //public accesable
                .anyRequest()
                .authenticated().and()
                //use
                .oauth2Login();
    }
}
*/

