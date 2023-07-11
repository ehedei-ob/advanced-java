package org.example;

import org.example.singleton.WebClient;

public class Main {
    public static void main(String[] args) {
        final WebClient webClient1 = WebClient.getInstance();
        final WebClient webClient2 = WebClient.getInstance();

        if (webClient1 == webClient2) {
            System.out.println("Web client is the same instance");
        } else {
            System.out.println("Singleton pattern bad implemented");
        }

        webClient1.setUrl("https://google.es");

        if (webClient1.getUrl().equals(webClient2.getUrl())) {
            System.out.println("Web client is the same instance and their url are the same");
        } else {
            System.out.println("Singleton pattern bad implemented");
        }

    }
}