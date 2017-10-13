package kr.re.kitri.park.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration//구성클래스로사용(XML설정과동일) 
@EnableGlobalAuthentication//AuthenticationManagerBuilder의전역인스턴스구성,앱전체의보안구성
public class GlobalSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("spring").password("123456").roles("USER")
		.and()
		.withUser("admin").password("123456").roles("USER", "ADMIN");
		
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/api/**").authenticated()
		.and()
		.httpBasic();
	}
}
