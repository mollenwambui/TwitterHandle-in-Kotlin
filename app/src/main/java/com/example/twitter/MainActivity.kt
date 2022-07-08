package com.example.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tweets()
    }
    fun tweets(){
        var tweet1=Twitter("","Mollen Wambui","@mwambui","Life  is beautiful","","50","","200","","35","")
        var tweet2=Twitter("","Dennis Maina","@Dmaina","Family is everything ","","85","","300","","90","")
        var tweet3=Twitter("","Joy Wamaitha","@Jwamaitha","We should love our friends always.","","150","","780","","30","")
        var tweet4=Twitter("","Maureen Kamau","@Njiruk","Never give up in life","","95","","900","","90","")
        var tweet5=Twitter("","Sakina Issa","@Sakina","Let's normalize creating memories","","75","","400","","90","")
        var tweet6=Twitter("","Anne Jay","@AnneJay","Coding is fun ,very fun","","35","","300","","90","")
        var tweet7=Twitter("","Mitchelle Hope","@Hopemitch","Being happy is all that matters","","75","","500","","80","")
        var tweet8=Twitter("","John k","@Johnk","Food is life","","25","","300","","90","")
        var tweet9=Twitter("","Dennis Macharia","@Dmacharia","Everyone is beautiful,i mean cuute","","95","","300","","40","")
        var tweet10=Twitter("","Marie ken","@Marieken","Mothers are awesome and they deserve all the love","","75","","300","","70","")
        var tweetsList= listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8,tweet9,tweet10)
        var twitterAdapter=TwitterRVAdapter(tweetsList)
        binding.rvTwitter.layoutManager=LinearLayoutManager(this)
        binding.rvTwitter.adapter=twitterAdapter
    }
}