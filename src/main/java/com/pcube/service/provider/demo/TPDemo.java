package com.pcube.service.provider.demo;

import com.pcube.service.TRequest;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by kenya on 2019/1/26.
 */
@Data
public class TPDemo extends TRequest implements Serializable {
    String demo;
}
