package com.tpblog.springcloud;

import java.lang.reflect.Field;

class StudyTest {
    private  String co="red";

    private Integer in=1;

    public static void main(String[] args) {
        /*System.out.println(Color.valueOf("RED").getColor());
        System.out.println(Color.valueOf("RED").getIndex());
        System.out.println(Color.RED.getInfo());
        System.out.println(Color.BLUE.getInfo());
        System.out.println(Boolean.TYPE.equals(boolean.class));*/

        /*try {
            Color color = Color.class.getDeclaredConstructor(String.class,Integer.class).newInstance("red",1);
            System.out.println(color.getColor());
        } catch (Exception e) {
            e.printStackTrace();
        }*/



        try {
            Class<StudyTest> studyClass = StudyTest.class;
            StudyTest st= studyClass.newInstance();
            System.out.println(st.co);
            Field f1 = studyClass.getDeclaredField("co");
            System.out.println(f1.getType());
        } catch (Exception e) {
        }

    }
}



enum Color{
    // 在编译生成实例时，会将()中的值传入构造方法
    RED("red",1){
        public String getInfo(){
            return "red impl";
        }
    }
    ,BLUE("blue",2){
        public String getInfo(){
            return "blue impl";
        }
    }

    ,BLACK("black",3){
        public String getInfo(){
            return "black impl";
        }
    };

    private final String mon;
    private final Integer index;

    // 抽象方法
    public abstract String getInfo();

    // 私有构造
    private Color(String mon,Integer index){
        this.mon = mon;
        this.index = index;
    }

    public String getColor(){
        return mon;
    }

    public Integer getIndex(){
        return index;
    }
}