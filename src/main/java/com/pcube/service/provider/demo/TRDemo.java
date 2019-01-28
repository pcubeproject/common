package com.pcube.service.provider.demo;

import com.pcube.service.TResponse;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by kenya on 2019/1/26.
 */
@Data
public class TRDemo extends TResponse implements Serializable {
    String demo;
}
