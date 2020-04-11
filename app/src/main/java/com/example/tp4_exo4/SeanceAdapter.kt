package com.example.tp4_exo4



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_seance_list_item.view.*

import kotlin.collections.ArrayList


class SeanceAdapter(var clickListner: OnLivreListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val TAG: String = "AppDebug"

    private var items: List<Seance> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SeanceViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_seance_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is SeanceViewHolder -> {
                holder.bind(items.get(position), clickListner)
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(seance: ArrayList<Seance>){
        items = seance
    }


    class SeanceViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val seance_intitule = itemView.seance_intituleitem
        val seance_duree = itemView.seance_dureeitem
        val seance_enseignant = itemView.seance_enseignantitem

        fun bind(seance: Seance, action: OnLivreListener){




            seance_intitule.setText(seance.intitule)
            seance_duree.setText(seance.duree)
            seance_enseignant.setText(seance.enseignant.nom)

            itemView.setOnClickListener{
                action.onLivreClick(seance, adapterPosition )
            }

        }



    }

    public interface OnLivreListener {
        fun onLivreClick(seance: Seance, position: Int)
    }

}