package com.surya.livescore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.surya.livescore.models.Match

class MatchesAdapter constructor(val context: Context, val matches: List<Match>) :
    RecyclerView.Adapter<MatchesAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflator = LayoutInflater.from(context)
        val view = inflator.inflate(R.layout.match_list_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.init()
        holder.bind(matches[position])
    }

    override fun getItemCount(): Int {
        return matches.size
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var txtTitle: TextView
        lateinit var txtSt1name:TextView
        lateinit var txtSt2name:TextView
        lateinit var txtStatus:TextView
        lateinit var txtt1Score:TextView
        lateinit var txtt2Score:TextView

        fun init(){
            txtTitle = itemView.findViewById(R.id.txtTitle)
            txtSt1name=itemView.findViewById(R.id.txtSt1name)
            txtSt2name=itemView.findViewById(R.id.txtSt2name)
            txtStatus=itemView.findViewById(R.id.txtStatus)
            txtt1Score=itemView.findViewById(R.id.txtT1score)
            txtt2Score=itemView.findViewById(R.id.txtT2score)
        }

        fun bind(match: Match){
            val matchInfo = match.matchInfo

            txtTitle.text = matchInfo?.seriesName
            txtSt1name.text=matchInfo?.team1?.teamSName
            txtSt2name.text=matchInfo?.team2?.teamSName
            txtStatus.text=matchInfo?.status

            val score = match.matchScore
            val team1Score = score?.team1Score
            val runs1 = team1Score?.inngs1?.runs
            val wikets = team1Score?.inngs1?.wickets
            val overs = team1Score?.inngs1?.overs

            txtt1Score.text = "$runs1/$wikets($overs)"


            val team2Score = score?.team2Score
            val runs2 = team2Score?.inngs1?.runs
            val wikets2 = team2Score?.inngs1?.wickets
            val overs2 = team2Score?.inngs1?.overs

            txtt2Score.text = "$runs2/$wikets2($overs2)"



        }
    }
}