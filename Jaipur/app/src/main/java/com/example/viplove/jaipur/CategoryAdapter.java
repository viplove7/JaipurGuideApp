package com.example.viplove.jaipur;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context context;
    public CategoryAdapter(Context tcontext,FragmentManager fm) {
        super(fm);
        context=tcontext;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Cafe();
        }else if(position==1){
            return new Monument();
        }else if(position==2){
            return new Festival();
        }else {
            return new Food();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return context.getString(R.string.cafe);
        }else if(position==1){
            return context.getString(R.string.monument);
        }else if(position==2){
            return context.getString(R.string.festival);
        }else {
            return context.getString(R.string.food);
        }
    }
}
