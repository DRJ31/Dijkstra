package model;

import controller.ModelListener;

interface IDatabaseOperation<T> {
    boolean insert();

    boolean delete();

    boolean update();

    void addListener(ModelListener listener);

    void notifyListener();

    default String stringParser(String str) {
        return str.replaceAll("'", "''");
    }
}