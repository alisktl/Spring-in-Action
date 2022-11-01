package tacos.management;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReadinessManagement {
/*
    @Bean
    public ApplicationRunner disableReadiness(ApplicationContext context) {
        return args -> {
            AvailabilityChangeEvent.publish(context, ReadinessState.REFUSING_TRAFFIC);
        };
    }

    @Bean
    public ApplicationRunner enableReadiness(ApplicationContext context) {
        return args -> {
            AvailabilityChangeEvent.publish(context, ReadinessState.ACCEPTING_TRAFFIC);
        };
    }
*/
}
