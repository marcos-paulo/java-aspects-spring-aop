## Example project for Spring AOP Aspect Oriented Programming

This project is an example of how to use Spring AOP in a Spring Boot application.

[LogginAspect.java](src/main/java/com/marcos/java_aspects_spring_aop/LogginAspect.java) is the
aspect class that logs the method calls.

At start up, Spring runs the `applicationRunner` bean, which in turn calls the `hello()` method of the [HelloService](src/main/java/com/marcos/java_aspects_spring_aop/hello/HelloService.java) class and the `dummy()` method of the [DummyService](src/main/java/com/marcos/java_aspects_spring_aop/dummy/DummyService.java) class.

The log Before and log Around Advices capture the calls of all methods coming from all classes, from the `src.main.java.com.marcos.java_aspects_spring_aop.dummy` package.

- PointCut

```
  @Before("execution(* com.marcos.java_aspects_spring_aop.dummy.*.*(..))")
  ...
  @Around("execution(* com.marcos.java_aspects_spring_aop.dummy.*.*(..))")
```
