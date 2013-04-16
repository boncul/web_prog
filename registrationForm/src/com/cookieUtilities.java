package com;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
/** Two static methods for use in cookie handling. */

public class cookieUtilities {
	public static String getCookieValue(HttpServletRequest request, String cookieName, String defaultValue) {

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for(int i=0; i<cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookieName.equals(cookie.getName())) {
					return(cookie.getValue());
				}
			}
		}
		return(defaultValue);
	}

	public static Cookie getCookie(HttpServletRequest request, String cookieName) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for(int i=0; i<cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookieName.equals(cookie.getName())) {
					return(cookie);
				}
			}
		}
		return(null);
	}
}
