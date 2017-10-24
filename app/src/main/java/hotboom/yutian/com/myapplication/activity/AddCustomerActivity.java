package hotboom.yutian.com.myapplication.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import hotboom.yutian.com.myapplication.R;
import hotboom.yutian.com.myapplication.databinding.ActionbarLayoutBinding;
import hotboom.yutian.com.myapplication.databinding.ActivityAddCustomerBinding;

public class AddCustomerActivity extends AppCompatActivity {

    private ActivityAddCustomerBinding binding;

    public class AddCustomerHandler {

        public void importContact(View view) {
            ImportContactActivity.startSelf(AddCustomerActivity.this);
        }

        public void back(View view) {
            finish();
        }

        public void addCustomer(View view) {
            if (TextUtils.isEmpty(binding.name.getText())
                    && TextUtils.isEmpty(binding.address.getText())
                    && TextUtils.isEmpty(binding.phone.getText())) {
                Toast.makeText(AddCustomerActivity.this, "信息输入不完整，请检查", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void startSelf(Context context) {
        context.startActivity(new Intent(context, AddCustomerActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_customer);
        binding.setHanlder(new AddCustomerHandler());

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayShowCustomEnabled(true);
            ActionbarLayoutBinding inflate = DataBindingUtil.inflate(getLayoutInflater(), R.layout.actionbar_layout, null, false);
            inflate.setAddCustomer(new AddCustomerHandler());
            actionBar.setCustomView(inflate.getRoot());
        }
    }
}
