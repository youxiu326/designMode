package com.youxiu326.realize;

import com.youxiu326.inter.Command;

public class Stereo{

    public void on(){
        System.out.println("stereo");
    }
    public void setCD(){
        System.out.println("setCD");
    }
    public void setVolume(int volume){
        System.out.println("setVolume"+ volume);
    }


}