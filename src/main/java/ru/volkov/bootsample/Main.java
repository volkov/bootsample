package ru.volkov.bootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * User: serg-v
 * Date: 6/21/16
 * Time: 12:02 AM
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "ru.volkov.bootsample")
public class Main {
  public static void main(String[] args) throws Exception {
    SpringApplication.run(Main.class, args);
  }

}