package com.example.projectone;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.projectone.adapter.VPAdapter;
import com.example.projectone.fragment.CartFragment;
import com.example.projectone.fragment.ClassifyFragment;
import com.example.projectone.fragment.HomeFragment;
import com.example.projectone.fragment.MeFragment;
import com.example.projectone.fragment.SubjectFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbarMain;
    private ViewPager mViewpagerMain;
    private TabLayout mTablayoutMain;
    private VPAdapter vpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    //找到页面上的控件
    private void initView() {
        mToolbarMain = (Toolbar) findViewById(R.id.toolbar_main);
        mViewpagerMain = (ViewPager) findViewById(R.id.viewpager_main);
        mTablayoutMain = (TabLayout) findViewById(R.id.tablayout_main);

        initToolBar();
        initContent();
        initTabLayout();
    }

    //初始化tablayout
    private void initTabLayout() {
        mTablayoutMain.addTab(mTablayoutMain.newTab().setText(R.string.home));
        mTablayoutMain.addTab(mTablayoutMain.newTab().setText(R.string.subject));
        mTablayoutMain.addTab(mTablayoutMain.newTab().setText(R.string.classify));
        mTablayoutMain.addTab(mTablayoutMain.newTab().setText(R.string.cart));
        mTablayoutMain.addTab(mTablayoutMain.newTab().setText(R.string.me));
        mTablayoutMain.setupWithViewPager(mViewpagerMain);
        mTablayoutMain.getTabAt(0).setText(R.string.home).setIcon(R.drawable.selector_choice);
        mTablayoutMain.getTabAt(1).setText(R.string.subject).setIcon(R.drawable.selector_topic);
        mTablayoutMain.getTabAt(2).setText(R.string.classify).setIcon(R.drawable.selector_sort);
        mTablayoutMain.getTabAt(3).setText(R.string.cart).setIcon(R.drawable.selector_shoping);
        mTablayoutMain.getTabAt(4).setText(R.string.me).setIcon(R.drawable.selector_me);
    }

    //初始化主内容区域
    private void initContent() {
        List<Fragment> views = new ArrayList<>();
        views.add(new HomeFragment());
        views.add(new SubjectFragment());
        views.add(new ClassifyFragment());
        views.add(new CartFragment());
        views.add(new MeFragment());
        //创建ViewPager的适配器
        vpAdapter = new VPAdapter(getSupportFragmentManager(), views);
        //设置适配器
        mViewpagerMain.setAdapter(vpAdapter);
    }

    //初始化toolbar
    private void initToolBar() {
        mToolbarMain.setTitle("");
        setSupportActionBar(mToolbarMain);
    }
}
