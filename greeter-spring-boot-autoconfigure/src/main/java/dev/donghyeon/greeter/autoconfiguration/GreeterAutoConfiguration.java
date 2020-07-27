package dev.donghyeon.greeter.autoconfiguration;//package dev.donghyeon.greeter.autoconfiguration;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ConditionalOnClass(Greeter.class)
//@EnableConfigurationProperties(GreeterProperties.class)
//public class GreeterAutoConfiguration {
//
//    @Autowired
//    private GreeterProperties greeterProperties;
//
//    @Bean
//    @ConditionalOnMissingBean
//    public GreetingConfig greeterConfig() {
//
//        String userName = greeterProperties.getUserName() == null
//                ? System.getProperty("user.name")
//                : greeterProperties.getUserName();
//
//        // ..
//
//        GreetingConfig greetingConfig = new GreetingConfig();
//        greetingConfig.put(USER_NAME, userName);
//        // ...
//        return greetingConfig;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public Greeter greeter(GreetingConfig greetingConfig) {
//        return new Greeter(greetingConfig);
//    }
//}
