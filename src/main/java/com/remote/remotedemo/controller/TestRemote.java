package com.remote.remotedemo.controller;

@Controller
@RequestMapping("/remote")
public class TestRemote {
    public void getRemote(){
        System.out.println("remote has connect");

        System.out.println("I Love Shengsheng");

        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
