# Spring Path injection test

This is sample project exposes unexpected change of behaviour in properties injection of type Path.

As defined in PathConfig - default value for property should be "/tmp".

When you try to run this app with ./gardlew bootRun it logs `Injected path: /tmp` as expected.

When you try to run application from Intellij IDEA (open Application.java and select `run...`) it logs:

`Injected path: /private/var/folders/jw/c8s7sjgs55q439rvk31dtr8r7jj34z/T/tomcat-docbase.8080.10869254858988574883/tmp`

Note: 

If you remove the `'org.springframework.boot:spring-boot-starter-web'` both ways of app launching provides expected result.

Note2: 

This behaviour introduced with spring 5.3.5 release due to changes made in issue: spring-projects/spring-framework#22511
