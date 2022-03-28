package com.tidbits.mebeinglazy.menu.maps;

public interface OwnMap<K,V> {

    void put(K key, V value);

    V get(K key);

    void printOwnMap(MyOwnMap<K,V> myOwnMap);
}
