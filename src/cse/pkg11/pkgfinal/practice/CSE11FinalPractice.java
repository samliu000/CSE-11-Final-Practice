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
public class CSE11FinalPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Foo foo = new Foo();
        Foo bar = new Bar();
        System.out.println(foo.add(1,2));
        System.out.println(foo.add(1.0,2));
        System.out.println(bar.add(1,2));
        System.out.println(bar.add(1, 2.0));
        
        MyConcreteClass obj1 = new MyConcreteClass();
        obj1.methodA();
        obj1.methodB();
        obj1.methodC();
        obj1.methodD();
        System.out.println();

//        Options
//        A. ABCD
//        B. Compile time error: methodA() is undefined for the type MyConcreteClass
//        C. Compile time error: methodC() is undefined for the type MyConcreteClass
//        D. Run time error

        MyInterface obj2 = new MyConcreteClass();
        obj2.methodA();
        obj2.methodB();
        //Can't find method obj2.methodC();
        //Can't find method obj2.methodD();
        System.out.println();

//      Options
//      A. ABCD
//      B. Compile time error: methodC() is undefined for the type MyInterface
//      C. Compile time error: methodD() is undefined for the type MyInterface
//      D. Run time error
//      E. Both B and C

        MyAbstractClass obj3 = new MyConcreteClass();
        obj3.methodA();
        obj3.methodB();
        obj3.methodC();
        //Can't find method obj3.methodD();
        System.out.println();
    }
    
}
