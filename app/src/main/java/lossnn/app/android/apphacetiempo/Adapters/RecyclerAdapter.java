package lossnn.app.android.apphacetiempo.Adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import lossnn.app.android.apphacetiempo.POJO.Actividad;
import lossnn.app.android.apphacetiempo.R;

/**
 * Created by Jair Barzola on 09-Mar-17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    List<Actividad> actividadList = new ArrayList<>();
    Context context;
    public RecyclerAdapter (Context context, List<Actividad> actividadList){
        this.context=context;
        this.actividadList=actividadList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_fo,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageView.setImageResource(actividadList.get(position).getmImageResourceId());
        holder.nombre.setText(actividadList.get(position).getNombre());
        holder.dias.setText(actividadList.get(position).getDias());
        holder.meses.setText(actividadList.get(position).getMeses());
        int color = ContextCompat.getColor(context,actividadList.get(position).getColor());
        holder.color.setBackgroundColor(color);

    }

    @Override
    public int getItemCount() {
        return actividadList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView nombre;
    TextView meses;
    TextView dias;
    ImageView color;
    public ViewHolder(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.image_actividad);
        nombre = (TextView) itemView.findViewById(R.id.nombre_actividad);
        meses = (TextView) itemView.findViewById(R.id.meses_actividad);
        dias = (TextView) itemView.findViewById(R.id.dias_actividad);
        color = (ImageView) itemView.findViewById(R.id.color_actividad);

    }
}
}

