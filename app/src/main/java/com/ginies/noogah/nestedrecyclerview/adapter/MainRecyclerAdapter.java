package com.ginies.noogah.nestedrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ginies.noogah.nestedrecyclerview.R;
import com.ginies.noogah.nestedrecyclerview.model.AllCategory;
import com.ginies.noogah.nestedrecyclerview.model.CategoryItem;

import java.util.List;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainViewholder> {

    private Context context;
    private List<AllCategory> allCategorielist;

    public MainRecyclerAdapter(Context context, List<AllCategory> allCategorielist) {
        this.context = context;
        this.allCategorielist = allCategorielist;
    }

    @NonNull
    @Override
    public MainViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewholder(LayoutInflater.from(context).inflate(R.layout.main_recycler_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewholder holder, int position) {

        holder.catgoryTitle.setText(allCategorielist.get(position).getCategoryTitle());
        setAllCategoryRecycler(holder.itemRecycler, allCategorielist.get(position).getCategoryItemList());
    }

    @Override
    public int getItemCount() {
        return allCategorielist.size();
    }

    public static final class MainViewholder extends RecyclerView.ViewHolder {

        TextView catgoryTitle;
        RecyclerView itemRecycler;

        public MainViewholder(@NonNull View itemView) {
            super(itemView);
            catgoryTitle = itemView.findViewById(R.id.cat_title);
            itemRecycler = itemView.findViewById(R.id.item_recycler);
        }
    }

    private void setAllCategoryRecycler(RecyclerView recycler, List<CategoryItem> categoryItemList) {
        CategoryItemRecyclerAdapter itemRecyclerAdapter = new CategoryItemRecyclerAdapter(context, categoryItemList);
        recycler.setLayoutManager(new LinearLayoutManager(context, recycler.HORIZONTAL, false));
        recycler.setAdapter(itemRecyclerAdapter);
    }
}
