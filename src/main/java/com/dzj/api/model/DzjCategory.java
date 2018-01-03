package com.dzj.api.model;

public class DzjCategory {
    private Integer dzj_category_id;

    private String dzj_category_text;

    public Integer getDzj_category_id() {
        return dzj_category_id;
    }

    public void setDzj_category_id(Integer dzj_category_id) {
        this.dzj_category_id = dzj_category_id;
    }

    public String getDzj_category_text() {
        return dzj_category_text;
    }

    public void setDzj_category_text(String dzj_category_text) {
        this.dzj_category_text = dzj_category_text == null ? null : dzj_category_text.trim();
    }
}