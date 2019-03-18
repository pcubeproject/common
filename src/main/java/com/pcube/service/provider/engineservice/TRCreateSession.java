package com.pcube.service.provider.engineservice;

import com.pcube.service.TRequest;
import com.pcube.service.TResponse;
import lombok.Data;

/**
 * Created by kenya on 2019/3/18.
 */
@Data
public class TRCreateSession extends TResponse {
    long sessionId;
}
