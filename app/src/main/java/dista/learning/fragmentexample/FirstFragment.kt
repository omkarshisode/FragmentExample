package dista.learning.fragmentexample

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(this, 1,  Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        print("That is used to add the live data to the fragment")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        print("OnActivityCreate method called")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        print("OnViewRestored called")
        super.onViewStateRestored(savedInstanceState)
    }
}