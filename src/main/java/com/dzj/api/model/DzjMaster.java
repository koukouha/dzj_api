package com.dzj.api.model;

public class DzjMaster {
    private Integer dzj_id;

    private Integer dzj_category_id;

    private String dzj_title_text;

    private String dzj_text;

    public Integer getDzj_id() {
        return dzj_id;
    }

    public void setDzj_id(Integer dzj_id) {
        this.dzj_id = dzj_id;
    }

    public Integer getDzj_category_id() {
        return dzj_category_id;
    }

    public void setDzj_category_id(Integer dzj_category_id) {
        this.dzj_category_id = dzj_category_id;
    }

    public String getDzj_title_text() {
        return dzj_title_text;
    }

    public void setDzj_title_text(String dzj_title_text) {
        this.dzj_title_text = dzj_title_text == null ? null : dzj_title_text.trim();
    }

    public String getDzj_text() {
        return dzj_text;
    }

    public void setDzj_text(String dzj_text) {
        this.dzj_text = dzj_text == null ? null : dzj_text.trim();
    }
}