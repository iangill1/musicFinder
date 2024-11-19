package com.example.musicFinder;

public class CacheDecorator implements SearchProvider {
    private final SearchProvider searchProvider;

    public CacheDecorator(SearchProvider searchProvider) {
        this.searchProvider = searchProvider;
    }

    @Override
    public String search(String artist, String song) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }
}
