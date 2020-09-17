package org.example.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: duboo-demo
 * @description: 会议
 * @author: zhugaopo
 * @slogan: 致敬大师、致敬未来的你.
 * @create: 2020-09-17 10:47
 */
@Data
@Accessors(chain = true)
public class Meeting implements Serializable {

    private Integer id;
    private String code;
    private String group;
    private User user;
}