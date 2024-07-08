package com.vivian.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class transactionAdapter (val transactionList: List<transactions>): RecyclerView.Adapter<TransactionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.wallets_list,parent, false)
        return TransactionViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return transactionList.size
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transacts=transactionList[position]
        holder.tvIcon.text=transacts.icon
        holder.tvicon2.text=transacts.icon
        holder.ivsalary.text=transacts.salary
        holder.ivMonth.text=transacts.month

    }
}
class TransactionViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvIcon=itemView.findViewById<TextView>(R.id.tvicong)
    var tvicon2=itemView.findViewById<TextView>(R.id.tvIcono)
    var ivsalary=itemView.findViewById<TextView>(R.id.ivsalary)
    var ivAmount=itemView.findViewById<TextView>(R.id.ivAmount)
    var ivMonth=itemView.findViewById<TextView>(R.id.ivmonth)
}