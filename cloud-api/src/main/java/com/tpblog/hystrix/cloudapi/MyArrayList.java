package com.tpblog.hystrix.cloudapi;


import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<T> implements Iterable<T> {

    private final Integer DEFAULT_SIZE=10;

    private int size;

    private T[] items;



    public MyArrayList(){
        // 泛型不能直接实例化
        items = (T[]) new Object[DEFAULT_SIZE];
    }

    public void clear(){
        doClear();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public T get(int idx){
        if (idx < 0 || idx >= size()){
            throw new ArrayIndexOutOfBoundsException();
        }

        return items[idx];
    }

    /**
     * 修改指定位置元素
     * @param idx
     * @param item
     */
    public T set(int idx, T item){
        if (idx < 0 || idx >= size()){
            throw new ArrayIndexOutOfBoundsException();
        }

        T old = items[idx];
        items[idx] = item;

        return old;
    }

    /**
     * 添加元素
     * @param item
     */
    public boolean add(T item){
        add(size(),item);
        return true;
    }
    public void add(int idx,T item){
        if (idx == items.length){
            ensureCapacity(2*size() + 1);
        }
        for (int i=size(); i>idx; i--){
            items[i] = items[i-1];
        }

        items[idx] = item;

        size++;
    }

    /**
     * 删除元素
     * @param idx
     * @return
     */
    public T remove(int idx){
        T removeItem = items[idx];
        System.out.println("rm---"+idx);
        for (int i=idx; i<size()-1; i++){
            items[i] = items[i+1];
        }
        size--;
        return removeItem;
    }

    /**
     * 创建迭代器内部类
     */
    private class MyArrayListIterator implements Iterator<T>{

        private int current = 0;

        public boolean hasNext(){
            return current < size();
        }

        public T next(){
            if (!hasNext()){
                throw new NoSuchElementException();
            }

            return items[current++];
        }

        public void remove(){
            MyArrayList.this.remove(--current);
        }
    }


    /**
     * 扩充容量
     * @param capacity
     */
    public void ensureCapacity(int capacity){

        if(capacity < size || DEFAULT_SIZE == size){
            return;
        }

        T[] oldItem = items;
        items = (T[])new Object[capacity];
        for(int i=0; i<capacity; i++){
            items[i] = oldItem[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    /**
     * 初始化容器
     */
    private void doClear(){
        size=0;
        ensureCapacity(DEFAULT_SIZE);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("MyArrayList{");
        for (int i=0; i<size(); i++){
           /* if (i==size()-1){
                sb.append(items[i]);
                break;
            }*/
            sb.append(items[i]+",");
        }
        sb = new StringBuilder(sb.substring(0,sb.length()-1));

        sb.append("}");


        return sb.toString();
    }
}
