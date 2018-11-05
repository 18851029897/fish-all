package com.fish.model.book;

import com.fish.model.GlobalModel;

import javax.persistence.*;

/**
 * Created by fish on 2018/11/5.
 */
@Entity
@Table(name = "book_type")
public class BookType extends GlobalModel {

    private String typeName;

    private String typeBgImg;

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
