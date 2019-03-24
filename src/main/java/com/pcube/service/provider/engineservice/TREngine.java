package com.pcube.service.provider.engineservice;

import com.pcube.service.TEvent;
import com.pcube.service.TRequest;
import com.pcube.service.TResponse;
import lombok.Data;

/**
 * Created by kenya on 2019/1/24.
 */
@Data
public class TREngine extends TResponse {
    TEvent event;
}
