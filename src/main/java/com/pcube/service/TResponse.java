package com.pcube.service;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by kenya on 2019/1/24.
 */
@Data
public class TResponse implements Serializable {
    Object result;
    boolean success;
}
