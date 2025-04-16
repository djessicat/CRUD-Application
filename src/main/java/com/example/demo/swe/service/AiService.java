package com.example.demo.swe.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiService {
    private final ChatClient chatClient;

    public AiService(ChatClient.Builder builder) {
        chatClient = builder.build();
    }

    public String chat(String prompt){
       return chatClient
               .prompt(prompt)
               .call()
               .content();
    }
}
