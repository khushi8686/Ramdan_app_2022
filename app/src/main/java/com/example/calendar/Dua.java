package com.example.calendar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Dua#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Dua extends Fragment {
    RecyclerView recyclerView;
    ArrayList<datamodel> dataholder;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Dua() {
        // Required empty public constructor
    }


    public static Dua newInstance(String param1, String param2) {
        Dua fragment = new Dua();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dua, container, false);
        recyclerView=view.findViewById(R.id.dua_hori);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder=new ArrayList<datamodel>();

        datamodel ob1=new datamodel("Invocations for breaking the fast","?????? ???????????? ????????????\n" +
                "?????????????? ???????? ?????????? ???? ????????\n" +
                "???? ????\n" +
                " ???? ?????? ?????? ?????????? ??????????????\n" +
                "   ???????? ???????? ???? ???????? ???? ??????????????\n" +
                "????");
        dataholder.add(ob1);

        datamodel ob2=new datamodel("Invocations before eating","?????? ???? ???? ?????? ???? ???? ???? ???????? ????????????\n" +
                "???? ?????? ???????? ?????? ?????? ??????????????????\n" +
                "?????????? ?????? ???? ???? ???????? ?????? ??????\n" +
                "???????? ??????");
        dataholder.add(ob2);

        datamodel ob3=new datamodel("Invocations after eating","?????? ?? ???? ???????? ???????????? ??????\n" +
                "???????? ???? ?????? ?????? ?????? ??????\n" +
                "??????\n" +
                "???????? ?? ???? ??????\n" +
                " ????????\n" +
                "???????? ???????? ????????\n" +
                "???????????? ???????? ?????? ???????? ?????? ????????????\n" +
                "?????? ???????????? ?????? ????????\n" +
                "???????? ?? ????");
        dataholder.add(ob3);

        datamodel ob4=new datamodel("A dinner guest's invocation for his host","???? ?????? ???????? ?????? ???????? ??????????????????\n" +
                "?????????? ?????? ????????????????");
        dataholder.add(ob4);

        datamodel ob5=new datamodel("Invocation for someone who gives you\n" +
                "       drink or offers it to you","???? ?????? ???????? ???? ?????????? ???????????? ???? ???? ??????????????\n" +
                "?????? ??????????");
        dataholder.add(ob5);
     recyclerView.setAdapter(new myadapter(dataholder));

        return view;
    }


}