package com.example.inventoryfailover.inventoryfailover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryFailoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryFailoverApplication.class, args);
        System.out.println("Started Inventory Failover");
    }

}
