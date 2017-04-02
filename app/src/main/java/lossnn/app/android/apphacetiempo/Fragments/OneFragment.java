package lossnn.app.android.apphacetiempo.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import lossnn.app.android.apphacetiempo.Adapters.RecyclerAdapter;
import lossnn.app.android.apphacetiempo.POJO.Actividad;
import lossnn.app.android.apphacetiempo.R;

public class OneFragment extends Fragment {

    TextView textView;
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));
        List<Actividad> actividadList = new ArrayList<>();

        actividadList.add(new Actividad("Jugado al futbol","1 mes","24 dias",R.drawable.foto4,R.color.actividad1));
        actividadList.add(new Actividad("Ido a una discoteca","1 mes","27 dias",R.drawable.foto3,R.color.actividad2));
        actividadList.add(new Actividad("Ido al gimnasio","4 meses","26 dias",R.drawable.foto2,R.color.actividad3));
        actividadList.add(new Actividad("Salido de viaje","8 meses","13 dias",R.drawable.foto1,R.color.actividad4));
        actividadList.add(new Actividad("Jugado al futbol","1 mes","24 dias",R.drawable.foto4,R.color.actividad1));
        actividadList.add(new Actividad("Ido a una discoteca","5 meses","27 dias",R.drawable.foto3,R.color.actividad2));
        actividadList.add(new Actividad("Ido al gimnasio","6 meses","26 dias",R.drawable.foto2,R.color.actividad3));
        actividadList.add(new Actividad("Salido de viaje","9 meses","13 dias",R.drawable.foto1,R.color.actividad4));

        adapter = new RecyclerAdapter(getContext(),actividadList);
        recyclerView.setAdapter(adapter);

        return rootView;
    }


}
