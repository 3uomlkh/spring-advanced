package org.example.expert.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.example.expert.domain.user.enums.UserRole;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.LocalDateTime;

@Slf4j
public class AdminInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserRole userRole = UserRole.of(request.getAttribute("userRole").toString());

        if (!UserRole.ADMIN.equals(userRole)) {
            response.sendError(HttpServletResponse.SC_FORBIDDEN);
            return false;
        }

        LocalDateTime requestTime = LocalDateTime.now();
        String uri = request.getRequestURI();
        log.info("API 요청 시각 = {}", requestTime);
        log.info("API 요청 URL = {}", uri);

        return true;
    }

}
