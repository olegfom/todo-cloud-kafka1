package com.apress.todo.cloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ToDoBinder {

    // channels
    String ORDER_IN = "order-in";
    String ORDER_OUT = "order-out";

    @SuppressWarnings("deprecation")
    @Input(ORDER_IN)
    SubscribableChannel orderIn();

    @SuppressWarnings("deprecation")
    @Output(ORDER_OUT)
    MessageChannel orderOut();
}