package com.pcube.service;

/**
 * Created by kenya on 2019/3/18.
 */
public class TEvent {
    Object payload;

    public static class IdleEvent extends TEvent{

    }

    public static class AudioEvent extends TEvent{
        public AudioEvent(String text){
            this.payload = text;
        }
    }

    public static class MsgEvent extends TEvent{
        public MsgEvent(String message){
            this.payload = message;
        }
    }


    public Object getPayLoad(){
        return payload;
    }

    public void setPayLoad(Object payLoad){
        this.payload = payLoad;
    }
}
