package com.example.sumit.databindingdemo2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sumit.databindingdemo2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static ProductObject productObject;
    public static ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        productObject = new ProductObject("First name");
        MyHandler handler = new MyHandler();

        binding.setMHandler(handler);
        binding.setMObject(productObject);

        //ObservableArrayMap<String, Object> arrayMap = new ObservableArrayMap<>();
        //arrayMap.put("name", "This is test2");
        //binding.setProduct(arrayMap);
    }
}
