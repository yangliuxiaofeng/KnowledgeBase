package com.lsc.util;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ChatGPT {

    String token = "OPENAI_TOKEN";//System.getenv("OPENAI_TOKEN");

    /**
     * 输入问题
     * @param question
     */
    public void ask(String question){
        OpenAiService service = new OpenAiService("OPENAI_TOKEN");
        CompletionRequest completionRequest = CompletionRequest.builder()
                .model("")
                .prompt(question)//这里可以自定义自己的问题
                .temperature(0.5)
                .maxTokens(2048)
                .topP(1D)
                .frequencyPenalty(0D)
                .presencePenalty(0D)
                .build();
        service.createCompletion(completionRequest).getChoices().forEach(System.out::println);
    }

}
