package com.example.tabview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

   private TabLayout tabLayout;
   private ViewPager viewPager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout =findViewById(R.id.tableLayoutId);
        viewPager = findViewById(R.id.viewPagerId);


        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        setUpTabIcons();


    }

    private void setUpTabIcons(){

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_info_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_restaurant_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_directions_car_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_local_hotel_black_24dp);

    }

     class MyPagerAdapter extends FragmentPagerAdapter {

         String[] text= {"info","food","travel","hotel"};

            public MyPagerAdapter(@NonNull FragmentManager fm) {
                super(fm);
            }


            @Override
            public Fragment getItem(int position) {
                if(position==0)
                    return new infoFragment();
                else if(position==1)
                    return new foodFragment();
                else if(position==2)
                    return new hotelFragment();
                else if(position==3)
                    return new restFragment();
                return null;

            }

            @Override
            public int getCount() {
                return 4;
            }


            public CharSequence getPageTitle(int position) {
                return text[position];
            }
        }

        }


