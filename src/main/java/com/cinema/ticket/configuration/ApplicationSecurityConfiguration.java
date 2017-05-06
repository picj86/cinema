/**
 * 
 */
package com.cinema.ticket.configuration;

/**
 * @author Prabhakar Jha
 *
 */
//@EnableWebSecurity
public class ApplicationSecurityConfiguration { /*extends WebSecurityConfigurerAdapter {

	*//**
	 * This section defines the user accounts which can be used for
	 * authentication as well as the roles each user has.
	 *//*
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("user").password("user").roles("USER").and().withUser("admin")
				.password("admin").roles("USER", "ADMIN");
	}

	*//**
	 * This section defines the security policy for the application. 
	 * BASIC authentication is supported (enough for this REST-based api) 
	 * /category is secured using URL security shown below 
	 * CSRF headers are disabled since we are only testing the REST interface and not the web based
	 *//*
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.httpBasic().and().authorizeRequests().antMatchers("/resources/**", "/webjars/**", "/assets/**").permitAll()
				.antMatchers("/api/**").authenticated().antMatchers("/category/**").hasRole("ADMIN").and().csrf()
				.disable();
	}*/
}
