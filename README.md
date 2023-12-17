## Behavior Spring Boot 3.2 ##
It is an example of issue #38845 from Spring Boot. With Spring Boot 3.2 the `PostCunstruct` of both classes are executed. In addition, `application-test.properties` is processed when both classes are started.

## Behavior Spring Boot 3.1.6 ##
The line `@Value("${name1}")` in `GrafioschtraderApplication` must be commented out, otherwise an error will be thrown as expected. Otherwise everything works as expected `PostConstruct` is executed according to the started class. From `application-test.properties` is only processed when `GTforTest` is started.