///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.example.demo.config;
//
//import java.io.IOException;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import org.apache.commons.logging.LogFactory;
//import org.hibernate.annotations.common.util.impl.Log;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.RedirectStrategy;
//import org.springframework.security.web.WebAttributes;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
///**
// *
// * @author Admin
// */
//public class CustomSuccessHandler implements AuthenticationSuccessHandler {
//
//    protected org.apache.commons.logging.Log logger = LogFactory.getLog(this.getClass());
//
//    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request,
//            HttpServletResponse response, Authentication authentication)
//            throws IOException {
//
//        handle(request, response, authentication);
//        clearAuthenticationAttributes(request);
//    }
//
//    protected void handle(
//            HttpServletRequest request,
//            HttpServletResponse response,
//            Authentication authentication
//    ) throws IOException {
//
//        String targetUrl = determineTargetUrl(authentication);
//
//        if (response.isCommitted()) {
//            logger.debug(
//                    "Response has already been committed. Unable to redirect to "
//                    + targetUrl);
//            return;
//        }
//
//        redirectStrategy.sendRedirect(request, response, targetUrl);
//    }
//    protected void clearAuthenticationAttributes(HttpServletRequest request) {
//    HttpSession session = request.getSession(false);
//    if (session == null) {
//        return;
//    }
//    session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
//    }
//    protected String determineTargetUrl(final Authentication authentication) {
//
//    Map<String, String> roleTargetUrlMap = new HashMap<>();
//    roleTargetUrlMap.put("ROLE_USER", "/homepage.html");
//    roleTargetUrlMap.put("ROLE_ADMIN", "/console.html");
//
//    final Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
//    for (final GrantedAuthority grantedAuthority : authorities) {
//        String authorityName = grantedAuthority.getAuthority();
//        if(roleTargetUrlMap.containsKey(authorityName)) {
//            return roleTargetUrlMap.get(authorityName);
//        }
//    }
//
//    throw new IllegalStateException();
//}
//}
