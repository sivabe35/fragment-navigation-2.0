package com.fragmentnavigation.gabor.fragmentnavigationsample;

import android.os.Bundle;

import com.fragmentnavigation.gabor.fragmentnavigationsample.navigation.BaseFragmentActivity;


public class MainActivity extends BaseFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getNavigationFacade().navigateTo(FragmentA.class);
    }


    @Override
    public int getFragmentContainerID() {
        return R.id.fragmentContainer;
    }


}
