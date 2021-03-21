package edu.itesm.appchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_hills.*
import kotlinx.android.synthetic.main.fragment_lakes.*


class HillsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hills, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        hills_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = HillsAdapter(createData())
        }
    }

    fun createData(): ArrayList<Hills>{
        val hills = ArrayList<Hills>()
        hills.add(Hills(R.drawable.goblin,"Goblin", "Goblins are malicious, aggressive, bloodthirsty, and grotesque. They range in skin tone, color, and size. But Red Caps are notably larger than common Goblins. These Goblins haunt battlefields. They are so intelligent enough to make crude weapons and lead battalions of Goblins, deploying and ordering them around.", "Family: Adentlife"));
        hills.add(Hills(R.drawable.hobgoblin,"Hobgoblin", "Similar to goblins in appearance, hobgoblins, or hobs as they are sometimes called, are a less malicious and more mischievous type of faerie. Friendly and sometimes even helpful, hobgoblins still have a penchant for pranks ranging from annoying to infuriating. They are most fond of stealing", "Family: Amicidiabolidae"))
        hills.add(Hills(R.drawable.knocker,"Knocker", "Also known as kobolds, these enigmatic creatures most commonly live in mines, mimicking the sounds of miners by tapping against the rock walls. It is said they do their own mining at night when all the humans have departed, but since they do not appear to craft metal, it is unclear what they are seeking under the ground.", "Family: Cavernahabentidae"))
        hills.add(Hills(R.drawable.dwarf,"Dwarf", "Young dwarves have a harsh, stonelike appearance supporting the theory they are carved from rock rather than born. As dwarves become older, their skin becomes finer and more polished, sometimes resembling marble. Dwarves can shift form to become a tree stump or stone, but if you look closely, you may be able to see their features in the wood or rock.", "Family: Brevihominidae"))
        hills.add(Hills(R.drawable.ogre,"Ogre", "Ogres often trade on their strength, despite having 'better than average' intelligence. They live as scavengers, bullying humans and other faeries into giving up their food, land, and wealth. Luckily, ogres are both vain and lazy, attributes often leading to their downfall. Descended from giants, ogres are quite large in their natural form.", "Family: Stultibrutidae"))
        hills.add(Hills(R.drawable.giant,"Giant", "These lumbering brutes hibernate for most of their adult lives, sometimes sleeping for so long their backs become densely forested. This, coupled with the fact they can grow as large as hills and are often indistinguishable from the landscape, means it's entirely possible for a person to walk across the back of a sleeping giant and not even know it.'", "Family: Gigantidae"))

        return hills
    }
}