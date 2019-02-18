package com.android.plugindemo;

/**
 * @author Created by freed
 * Created by freed on 2019/2/18.
 * Date:2019/2/18
 * @description 银行业务员
 */
public class Salesman implements IBank{

    private IBank man;

    public Salesman(IBank man) {
        this.man = man;
    }

    @Override
    public void applyBank() {
        System.out.println("先搞一些流程");
        man.applyBank();
        System.out.println("办理完毕");
    }

    @Override
    public void loseBank() {
        System.out.println("做一些流程");
        man.loseBank();
        System.out.println("办理完毕");
    }
}
