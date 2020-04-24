package com.company;

import com.company.bean.modern.Car;
import com.company.bean.old.SteamTrain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        byRef("ref_bean.xml");
        byName("name_bean.xml");
        byType("type_bean.xml");
        byConstructor("constructor_bean.xml");
    }

    public static void byRef(String configName){
        System.out.println("--- by ref ---");

        ApplicationContext context = new ClassPathXmlApplicationContext(configName);

        Car ladaDisel = (Car) context.getBean("ladaDisel");
        Car ladaV8 = (Car) context.getBean("ladaV8");

        System.out.println(ladaDisel);
        System.out.println(ladaV8);

        Car maybah1 = (Car) context.getBean("maybach");
        Car maybah2 = (Car) context.getBean("maybach");

        System.out.println(maybah1 == maybah2);

        System.out.println(maybah1);
        System.out.println(maybah2);
    }

    public static void byName(String configName){
        System.out.println("--- by name ---");

        ApplicationContext context = new ClassPathXmlApplicationContext(configName);

        Car ladaV8 = (Car) context.getBean("ladaV8");
        Car maybach = (Car) context.getBean("maybach");
        SteamTrain train = (SteamTrain) context.getBean("hogvartsExpress");

        System.out.println(ladaV8);
        System.out.println(maybach);
        System.out.println(train);

        ladaV8.getEngine().drive();
        maybach.getEngine().drive();
        train.getEngine().move();
    }

    public static void byType(String configName){

        System.out.println("--- by type ---");

        ApplicationContext context = new ClassPathXmlApplicationContext(configName);

        Car ladaV8 = (Car) context.getBean("ladaV8");
        System.out.println(ladaV8);
        ladaV8.getEngine().drive();

        SteamTrain train = (SteamTrain) context.getBean("hogvartsExpress");
        System.out.println(train);
        train.getEngine().move();
    }

    public static void byConstructor(String configName){
        System.out.println("--- by constructor ---");

        ApplicationContext context = new ClassPathXmlApplicationContext(configName);

        Car ladaV8 = (Car) context.getBean("ladaV8");
        SteamTrain train = (SteamTrain) context.getBean("hogvartsExpress");

        System.out.println(ladaV8);
        ladaV8.getEngine().drive();


        System.out.println(train);
        train.getEngine().move();


    }
}