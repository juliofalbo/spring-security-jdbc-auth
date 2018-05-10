package com.s2it.auth.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthUtils {

	public static String getUsernameFromLoggedUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null)
			return auth.getName();
		else
			return null;
	}

}
