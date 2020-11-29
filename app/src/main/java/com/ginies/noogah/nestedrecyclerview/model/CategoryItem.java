package com.ginies.noogah.nestedrecyclerview.model;

public class CategoryItem {
    Integer itemId;
    Integer Imageurl;

    public CategoryItem(Integer itemId, Integer imageurl) {
        this.itemId = itemId;
        Imageurl = imageurl;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getImageurl() {
        return Imageurl;
    }

    public void setImageurl(Integer imageurl) {
        Imageurl = imageurl;
    }
}
