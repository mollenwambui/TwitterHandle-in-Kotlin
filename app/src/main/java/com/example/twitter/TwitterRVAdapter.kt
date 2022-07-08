package com.example.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRVAdapter(var twitterList:List<Twitter>) :
RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
    var itemView=LayoutInflater.from(parent.context)
        .inflate(R.layout.twitter_list_item,parent,false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet=twitterList.get(position)
        holder.tvHandle.text=currentTweet.handle
        holder.tvUsername.text=currentTweet.username
        holder.tvComment.text=currentTweet.comment
        holder.tvLike.text=currentTweet.like
        holder.tvRetweet.text=currentTweet.retweet
        holder.tvTweet.text=currentTweet.tweet

    }

    override fun getItemCount(): Int {
     return twitterList.size
    }

}
class  TweetViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){
        var imgPerson=itemView.findViewById<ImageView>(R.id.imgPerson)
        var tvUsername=itemView.findViewById<TextView>(R.id.tvUsername)
        var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
        var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
        var imgComment=itemView.findViewById<ImageView>(R.id.imgComment)
        var tvComment=itemView.findViewById<TextView>(R.id.tvComments)
        var imgLike=itemView.findViewById<ImageView>(R.id.imgLike)
        var imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
        var tvRetweet=itemView.findViewById<TextView>(R.id.tvRetweet)
        var imgShare=itemView.findViewById<ImageView>(R.id.imgShare)
        var tvLike=itemView.findViewById<TextView>(R.id.tvLike)
        }