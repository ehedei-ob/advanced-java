package org.example.singleton;

import java.util.Objects;

/**
 * Singleton web client to fetch information from API
 */
public class WebClient {
    private static WebClient webClient;
    private String url = "https://bing.com";

    private WebClient() {}

    /**
     * Singleton entry point
     * @return Web client
     */
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
