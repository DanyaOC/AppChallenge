package edu.itesm.appchallenge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class FieldsAdapter (private val fields_list : List<Fields>)
    : RecyclerView.Adapter<FieldsAdapter.FieldsViewHolder>(){

    inner class FieldsViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var name = renglon.findViewById<TextView>(R.id.name)
        var description = renglon.findViewById<TextView>(R.id.description)
        var picture = renglon.findViewById<ImageView>(R.id.picture)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FieldsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.lakes_renglon,parent, false)
        return FieldsViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: FieldsViewHolder, position: Int) {
        val fields= fields_list[position]
        holder.picture.setImageResource(fields.picture)
        holder.name.text = fields.name
        holder.description.text = fields.description
        holder.itemView.setOnClickListener {
            val action = FieldsFragmentDirections.actionFieldsFragmentToFieldCreatureFragment(fields)
            holder.itemView.findNavController().navigate(action)
            Toast.makeText(holder.itemView.context,"${fields.family}", Toast.LENGTH_SHORT).show()
        }
    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return fields_list.size
    }
}