package com.ezaio.cryptoappui.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @auther dustin.hsieh
 * @Date on 2023/6/9
 * @Description
 */
@Parcelize
data class CryptoWallet(
    var cryptoName:String,
    var cryptoSymbol:String,
    var cryptoPrice: Double,
    var changePercent:Double,
    var lineData: ArrayList<Int>,
    var propertyAmount:Double,
    var propertySize:Double
):Parcelable {

}