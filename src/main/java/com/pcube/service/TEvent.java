package com.pcube.service;

import java.io.Serializable;

/**
 * Created by kenya on 2019/3/18.
 */
public class TEvent implements Serializable{
    Object payload;

    public static String TRANSITION_INTENTION = "t";

    public static class IdleEvent extends TEvent{
        @Override
        public String toString() {
            return "IdleEvent{" +
                    "name=" +this.getClass().getSimpleName()+
                    ",payload=" + payload+
                    "}";
        }
    }

    public static class NopEvent extends TEvent{
        @Override
        public String toString() {
            return "NopEvent{" +
                    "name=" +this.getClass().getSimpleName()+
                    ",payload=" + payload+
                    "}";
        }
    }

    public static class WaitEvent extends TEvent{
        @Override
        public String toString() {
            return "WaitEvent{" +
                    "name=" +this.getClass().getSimpleName()+
                    ",payload=" + payload+
                    "}";
        }
    }

    public static class AudioEvent extends TEvent{
        public AudioEvent(Object payload){
            this.payload = payload;
        }

        @Override
        public String toString() {
            return "AudioEvent{" +
                    "name=" +this.getClass().getSimpleName()+
                    ",payload=" + payload+
                    "}";
        }
    }

    public static class MsgEvent extends TEvent{
        public MsgEvent(String message){
            this.payload = message;
        }

        @Override
        public String toString() {
            return "MsgEvent{" +
                    "name=" +this.getClass().getSimpleName()+
                    ",payload=" + payload+
                    "}";
        }
    }

    public static class TransitionEvent extends InternalEvent{
        @Override
        public String toString() {
            return "TransitionEvent{" +
                    "name=" +this.getClass().getSimpleName()+
                    ",payload=" + payload+
                    "}";
        }
    }

    public static abstract class InternalEvent extends TEvent{

    }


    public Object getPayLoad(){
        return payload;
    }

    public void setPayLoad(Object payLoad){
        this.payload = payLoad;
    }
}
