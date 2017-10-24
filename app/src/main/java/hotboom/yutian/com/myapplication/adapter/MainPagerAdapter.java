package hotboom.yutian.com.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zx on 2017/10/23 0023.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {


    private List<Fragment> fragments = new ArrayList<>();

    private List<String> titles = new ArrayList<>();

    public MainPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);

        this.fragments = fragments;

        titles.add("订单");
        titles.add("客户");
        titles.add("商品");
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

}
