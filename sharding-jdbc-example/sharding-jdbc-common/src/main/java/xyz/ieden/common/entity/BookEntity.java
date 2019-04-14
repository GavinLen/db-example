package xyz.ieden.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author gavin
 * @date 2019/4/14 13:34
 */
@Data
public class BookEntity implements Serializable {

    private Integer id;
    /**
     * 书籍名称
     */
    private String bookName;

    /**
     * 书籍作者
     */
    private String bookAuthor;

    /**
     * 书籍类型
     */
    private Integer bookType;

    /**
     * 书籍价格
     */
    private Float bookPrice;

    /**
     * ISBN
     */
    private String isbn;

    /**
     * 创建时间
     */
    private Date createDate;
}
