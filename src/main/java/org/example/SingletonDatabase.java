package org.example;

public class SingletonDatabase {

    private static SingletonDatabase instance;

    public SingletonDatabase() {

    }
    public static SingletonDatabase getInstance() {
        if (instance == null) {
            instance = new SingletonDatabase();
        }
        return instance;
    }

    public void showMessage(String e) {
        System.out.println(e);
    }

}
