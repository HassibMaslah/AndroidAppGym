package com.example.hassi.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Abdo extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout sliderDotsPanel;
    private int dotsCount;
    private ImageView[] dots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdo);

        viewPager =(ViewPager) findViewById(R.id.viewPagerAb);
        sliderDotsPanel=(LinearLayout) findViewById(R.id.SliderDotsAb);

        ViewPagerAdapterAb viewPagerAdapterAb=new ViewPagerAdapterAb(this);
        viewPager.setAdapter(viewPagerAdapterAb);

        dotsCount=viewPagerAdapterAb.getCount();
        dots=new ImageView[dotsCount];
        for (int i=0;i<dotsCount;i++){
            dots[i]=new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dots));
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.MATCH_PARENT);
            params.setMargins(8,0,8,0);
            sliderDotsPanel.addView(dots[i],params);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dots));
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    for (int i=0;i<dotsCount;i++){
                        dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dots));
                    }
                    dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dots));
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }
    }
}
