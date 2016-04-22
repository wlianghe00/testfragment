package com.test.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2016/3/23 0023.
 */
public class Category implements Parcelable {
    private String cateName;
    private String cateType;
    private String fragmentName;

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getCateType() {
        return cateType;
    }

    public void setCateType(String cateType) {
        this.cateType = cateType;
    }

    public String getFragmentName() {
        return fragmentName;
    }

    public void setFragmentName(String fragmentName) {
        this.fragmentName = fragmentName;
    }

    public static Category createCategory(String cateName, String cateType, String fragmentName) {
        Category category = new Category();
        category.setCateName(cateName);
        category.setCateType(cateType);
        category.setFragmentName(fragmentName);
        return category;
    }

    public Category() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cateName);
        dest.writeString(this.cateType);
        dest.writeString(this.fragmentName);
    }

    protected Category(Parcel in) {
        this.cateName = in.readString();
        this.cateType = in.readString();
        this.fragmentName = in.readString();
    }

    public static final Creator<Category> CREATOR = new Creator<Category>() {
        @Override
        public Category createFromParcel(Parcel source) {
            return new Category(source);
        }

        @Override
        public Category[] newArray(int size) {
            return new Category[size];
        }
    };
}
