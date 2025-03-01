package com.c3.lokerapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class home extends Fragment {


private RecyclerView recyclerView;

private adapter1 adapter;

private List<item1>isi_isi;

private List<item1>isi_item(){
List<item1> isiitem = new ArrayList<>();
isiitem.add(new item1(R.drawable.logo,"Pt.Indroprima","jl.patimura","Pendirikan S1/D4"));
    isiitem.add(new item1(R.drawable.logo,"Pt.Lintang NTT","jl.Madyapura","Pendirikan S1/D4"));
    isiitem.add(new item1(R.drawable.logo,"Pt.Handayani","jl.Peru","Pendirikan S1/D4"));
    isiitem.add(new item1(R.drawable.logo,"Pt.fajartimur","jl.patih putih","Pendirikan S1/D4"));
    isiitem.add(new item1(R.drawable.logo,"Pt.mandala indo","jl.biru senja","Pendirikan S1/D4"));
    isiitem.add(new item1(R.drawable.logo,"Pt.senja sekunder","jl.raja","Pendirikan S1/D4"));
    isiitem.add(new item1(R.drawable.logo,"Pt.krikwak","jl.raja si singa","Pendirikan S1/D4"));
    isiitem.add(new item1(R.drawable.logo,"Pt.kirawak","jl.mura","Pendirikan S1/D4"));
    isiitem.add(new item1(R.drawable.logo,"Pt.tb timur","jl.patimura","Pendirikan S1/D4"));

return isiitem;
}

public void gantiDetail(){
    Intent i = new Intent(requireActivity(), detail_pekerjaan.class);
    startActivity(i);

}

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment home.
     */
    // TODO: Rename and change types and number of parameters
    public static home newInstance(String param1, String param2) {
        home fragment = new home();
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
        View tampilan = inflater.inflate(R.layout.fragment_home, container, false);

isi_isi = isi_item();
recyclerView = tampilan.findViewById(R.id.horizontalRecyclerView);
adapter = new adapter1(isi_isi, new adapter1.tampilan() {
    @Override
    public void onItemClick(int position) {
        Toast.makeText(requireContext(), isi_isi.get(position).getNama_peru_i(), Toast.LENGTH_SHORT).show();
gantiDetail();

    }
});
recyclerView.setAdapter(adapter);

return tampilan;

    }

}