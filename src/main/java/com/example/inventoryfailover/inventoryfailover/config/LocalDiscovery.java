package com.example.inventoryfailover.inventoryfailover.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableDiscoveryClient
@Configuration
@Profile("local-discovery")
public class LocalDiscovery {
}
