package Univer.Exem.Homework_4.Hw4_2;

abstract class PairMap {
    protected  String keyArray [];
    protected  String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);

    abstract  String delete(String key);

    abstract int length();
}
