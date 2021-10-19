//package br.com.santander.agenda.config;
//
//import br.com.santander.agenda.service.UsuarioService;
//import org.hibernate.StatelessSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
////        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance()).withUser("admin").
////                password("1234").roles("USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
////        http.headers().frameOptions().disable().and().
////        csrf().disable().
////        authorizeRequests()
////        .antMatchers(HttpMethod.GET, "/contatos**", "/contatos/*").
////        permitAll().
////        antMatchers("/h2-console/**").
////        permitAll().
////        anyRequest().
////        authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
////        ;
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/v2/api-docs", "/swagger-resources/**", "/swagger-ui/**", "/webjars/**");
//    }
//}
