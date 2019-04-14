package xyz.ieden.common.util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author gavin
 * @date 2019/4/13 23:33
 */
@Data
public class Page<T> implements Serializable {

    private Integer pageSize;
    private List<T> list;

}
