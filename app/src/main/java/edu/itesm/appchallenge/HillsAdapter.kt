package edu.itesm.appchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class HillsAdapter (private val hills_list : List<Hills>)
    : RecyclerView.Adapter<HillsAdapter.HillsViewHolder>(){

    inner class HillsViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var name = renglon.findViewById<TextView>(R.id.name)
        var description = renglon.findViewById<TextView>(R.id.description)
        var picture = renglon.findViewById<ImageView>(R.id.picture)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HillsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.hills_renglon,parent, false)
        return HillsViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: HillsViewHolder, position: Int) {
        val hills= hills_list[position]
        holder.picture.setImageResource(hills.picture)
        holder.name.text = hills.name
        holder.description.text = hills.description
        holder.itemView.setOnClickListener {
            val action = HillsFragmentDirections.actionHillsFragmentToHillCreatureFragment(hills)
            holder.itemView.findNavController().navigate(action)
            Toast.makeText(holder.itemView.context,"${hills.family}",Toast.LENGTH_SHORT).show()
        }
    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return hills_list.size
    }
}