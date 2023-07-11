package org.example.singleton;

import java.util.Objects;

public class WebClient {
    private static WebClient webClient;
    private String url = "https://bing.com";

    private WebClient() {}

    public static WebClient getInstance() {
        if (Objects.isNull(webClient)) {
            webClient = new WebClient();
        }

        return webClient;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
