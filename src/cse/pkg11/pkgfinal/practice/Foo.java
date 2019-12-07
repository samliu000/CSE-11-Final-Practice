/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.pkg11.pkgfinal.practice;

/**
 *
 * @author boo13
 */
public class Foo {
    int add(int x, int y){
        return x + y;
    }
    double add(double y, double x){
        return x+y;
    }
    
    public static void hi(int i){}
    public static void hi(double i){}
    public void hey(double i){}
    public static <T> int printSize(T var){return 1;}
    public <T> int printSize(T a, T b){return 1;}
}
