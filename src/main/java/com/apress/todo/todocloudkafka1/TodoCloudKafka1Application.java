package com.apress.todo.todocloudkafka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.apress.todo.cloud.ToDoBinder;

@EnableScheduling
@SuppressWarnings("deprecation")
@EnableBinding(value = {ToDoBinder.class})
@ComponentScan(basePackages={"com.apress.todo"})
@SpringBootApplication
public class TodoCloudKafka1Application {

	public static void main(String[] args) {
		SpringApplication.run(TodoCloudKafka1Application.class, args);
	}

}
