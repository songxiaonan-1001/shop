package com.example.projectone.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectone.R;

/**
 * 首页
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private View view;
    private RecyclerView mRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_home, container, false);
        initView(inflate);
        initRecyclerView();
        initData();
        return inflate;
    }

    //请求数据
    private void initData() {

    }

    //初始化RecyclerView
    private void initRecyclerView() {

    }

    //找到页面中控件
    private void initView(View inflate) {
        mRecycler = (RecyclerView) inflate.findViewById(R.id.recycler);
    }
}
