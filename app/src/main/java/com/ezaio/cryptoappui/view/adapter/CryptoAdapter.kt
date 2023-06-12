package com.ezaio.cryptoappui.view.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.ezaio.cryptoappui.R
import com.ezaio.cryptoappui.model.CryptoWallet
import com.majorik.sparklinelibrary.SparkLineLayout
import java.text.DecimalFormat

/**
 * @auther dustin.hsieh
 * @Date on 2023/6/9
 * @Description
 */
class CryptoAdapter(var cryptoWallet:ArrayList<CryptoWallet>): BaseRecyclerAdapter() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_wallet, parent, false)

        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val title = holder.getView<TextView>(R.id.tv_title)
        val price = holder.getView<TextView>(R.id.tv_price)
        val percent = holder.getView<TextView>(R.id.tv_percent)
        val property = holder.getView<TextView>(R.id.tv_property)
        val propertyAmount = holder.getView<TextView>(R.id.tv_propertyAmount)
        val logoImage = holder.getView<ImageView>(R.id.logoImg)
        val lineChart = holder.getView<SparkLineLayout>(R.id.sparkLineLayout)

        val formatter = DecimalFormat("###,###,###")

        val drawables = holder.itemView.context.resources.getIdentifier(cryptoWallet[position].cryptoName,"drawable",
            holder.itemView.context.packageName
        )

        title.text = cryptoWallet[position].cryptoName
        price.text = "$" + formatter.format(cryptoWallet[position].cryptoPrice)
        percent.text = cryptoWallet[position].changePercent.toString()
        property.text = cryptoWallet[position].propertySize.toString() + cryptoWallet[position].cryptoSymbol
        propertyAmount.text = "$" + formatter.format(cryptoWallet[position].propertyAmount)
        lineChart.setData(cryptoWallet[position].lineData) //set Chart datas

        //set lineChart color and percent text color
        when {
            cryptoWallet[position].changePercent > 0 -> {
                percent.setTextColor(Color.parseColor("#12c737"))
                lineChart.sparkLineColor = Color.parseColor("#12c737")
            }
            cryptoWallet[position].changePercent < 0 -> {
                percent.setTextColor(Color.parseColor("#fc0000"))
                lineChart.sparkLineColor = Color.parseColor("#fc0000")
            }
            else -> {
                percent.setTextColor(Color.parseColor("#ffffff"))
                lineChart.sparkLineColor = Color.parseColor("#ffffff")
            }
        }

        Glide.with(holder.itemView.context).load(drawables).into(logoImage)
    }

    override fun getItemCount(): Int {
        return cryptoWallet.size
    }
}