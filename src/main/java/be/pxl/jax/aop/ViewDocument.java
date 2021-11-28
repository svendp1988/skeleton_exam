package be.pxl.jax.aop;

import be.pxl.jax.api.exceptions.RWException;
import be.pxl.jax.messaging.EventPublisher;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Aspect
public class ViewDocument {

    @Autowired
    private EventPublisher publisher;

    @Before("@annotation(ViewRWRights)")
    public void before(JoinPoint joinPoint) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        Long userId = (Long) joinPoint.getArgs()[0];
    }

    private void alert() {
        publisher.sendMessage("Possible Security breach!");
    }
}
