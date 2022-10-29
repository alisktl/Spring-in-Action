package sia6;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

/**
 * Defining integration flows with XML.
 */
@Configuration
public class FileWriterIntegrationXmlConfig {

    @Profile("xmlconfig")
    @Configuration
    @ImportResource("classpath:/filewriter-config.xml")
    public static class XmlConfiguration {
    }
}
