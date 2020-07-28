package com.tpblog.hystrix.cloudapi;

import sun.reflect.generics.tree.Tree;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

    public static void main(String[] args) {

        MyLinkedList<String> names = new MyLinkedList<>();

        names.add("wangwu");
        names.add("zhaoliu1");
        names.add("zhaoliu2");
        names.add("zhaoliu3");
        names.add("zhaoliu4");

        for (Iterator<String> it = names.iterator(); it.hasNext();){
            if ("zhaoliu1".equals(it.next())){
                it.remove();
            }
        }



        System.out.println(names);

        /*names.add("liuliu");*/
        /*names.add(3,"zhaoliu0");
        System.out.println(names.isEmpty());

        names.remove(2);

        System.out.println(names);

        names.set(0,"zhangliu10");
        System.out.println(names);*/

        /*MyArrayList<String> names = new MyArrayList<String>();

        names.add("zhang");
        names.add("lisi");

        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.isEmpty());

        for (String name: names){
            System.out.println(name);
        }

        for (Iterator iterator=names.iterator();iterator.hasNext();){
            String n = (String) iterator.next();
            System.out.println("it--"+n);
            if (n=="zhang"){
                iterator.remove();
            }
        }
        System.out.println(names.get(0));
        names.add(0,"wangwu");
        System.out.println(names);*/


        /*ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
                    System.out.println(dateFormat.format(new Date())+"---"+ finalI);
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                    }
                }
            });
        }*/



       /* ExecutorService cacheThreadPool = Executors.newCachedThreadPool();

        for (int n=0; n<5; n++){
            int finalN = n;
            cacheThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
                    System.out.println(dateFormat.format(new Date())+"---"+ finalN);
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                    }
                }
            });
        }
        cacheThreadPool.shutdownNow();*/
       /* ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();

        for (int n=0; n<5; n++){
            int finalN = n;
            singleThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                    System.out.println(dateFormat.format(new Date())+"---"+String.valueOf(finalN));
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                    }
                }
            });
        }

        System.out.println("main");*/


        //ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

      /*  scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        },3,TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();*/

        /*scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        },1,3,TimeUnit.SECONDS);*/
    }
}
