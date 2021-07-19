package agViaggi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class AgenziaViaggiSpringApplication extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/api/prenotazioni").permitAll().anyRequest().authenticated().and().httpBasic();
		
//		http
//			.httpBasic()
//			.and()
//			.authorizeRequests()
//			.antMatchers("/api/viaggi").permitAll()
//			.anyRequest().authenticated();
//		http
//			.csrf()
//			.disable();
		
//		http
//			.authorizeRequests()
//			.anyRequest().permitAll()
//			.antMatchers("/api/viaggi").permitAll()
//			.antMatchers("/api/prenotazioni").authenticated().and().httpBasic();
		
	      http
	        .authorizeRequests()
	           .antMatchers("/api/viaggi/**","/mvc/**").permitAll()
	           .antMatchers("/api/prenotazioni").authenticated()
	           .anyRequest().authenticated().and().httpBasic();
	
	}
	
//	@Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/mysupersecureurl/**").authenticated()
//                .anyRequest().permitAll()
//                .and()
//                .csrf().disable();
//    }

	public static void main(String[] args) {
		SpringApplication.run(AgenziaViaggiSpringApplication.class, args);
	}

}
