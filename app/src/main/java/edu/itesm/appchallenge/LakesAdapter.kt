package edu.itesm.appchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class LakesAdapter (private val lakes_list : List<Lakes>)
    : RecyclerView.Adapter<LakesAdapter.LakesViewHolder>(){

    inner class LakesViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var name = renglon.findViewById<TextView>(R.id.name)
        var description = renglon.findViewById<TextView>(R.id.description)
        var picture = renglon.findViewById<ImageView>(R.id.picture)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LakesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.lakes_renglon,parent, false)
        return LakesViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: LakesViewHolder, position: Int) {
        val lakes= lakes_list[position]
        holder.picture.setImageResource(lakes.picture)
        holder.name.text = lakes.name
        holder.description.text = lakes.description
        holder.itemView.setOnClickListener {
            val action = LakesFragmentDirections.actionLakesFragmentToLakeCreatureFragment(lakes)
            holder.itemView.findNavController().navigate(action)
            Toast.makeText(holder.itemView.context,"${lakes.family}", Toast.LENGTH_SHORT).show()
        }
    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return lakes_list.size
    }
}