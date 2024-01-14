package com.bctr.ssvs.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.bctr.ssvs.voting.Administrator;

import java.util.logging.Logger;

@Aspect
public class AdministratorAspect {
    Logger logger = Logger.getLogger(AdministratorAspect.class.getName());

    @Around("call(void com.bctr.ssvs.voting.Administrator.signBallot(..)) && this(o) && target(t)")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint, Object o, Administrator t) throws Throwable {
        if(!t.isVoterAllowed(o)) {
        	throw new IllegalAccessException();
        }
        Object result = proceedingJoinPoint.proceed();
        return result;
    }
}
