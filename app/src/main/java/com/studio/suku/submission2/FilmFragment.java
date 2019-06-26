package com.studio.suku.submission2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FilmFragment extends Fragment {

    private RecyclerView list;
    View v;
    private ArrayList<Item> data = new ArrayList<>();
    public FilmFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        data.addAll(Data.getListData());
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.fragment_film, container, false);
        list = v.findViewById(R.id.list_film);
        showList();
        // Inflate the layout for this fragment
        return v;

    }



    private void showList(){
        list.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        ItemAdapter adapter = new ItemAdapter();
        adapter.setItems(data);
        list.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

}
