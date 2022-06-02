package com.todo.todoback.jwt;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 유효한 자격증명을 제공하지 않고 접근하려 할때 401 Unauthorized 에러를 리턴
 * 유효하지 않는 자격증명은 401 에러를 전송하는 클래스
 */
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(
            HttpServletRequest request,
            HttpServletResponse response,
            AuthenticationException authException) throws IOException, ServletException {
        response.sendError( HttpServletResponse.SC_UNAUTHORIZED );
    }
}
