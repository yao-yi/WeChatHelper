package zhaofeng.wechathelper.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import zhaofeng.wechathelper.R;
import zhaofeng.wechathelper.app.BaseActivity;

public abstract class SingleFragmentActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_fragment);
        if (savedInstanceState == null)
        {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.add(R.id.container, createFragment());
            transaction.commitAllowingStateLoss();
        }
    }

    protected abstract Fragment createFragment();

}
