package com.coolweather.android.db;

import org.litepal.crud.DataSupport;
import org.litepal.crud.LitePalSupport;

/**
 * @author shkstart
 * @create 2023-01-09-10:02
 */

public class Province extends DataSupport {

    private int id;  //实体类中的字段

    private String provinceName;  //记录省的名字

    private int provinceCode; //省的代号


    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
