package org.example.expert.config;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.time.LocalDateTime;

@Aspect
@Slf4j
@Component
public class LoggingAspect {
    private final JwtUtil jwtUtil;

    public LoggingAspect(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Pointcut("execution(* org.example.expert.domain..*AdminController.*(..))")
    public void admin() {
    }

    @Around("admin()")
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        // 요청한 사용자의 ID
        String token = jwtUtil.substringToken(request.getHeader("Authorization"));
        String userId = jwtUtil.extractUserId(token);
        log.info(userId);

        // API 요청 시각
        LocalDateTime requestTime = LocalDateTime.now();
        log.info("Request Time: {}", requestTime);

        // API 요청 URL
        String requestUrl = request.getRequestURI();
        log.info("Request URL: {}", requestUrl);

        // 요청 본문

        // 응답 본문

        return joinPoint.proceed();
    }
}
