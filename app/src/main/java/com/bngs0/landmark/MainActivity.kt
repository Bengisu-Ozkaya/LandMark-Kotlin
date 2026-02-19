package com.bngs0.landmark

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.bngs0.landmark.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landMarKList : ArrayList<LandMark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landMarKList = ArrayList<LandMark>()

        //data
        val pisa = LandMark("Pisa","Italy",R.drawable.pisa)
        val colosseum = LandMark("Colosseum","Italy",R.drawable.colosseum)
        val eiffel = LandMark("Eiffel","France",R.drawable.eiffel)
        val londonBridge = LandMark("London Bridge","UK",R.drawable.londonbridge)

        landMarKList.add(pisa)
        landMarKList.add(colosseum)
        landMarKList.add(eiffel)
        landMarKList.add(londonBridge)

        //ListView Adapter
        /*val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landMarKList.map { landMark -> landMark.name })
        binding.listView.adapter = adapter //adapter ile listView'ı birbirine bağladık

        //listviewdaki itemların üzerine tıklandığında nolacak
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener {parent, view, position, id ->
            val intent = Intent(this@MainActivity, DetailsActivity::class.java)
            intent.putExtra("landmark",landMarKList.get(position))

            /*intent.putExtra("name",landMarKList.get(position).name)
            intent.putExtra("country",landMarKList.get(position).country)
            intent.putExtra("image",landMarKList.get(position).image)*/

            startActivity(intent)
        }*/

        //RecyclerView

    }

}