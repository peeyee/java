package com.pipa.designpattern.singleton;

/**
 * purpose:
 * author: hwf
 * created: 2020/12/31
 */
public class LazySingleton {

    private static volatile LazySingleton instance;
    private LazySingleton(){};

    /*
    * not thread satefy.
    * */
    public static LazySingleton getInstance()
    {
        if ( instance == null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }

    /*
     * thread satefy,but not effective.
     * */
    public static synchronized LazySingleton getInstanceSafe()
    {
        if ( instance == null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }

    /*
     * thread satefy,but not effective.
     * */
    public static  LazySingleton getInstanceSafe2()
    {
        synchronized(LazySingleton.class) {
            if (instance == null) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }


    /*
     * thread satefy,but not effective.
     * */
    public static LazySingleton getInstanceConcurrent()
    {
        if ( instance == null)
        {
            synchronized (LazySingleton.class)
            {
                if ( instance == null){
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }

}
