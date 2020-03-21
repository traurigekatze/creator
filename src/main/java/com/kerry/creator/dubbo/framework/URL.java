package com.kerry.creator.dubbo.framework;

import lombok.Data;

import java.io.Serializable;

/**
 * **********书山有路勤为径**********
 *
 * @author k1rry
 * @date 2020/3/21
 * **********学海无涯苦作舟**********
 */
@Data
public class URL implements Serializable {

    private String hostname;

    private Integer port;

    public URL(String hostname, Integer port) {
        this.hostname = hostname;
        this.port = port;
    }
}
