package edu.itesm.appchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_lakes.*


class LakesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lakes, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        lakes_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = LakesAdapter(createData())
        }
    }

    fun createData(): ArrayList<Lakes>{
        val lakes = ArrayList<Lakes>()
        lakes.add(Lakes(R.drawable.nixie,"Nixies", "Guardians of freshwater pools and streams, nixies, (also called naiads and nixes) are bound to the body of water in which they dwell. They are most commonly spotted alone and can be identified by the liquid continuously streaming from their hair and clothes as well as the greenish sheen of their skin. Nixies are amphibious and, unlike mermaids, they have legs rather than a tail."))
        lakes.add(Lakes(R.drawable.merfolk,"Merfolk", "As stunningly gorgeous as they are dangerous, merfolk live in loosely structured kingdoms deep in the sea, but occasionally their natural curiosity causes them to near the shore. Although usually seen at night out on the jetties or even sometimes on the soft sand of the beaches, they have been spotted in daylight, resting on rocky outcroppings."))
        lakes.add(Lakes(R.drawable.troll,"Trolls", "Trolls are afflicted with a ravenous and never-ending hunger that leads them to devour whole flocks of livestock. In particular they have a taste for sheep, but they will eat whatever they can catch. Water trolls live primarily in or near freshwater and usually make their home in a makeshift nest of rushes and mud along the banks of a bog or deep river."))
        lakes.add(Lakes(R.drawable.kelpie,"Kelpie", "A ghastly water spirit assuming the form of a grayish black horse, the kelpie drowns then kills anyone who attempts to ride it. It is often spotted wandering along the shores of rivers or lakes, appearing to be a lost pony. Kelpies can be identified by a constantly dripping mane and skin, which is like a seal's but cold to the touch."))
        lakes.add(Lakes(R.drawable.seaserpent,"Sea Serpent", "These scourges of the high seas are powerful and massive constrictors with flat heads. Their bodies coil around whales and ships, crushing their ribs. Unlike land snakes, however, sea serpents have many rows of long, sharp teeth. In the deep sea, they have been reported as growing to the length of a suspension bridge and are capable of creating maelstroms with the lashing of their tails."));
        return lakes
    }
}