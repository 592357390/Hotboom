package hotboom.yutian.com.myapplication.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import hotboom.yutian.com.myapplication.R;
import hotboom.yutian.com.myapplication.databinding.FragmentOrderBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {


    FragmentOrderBinding binding;
    List<String> orderType = new ArrayList<>();


    public OrderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_order, container, false);
        initView();
        return binding.getRoot();
    }

    private void initView() {

    }

}
