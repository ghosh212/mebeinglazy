package com.tidbits.mebeinglazy.menu.maps;

public class LinkList<K,V> {

        K key;
        V value;
    LinkList<K,V> next;

        public LinkList(K key , V value){
            this.key = key;
            this.value = value;
        }

        public LinkList(K key, V value, LinkList<K,V> next){
            this.key= key;
            this.value = value;
            this.next = next;
        }
    }

