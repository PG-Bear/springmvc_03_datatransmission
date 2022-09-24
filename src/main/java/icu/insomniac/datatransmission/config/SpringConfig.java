package icu.insomniac.datatransmission.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan({"icu.insomniac.datatransmission.dao","icu.insomniac.datatransmission.service"})
@ComponentScan(
        value = "icu.insomniac.datatransmission",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = {Controller.class}
        )
)
@Import({})
public class SpringConfig {
}
