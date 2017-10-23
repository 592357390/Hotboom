package hotboom.yutian.com.myapplication.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import hotboom.yutian.com.myapplication.R;
import hotboom.yutian.com.myapplication.adapter.MainPagerAdapter;
import hotboom.yutian.com.myapplication.databinding.ActivityMainBinding;
import hotboom.yutian.com.myapplication.fragment.CustomerFragment;
import hotboom.yutian.com.myapplication.fragment.GoodsFragment;
import hotboom.yutian.com.myapplication.fragment.OrderFragment;

public class MainActivity extends AppCompatActivity {

    private List<Fragment> fragments = new ArrayList<>();

    private List<String> titles = new ArrayList<>();

    private List<Integer> imgIds = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fragments.add(new OrderFragment());
        fragments.add(new CustomerFragment());
        fragments.add(new GoodsFragment());

        titles.add("订单");
        titles.add("客户");
        titles.add("商品");

        imgIds.add(R.drawable.order_navigation);
        imgIds.add(R.drawable.customer_navigation);
        imgIds.add(R.drawable.goods_navigation);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.viewPager.setAdapter(new MainPagerAdapter(getSupportFragmentManager(), fragments));

        for (int i = 0; i < fragments.size(); i++) {
            TabLayout.Tab tab = binding.tabLayout.newTab();

            View navigationBtnLayout = LayoutInflater.from(this).inflate(R.layout.main_navigation_btn, null);
            TextView navigationBtn = navigationBtnLayout.findViewById(R.id.navigation_btn);
            navigationBtn.setText(titles.get(i));
            navigationBtn.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(this, imgIds.get(i)), null, null);

            tab.setCustomView(navigationBtn);
            binding.tabLayout.addTab(tab);
        }

        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                TabLayout.Tab tab = binding.tabLayout.getTabAt(position);
                if (tab != null && !tab.isSelected()) {
                    tab.select();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
//        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }
}
