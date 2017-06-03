package com.example.sumit.databindingdemo2;

import android.view.View;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sumit on 08/05/17.
 */

public class MyHandler {

    private List<String> randomString = Arrays.asList("King", "Book", "Ice", "Android", "Java");

    public void onClickTextShow(View view) {
        System.out.println("##Test##  MyHandler  :  onClickTextShow");
        String mRandom = getRandomString();
        MainActivity.productObject.setName(mRandom);
        MainActivity.binding.clickButton.setText(mRandom);
    }

    public void onClickTextShowWIthListenerBinding(String name) {
        System.out.println("##Test##  MyHandler  :  onClickTextShow");
        String mRandom = getRandomString();
        MainActivity.productObject.setName(mRandom);
        MainActivity.binding.clickButton.setText(name);
    }

    private String getRandomString() {
        Collections.shuffle(randomString);
        return randomString.get(0);
    }
}
