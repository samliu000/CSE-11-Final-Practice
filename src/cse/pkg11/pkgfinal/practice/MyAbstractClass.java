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
abstract class MyAbstractClass implements MyInterface {
    @Override
    public void methodA(){
        System.out.print("A");
    }
    public void methodC(){
        System.out.print("C");
    }
}
