package com.youxiu326;


import com.youxiu326.realize.Coffee;
import com.youxiu326.realize.Tea;

public class RemoteControlTest {

    public static void main(String[] args) {

        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

    }

} 