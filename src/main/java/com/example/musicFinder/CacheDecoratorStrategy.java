package com.example.musicFinder;

public class CacheDecoratorStrategy implements SearchStrategy{
    private final SearchStrategy wrappedStrategy;

    public CacheDecoratorStrategy(SearchStrategy wrappedStrategy) {
        this.wrappedStrategy = wrappedStrategy;
    }
    
    @Override
    public String search(String artist, String song) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

}
