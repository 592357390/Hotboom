package hotboom.yutian.com.myapplication.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;

import java.util.List;

import hotboom.yutian.com.myapplication.R;
import hotboom.yutian.com.myapplication.adapter.ContactAdapter;
import hotboom.yutian.com.myapplication.bean.UserContact;
import hotboom.yutian.com.myapplication.databinding.ActivityImportContactBinding;
import hotboom.yutian.com.myapplication.databinding.ImportContactActionbarLayoutBinding;

public class ImportContactActivity extends AppCompatActivity {

    public static void startSelf(Context context) {
        context.startActivity(new Intent(context, ImportContactActivity.class));
    }

    public class ImportContactHandler {
        public void back(View view) {
            finish();
        }

        public void importContact(View view) {

        }
    }

    private ActivityImportContactBinding binding;

    private List<UserContact> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayShowCustomEnabled(true);
            ImportContactActionbarLayoutBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.import_contact_actionbar_layout, null, false);
            inflate.setImportContact(new ImportContactHandler());
            actionBar.setCustomView(inflate.getRoot());
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_import_contact);

        binding.contactRecycleView.setLayoutManager(new LinearLayoutManager(this));
        binding.contactRecycleView.setAdapter(new ContactAdapter(this));
    }


}
