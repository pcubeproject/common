package com.pcube.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kenya on 2019/3/18.
 */
public enum ActionEnum {
    NOP(1 , "nop"),
    WAIT(2, "wait"),
    TRANSITION(3,"TRANSITION"),
    AUDIO(4, "audio")
    ;

    int id;
    String name;

    ActionEnum(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    static Map<Integer,ActionEnum> idMap = new HashMap<>();
    static Map<String,ActionEnum> nameMap = new HashMap<>();

    static {
        for (ActionEnum action : ActionEnum.values()) {
            idMap.put(action.getId(),action);
            nameMap.put(action.getName(),action);
        }
    }

    public static ActionEnum getById(int id){
        return idMap.get(id);
    }
    public static ActionEnum getByName(String name){
        return nameMap.get(name);
    }
}
