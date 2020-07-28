package com.tpblog.hystrix.cloudapi;


import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkedList<T> implements Iterable<T> {

    private int theSize;
    private int modCount = 0;
    private Node<T> begin;
    private Node<T> end;

    public MyLinkedList(){
        doClear();
    }


    public T get(int idx){
        return getNode(idx).data;
    }

    /**
     * 获取指定索引的节点
     * @param idx
     * @return
     */
    private Node<T> getNode(int idx){
        return getNode(idx, 0, size());
    }

    public void set(int idx, T d){
        setNode( idx, d );
    }

    /**
     * 修改指定位置的数据
     * @param idx
     * @param d
     * @return
     */
    private T setNode(int idx, T d ){
        Node<T> node = getNode(idx);
        T old = node.data;
        node.data = d;

        return old;
    }

    /**
     * 追加数据
     * @param d
     * @return
     */
    public boolean add(T d){
        add(size(), d);
        return true;
    }

    /**
     * 指定位置插入数据
     * @param idx
     * @param d
     */
    public void add(int idx, T d){
        addBefore(getNode(idx), d);
    }


    /**
     * 根据索引获取节点
     * @param idx
     * @param lower
     * @param upper
     * @return
     */
    private Node<T> getNode(int idx, int lower, int upper){
        if (idx < lower || idx > upper){
            throw new IndexOutOfBoundsException();
        }

        Node<T> p = null;
        if (idx < size()/2){
            p = begin;
            for (int i=0; i<=idx; i++){
                p = p.next;
            }
        }else{
            p = end;
            for (int i=size(); i>idx; i--){
                p = p.pre;
            }
        }
        return p;
    }

    /**
     * 在指定节点之前添加节点
     * @param p1
     * @param d
     */
    private void addBefore(Node<T> p1, T d){
        Node<T> newNode = new Node<>(d,p1.pre,p1);
        newNode.pre.next = newNode;
        p1.pre = newNode;

        theSize++;
        modCount++;
    }

    /**
     * 根据索引删除节点
     * @param idx
     * @return
     */
    public T remove(int idx){
        return remove(getNode(idx));
    }

    /**
     * 删除节点
     * @param p
     */
    private T remove(Node<T> p){
        p.pre.next = p.next;
        p.next.pre = p.pre;

        theSize--;
        modCount--;

        return p.data;
    }

    public int size(){
        return theSize;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public void clear(){
        doClear();
    }

    /**
     * 初始化节点
     */
    private void doClear(){
        begin = new Node<>(null,null,null);
        end = new Node<>(null,begin,null);
        begin.next = end;

        theSize = 0;
        modCount++;
    }


    /**
     * 迭代内部类
     */
    private class MyLinkedListIterator implements Iterator<T>{

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public T next() {
            return getNode(current++).data;
        }

        @Override
        public void remove() {
            MyLinkedList.this.remove(--current);
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {

        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    /**
     * 节点内部类
     * @param <NodeT>
     */
    private static class Node<NodeT>{
        public Node(NodeT d, Node<NodeT> p, Node<NodeT> n){
            data = d;
            pre = p;
            next = n;
        }
        public NodeT data;
        public Node<NodeT> pre;
        public Node<NodeT> next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyLinkedList{");
        for (int i=0; i<size(); i++){
            sb.append(getNode(i).data+",");
        }
        sb = new StringBuilder(sb.substring(0,sb.length()-1));
        sb.append("}");

        return sb.toString();
    }
}


