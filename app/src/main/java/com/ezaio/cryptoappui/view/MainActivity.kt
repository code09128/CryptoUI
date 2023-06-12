package com.ezaio.cryptoappui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.ezaio.cryptoappui.R
import com.ezaio.cryptoappui.model.CryptoWallet
import com.ezaio.cryptoappui.view.adapter.CryptoAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var cryptoAdapter: CryptoAdapter
    private var data: ArrayList<CryptoWallet>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        recycleview_crypto.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this)
        recycleview_crypto.layoutManager = layoutManager

        // add list datas
        data = ArrayList()
        val lineChart = arrayListOf<Int>()
        lineChart.add(1000)
        lineChart.add(1100)
        lineChart.add(1300)
        lineChart.add(1100)

        val lineChart2 = arrayListOf<Int>()
        lineChart2.add(1000)
        lineChart2.add(2000)
        lineChart2.add(1900)
        lineChart2.add(2000)

        val lineChart3 = arrayListOf<Int>()
        lineChart3.add(900)
        lineChart3.add(1100)
        lineChart3.add(1200)
        lineChart3.add(1100)

        val lineChart4 = arrayListOf<Int>()
        lineChart4.add(950)
        lineChart4.add(1100)
        lineChart4.add(800)
        lineChart4.add(1500)
        lineChart4.add(1100)

        val cryptoWallet = CryptoWallet("bitcoin","BTX",1234.12,2.13,lineChart,1234.12,0.12343)
        val cryptoWallet2 = CryptoWallet("etherium","ETH",2234.12,-1.3,lineChart2,6445.12,0.02343)
        val cryptoWallet3 = CryptoWallet("trox","ROX",6535.12,1.13,lineChart3,3234.12,0.12365)
        val cryptoWallet4 = CryptoWallet("Dog","Dog",2535.12,-1.01,lineChart4,2234.12,0.12555)

        data!!.add(cryptoWallet)
        data!!.add(cryptoWallet2)
        data!!.add(cryptoWallet3)
        data!!.add(cryptoWallet4)

        cryptoAdapter = CryptoAdapter(data!!)
        recycleview_crypto.adapter = cryptoAdapter
    }
}