package com.example.sumit.databindingdemo2;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by sumit on 08/05/17.
 */

public class ProductObject extends BaseObservable {

    private String name;

    //public final ObservableField<String> name = new ObservableField<>();

    public ProductObject(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //System.out.println("##Test##  ProductObject  :  setName");
        this.name = name;
        notifyPropertyChanged(com.example.sumit.databindingdemo2.BR.name);
    }
}
