package org.example.patterns.iterator;

public class IteratorDemoApp {
    public static void main(String[] args) {
        Iterator<ThemeColor> themeColorIterator = ThemeColor.getIterator();

        while (themeColorIterator.hasNext()){
            System.out.println(themeColorIterator.next());
        }
    }
}
