package com.android.plugindemo;

/**
 * @author Created by freed
 * Created by freed on 2019/2/18.
 * Date:2019/2/18
 * @description
 */
public class Man implements IBank{
    @Override
    public void applyBank() {
        System.out.println("办卡");
    }

    @Override
    public void loseBank() {
        System.out.println("取钱");
    }
}
