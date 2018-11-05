package com.fish.model.book;

import com.fish.model.GlobalModel;

import javax.persistence.*;

/**
 * Created by fish on 2018/11/5.
 */
@Entity
@Table(name = "book_type")
public class BookType extends GlobalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String typeName;

    private String typeBgImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeBgImg() {
        return typeBgImg;
    }

    public void setTypeBgImg(String typeBgImg) {
        this.typeBgImg = typeBgImg;
    }
}
