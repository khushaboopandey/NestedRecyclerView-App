package com.ginies.noogah.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ginies.noogah.nestedrecyclerview.adapter.MainRecyclerAdapter;
import com.ginies.noogah.nestedrecyclerview.model.AllCategory;
import com.ginies.noogah.nestedrecyclerview.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<CategoryItem> categoryItemList1 = new ArrayList<>();
        categoryItemList1.add(new CategoryItem(1, R.drawable.holly1));
        categoryItemList1.add(new CategoryItem(1, R.drawable.holly2));
        categoryItemList1.add(new CategoryItem(1, R.drawable.holly3));
        categoryItemList1.add(new CategoryItem(1, R.drawable.holly4));
        categoryItemList1.add(new CategoryItem(1, R.drawable.holly5));
        categoryItemList1.add(new CategoryItem(1, R.drawable.holly6));

        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1, R.drawable.bos1));
        categoryItemList2.add(new CategoryItem(1, R.drawable.bos2));
        categoryItemList2.add(new CategoryItem(1, R.drawable.bos3));
        categoryItemList2.add(new CategoryItem(1, R.drawable.bos4));
        categoryItemList2.add(new CategoryItem(1, R.drawable.bos5));
        categoryItemList2.add(new CategoryItem(1, R.drawable.bos6));

        List<CategoryItem> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add(new CategoryItem(1, R.drawable.mdi1));
        categoryItemList3.add(new CategoryItem(1, R.drawable.mdh2));
        categoryItemList3.add(new CategoryItem(1, R.drawable.mdh3));
        categoryItemList3.add(new CategoryItem(1, R.drawable.mdh4));
        categoryItemList3.add(new CategoryItem(1, R.drawable.mdh5));
        categoryItemList3.add(new CategoryItem(1, R.drawable.mdh6));

        List<CategoryItem> categoryItemList4 = new ArrayList<>();
        categoryItemList4.add(new CategoryItem(1, R.drawable.bd1));
        categoryItemList4.add(new CategoryItem(1, R.drawable.bd2));
        categoryItemList4.add(new CategoryItem(1, R.drawable.bd3));
        categoryItemList4.add(new CategoryItem(1, R.drawable.bd4));
        categoryItemList4.add(new CategoryItem(1, R.drawable.bd5));
        categoryItemList4.add(new CategoryItem(1, R.drawable.bd6));

        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Hollywood", categoryItemList1));
        allCategoryList.add(new AllCategory("Best of Oscar", categoryItemList2));
        allCategoryList.add(new AllCategory("Movies Dubbed in Hindi", categoryItemList3));
        allCategoryList.add(new AllCategory("BollyWood", categoryItemList4));

        setMainCategoryRecycler(allCategoryList);
    }

    private void setMainCategoryRecycler(List<AllCategory> allCategorielist) {
        mainCategoryRecycler = findViewById(R.id.mainecyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategorielist);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);

    }
}