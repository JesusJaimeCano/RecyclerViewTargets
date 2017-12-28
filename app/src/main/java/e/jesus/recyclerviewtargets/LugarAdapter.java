package e.jesus.recyclerviewtargets;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jesus on 28/12/2017.
 */

public class LugarAdapter extends RecyclerView.Adapter<LugarAdapter.LugarViewHolder>{

    private List<Lugar> lugares;

    public LugarAdapter(List<Lugar> lugares){
        this.lugares = lugares;
    }

    @Override
    public LugarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tarjeta_lugar, parent, false);

        return new LugarAdapter.LugarViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(LugarViewHolder holder, int position) {
            Lugar lugarActual = lugares.get(position);
            holder.imagenLugar.setImageResource(lugarActual.getImagen());
            holder.nombre.setText(lugarActual.getNombre());
            holder.ubicacion.setText(lugarActual.getUbicacion());
    }

    @Override
    public int getItemCount() {
        return lugares.size();
    }

    public static class  LugarViewHolder extends RecyclerView.ViewHolder{

        ImageView imagenLugar;
        ImageView valoracion;
        TextView nombre, ubicacion;

        public  LugarViewHolder(View itemView){
            super(itemView);

            imagenLugar = itemView.findViewById(R.id.imagenLigarIV);
            nombre = itemView.findViewById(R.id.nombreLugarTV);
            ubicacion = itemView.findViewById(R.id.ubicacionLugarTV);
            valoracion = itemView.findViewById(R.id.valoracion);

        }

    }

}
