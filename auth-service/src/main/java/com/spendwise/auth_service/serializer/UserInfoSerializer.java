package com.spendwise.auth_service.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spendwise.auth_service.eventProducer.UserInfoEvent;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class UserInfoSerializer implements Serializer<UserInfoEvent> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        Serializer.super.configure(configs, isKey);
    }

    @Override
    public byte[] serialize(String s, UserInfoEvent event) {
        byte[] retValue = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            retValue = objectMapper.writeValueAsString(event).getBytes();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return retValue;
    }

    @Override
    public byte[] serialize(String topic, Headers headers, UserInfoEvent data) {
        return Serializer.super.serialize(topic, headers, data);
    }

    @Override
    public void close() {
        Serializer.super.close();
    }
}
