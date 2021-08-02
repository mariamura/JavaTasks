package com.mariamura.tasks.patterns.Proxy;

public class ProxyDotaCharacter implements Character{
    private String url;
    private DotaCharacter dotaCharacter;

    public ProxyDotaCharacter(String url) {
        this.url = url;
    }

    @Override
    public void create() {
        if(dotaCharacter == null) {
            dotaCharacter = new DotaCharacter(url);
        }
        dotaCharacter.create();
    }
}
