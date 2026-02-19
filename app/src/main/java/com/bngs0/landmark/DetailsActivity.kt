package com.bngs0.landmark

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.bngs0.landmark.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        //val selectedLandMark = intent.getSerializableExtra("landmark") as LandMark //serializable oladuğundan dolayı sonradan diyoruz ki bu landmark sınıfından knk

        //val selectedLandMark = chosenLandMark

        val selectedLandMark = MySingleton.chosenLandMark

        selectedLandMark?.let {
            binding.nameText.text = it.name
            binding.countryText.text = it.country
            binding.imageView.setImageResource(it.image)
        }

        /*binding.nameText.text = selectedLandMark?.name
        binding.countryText.text = selectedLandMark?.country
        binding.imageView.setImageResource(selectedLandMark?.image!!)*/

    }
}