package com.lanou3g.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by xyb on 15/9/21.
 */
public class MyFragment extends Fragment {
    public static MyFragment getFragment(int position){
        MyFragment f = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("arg", position + "");
        f.setArguments(bundle);
        return f;
    }

    private TextView mTextView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTextView = new TextView(getActivity());
        return mTextView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String arg = (String) getArguments().getCharSequence("arg");
        mTextView.setText(arg);

    }


}
