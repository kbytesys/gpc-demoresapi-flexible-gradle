package com.nttdata.gpc.demorestapi;

import org.springframework.boot.actuate.autoconfigure.availability.AvailabilityProbesAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ EndpointAutoConfiguration.class,
        AvailabilityProbesAutoConfiguration.class }) public class SpringActuatorConfig { }