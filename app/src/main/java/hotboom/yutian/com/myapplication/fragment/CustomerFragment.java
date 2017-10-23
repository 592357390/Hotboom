package hotboom.yutian.com.myapplication.fragment;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hotboom.yutian.com.myapplication.R;
import hotboom.yutian.com.myapplication.databinding.FragmentCustomerBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomerFragment extends Fragment {



    public CustomerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentCustomerBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_customer, container, false);

        return binding.getRoot();
    }

}
