package com.android.plugindemo.dynamic;

import com.android.plugindemo.IBank;
import com.android.plugindemo.Man;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicClient {
    //动态代理 java自带动态代理机智
    public static void main(String[] args){

        Man man = new Man();

        IBank proxy= (IBank) Proxy.newProxyInstance(IBank.class.getClassLoader(),//第一个参数
                new Class<?>[]{IBank.class},//接口
                new BankInvokationHandle(man));//回调

        proxy.applyBank();
        System.out.println("===========");
        proxy.loseBank();
    }

    private static class BankInvokationHandle implements InvocationHandler {

        private IBank man;

        public BankInvokationHandle(Man man) {
            this.man = man;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //方法回调 方法执行还是要Man执行
            System.out.println("做一些事情 方法执行"+method.getName());
            Object object=method.invoke(man,args);
            System.out.println("完毕"+method.getName());
            return object;
        }
    }
}
