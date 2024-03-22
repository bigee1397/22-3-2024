package com.insuranceapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
//import java.util.List;
//
//import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class AppUserMapper {

	public AppUser convertToAppUser(UserDetails userDetails) {
		String username = userDetails.getUsername();
		String password = userDetails.getPassword();
//		List<GrantedAuthority> authorities = (List<GrantedAuthority>) userDetails.getAuthorities();
		AppUser appUser = new AppUser();
		appUser.setUsername(username);
		appUser.setPassword(password);
		return appUser;
	}
	
	public UserDetails convertToUserDetails(AppUser appUser) {
		String username = appUser.getUsername();
		String password = appUser.getPassword();
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		
		List<String> roles = Arrays.asList("user", "admin");
		for(String role : roles ) {
//			Createe a simple granter authority
			SimpleGrantedAuthority simpleAuthority = new SimpleGrantedAuthority(role);
//			add this to the list of authorities list
			authorities.add(simpleAuthority);
		}
		UserDetails details = new User(username, password, authorities);

		return details;
	}

}
