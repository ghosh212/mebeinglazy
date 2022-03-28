package com.tidbits.mebeinglazy.menu.maps;

import org.springframework.util.ObjectUtils;

public class MyOwnMap<K, V> implements OwnMap<K,V>{

    //default capacity for map
    private static int DEFAULT_CAPACITY = 16;
    private int capacity;

    //table to store the
    private LinkList<K,V>[] table;

    MyOwnMap() {
        this(DEFAULT_CAPACITY);
    }

    MyOwnMap(int capacity) {
        this.capacity = capacity;

         //Initialize "Hash Table" with initial capacity which is nothing but an Array,Each index of an array is called "Hash Bucket"
        this.table = new LinkList[capacity];
    }

    @Override
    public void put(K key, V value) {
        if (ObjectUtils.isEmpty(key)){
            return;
        }

        //creation of key-value pair
        LinkList<K,V> newEntry = new LinkList<>(key,value);
        //generating hashcode for the particular key
        int hashcode =generateHashValue(key);

        //check wether bucket is empty, if empty push the data into the index
        if (table[hashcode] == null){
            table[hashcode] = newEntry;
        }else{
            //if collision occurs i.e if the hascode generated is already in exsisting use
            LinkList<K,V> current = table[hashcode];
            LinkList<K,V> previous = null;
            while(current!=null){
                if (current.key.equals(key)){
                    current.value = newEntry.value;
                    return;
                }
                previous = current;
                current = current.next;
            }
            previous.next = newEntry;
        }
    }

    @Override
    public V get(K key) {
        if (ObjectUtils.isEmpty(key)){
            return null;
        }
        //generating hashvalue to search for a particular key
         int hascode= generateHashValue(key);

        if (table[hascode] == null){
            return null; //no value present in hashmap for the particular key
        }else{
            LinkList<K,V> current = table[hascode];
            while (current!=null){
                if (current.key.equals(key)){
                    return current.value;
                }
                current = current.next;
            }
        }
    return null;

    }

    @Override
    public void printOwnMap(MyOwnMap<K,V> myOwnMap) {
        System.out.println(myOwnMap);

    }

    private int generateHashValue(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }
}
