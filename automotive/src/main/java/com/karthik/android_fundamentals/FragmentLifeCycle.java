package com.karthik.android_fundamentals;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentLifeCycle extends Fragment {
    String TAG = "Lifecycle Methods:";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach method called");
        // When the fragment gets attached to the parent activity or parent fragment then this callback gets called.
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate method called");
        // When the fragment is about to get created then this callback gets called.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView method called");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_life_cycle, container, false);
        // when the fragment is about to draw it's UI then this callback gets called.
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "onViewCreated method called");
        // Once the UI of fragment is created to confirm that it got created this callback gets called.
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "onActivityCreated method called");
        // To let the fragment know that it's parent activity onCreate callback has been completed.
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.i(TAG, "onViewStateRestored method called");
        //
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart method called");
        // When the fragment view UI comes onto the device screen foreground then this callback gets called.
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume method called");
        // This callback gets called when the user is able to interact with the fragment UI
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause method called");
        // When user is not interacting with the fragment UI then this callback gets called.
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop method called");
        // When the fragment is not visible on the UI anymore then this callback gets called.
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView method called");
        // If there is any resource clean up then this callback gets called.
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy method called");
        //
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach method called");
        // When the fragment is detached from it's parent activity or fragment then this call back gets called.
    }
}