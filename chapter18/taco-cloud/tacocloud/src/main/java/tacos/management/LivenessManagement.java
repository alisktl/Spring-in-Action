package tacos.management;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LivenessManagement {
/*
    @Bean
    public ApplicationRunner disableLiveness(ApplicationContext context) {
        return args -> {
            AvailabilityChangeEvent.publish(context, LivenessState.BROKEN);
        };
    }

    @Bean
    public ApplicationRunner enableLiveness(ApplicationContext context) {
        return args -> {
            AvailabilityChangeEvent.publish(context, LivenessState.CORRECT);
        };
    }
*/
}
