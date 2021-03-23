package edu.itesm.appchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_fields.*


class FieldsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fields, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        fields_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = FieldsAdapter(createData())
        }
    }

    fun createData(): ArrayList<Fields>{
        val fields = ArrayList<Fields>()
        fields.add(Fields(R.drawable.sprite,"Sprite", "Dazzling in color and about the size of large insects, sprites have glistening membranous wings. In fact, they are often confused with exotic insects or flowers at first glance. Considered by many to be the most common type of faerie, sprites prefer to live in deep woods and make their homes high in the branches of trees.", "Family: Cordimundidae"))
        fields.add(Fields(R.drawable.elf,"Elf", "Elves are capricious by nature, and few rules control their long lives. They are fond of circle dancing, parties, singing and games and are most likely to be discovered when engaged in one of these activities. Sometimes, for fun, fairies will attract people to dance with them or try a little of the food. In both cases, human beings will lose all time and be caught unless saved.", "Family: Circulifestidae"))
        fields.add(Fields(R.drawable.cockatrice,"Cockatrice", "The cockatrice can cause death with a single glaze. Reports indicate anything catching sight of the lethal bird's eyes is turned instantly to stone; but just as deadly is their poisonous saliva, able to fell even an elephant. Also known as a basilisk, the cockatrice has the head and feet of a cockerel and the tail of a serpent.", "Family: Serpentigentidae"))
        fields.add(Fields(R.drawable.manticore,"Manticore", "Originally documented in Persia, the feared, man-eating manticore, or manticora, has been sighted in places as varied as the jungles of Brazil and Indonesia and, more rarely, the forests of North America and Europe. With the body of a lion and a tail of poisonous spines some reports indicate can be shot like arrows, a manticore is a lethal predator.", "Family: Bestiadae"))
        fields.add(Fields(R.drawable.leprechaun,"Leprechaun", "Leprechauns (also sometimes called clurichauns) are the diligent craftspeople of Faerie, tirelessly toiling at leatherworking and cobbling. They spend most of their time in their forest workplaces, although they do sometimes winter the cellars of human homes, particularly ones where food is stored.", "Family: Ingeniosidae"))
        fields.add(Fields(R.drawable.treefolk,"Treefolk", "Although all trees are magical and many sacred to faeries, only a few trees are sentient. These are treemen and women. Treefolk can take on a humanoid shape and move a short distance from their tree, or, in extreme cases, uproot the entire tree and use the roots as a shuffling form of locomotion. In their humanoid form, treefolk are often described as resembling their tree.", "Family: Hamadryadidae"))
        fields.add(Fields(R.drawable.unicorn,"Unicorn", "Revered for centuries as one of the most magical of all creatures, the unicorn is perhaps best known for its healing qualities. The touch of a unicorn will cure disease and purify liquids. For this reason, unicorns were hunted and slain. Cups, plates and utensils are able to render poison harmless if carved from unicorn horns.", "Family: Monoceratidae"))
        fields.add(Fields(R.drawable.piskie,"Pixie", "Tricksy by nature, pixies particularly delight in tormenting humans. For this reason, they can be found living in suburban and rural areas, and sometimes even in the parks of cities, any greensward, basically, where people are frequent. Pixies (also known as piskies) make their homes in the hollows of logs, lean-tos formed by felled trees, and in gardens.", "Family: Pusillipraedonidae"))
        fields.add(Fields(R.drawable.changeling,"Changeling", "Changelings are creatures from the Invisible World that have taken on the form of a human, usually a child, while that person is carried to live among the faeries. Elves and pixies are most commonly the culprits, either leaving behind one of their own to grow up among mortals or leaving behind a piece of wood enchanted to look like the mortal that was stolen.", "Family: None"))

        return fields
    }
}