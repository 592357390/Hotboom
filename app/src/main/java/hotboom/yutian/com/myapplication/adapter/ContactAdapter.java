package hotboom.yutian.com.myapplication.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import hotboom.yutian.com.myapplication.R;
import hotboom.yutian.com.myapplication.bean.UserContact;
import hotboom.yutian.com.myapplication.databinding.ItemContactLayoutBinding;
import hotboom.yutian.com.myapplication.utils.ContactUtils;

/**
 * Created by zx on 2017/10/24 0024.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private Context context;
    private List<UserContact> addressBook;
    private List<Integer> choosePosition = new ArrayList<>();

    public ContactAdapter(Context context) {
        this.context = context;
        addressBook = ContactUtils.getAddressBook(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemContactLayoutBinding bind = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.item_contact_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(bind.getRoot());
        viewHolder.binding = bind;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.binding.setUser(addressBook.get(position));

    }

    @Override
    public int getItemCount() {
        return addressBook.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ItemContactLayoutBinding binding;

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
