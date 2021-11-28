package be.pxl.jax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@SpringBootApplication
//@EnableGlobalMethodSecurity(securedEnabled = true)
@EnableAspectJAutoProxy
public class ExamenMain /* extends WebSecurityConfigurerAdapter */ {
    public static void main(String[] args) {
        SpringApplication.run(ExamenMain.class, args);
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.csrf().disable()
//                .formLogin().disable()
//                .httpBasic()
//                .and()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    }
//
//
//    @Autowired
//    public void configureSecurity(AuthenticationManagerBuilder builder,
//                                  DataSource ds) throws Exception {
//        builder.jdbcAuthentication()
//                .passwordEncoder(new BCryptPasswordEncoder())
//                .dataSource(ds)
//                .usersByUsernameQuery(
//                        "select email, password, enabled from users where email = ?"
//                ).authoritiesByUsernameQuery(
//                        "select email, role from users where email = ?"
//                );
//    }
}
