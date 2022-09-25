package icu.insomniac.datatransmission.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan("icu.insomniac.datatransmission.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
