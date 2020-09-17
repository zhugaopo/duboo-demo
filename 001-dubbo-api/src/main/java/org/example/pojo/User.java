package org.example.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: duboo-demo
 * @description: 用户
 * @author: zhugaopo
 * @slogan: 致敬大师、致敬未来的你.
 * @create: 2020-09-17 10:45
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {
    private Integer userNo;
    private String userName;
    private Integer age;
}