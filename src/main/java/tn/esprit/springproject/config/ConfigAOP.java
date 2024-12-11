package tn.esprit.springproject.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component

public class ConfigAOP {
    //Afficher le message "trés bien" aprés la BONNE execution
    @AfterReturning("execution(* tn.esprit.springproject.service.*.*(..))")
    public void AfficheTresBien(JoinPoint joinpoint)
    {
        String name = joinpoint.getSignature().getName();
        log.info("trés bien");
    }

}
