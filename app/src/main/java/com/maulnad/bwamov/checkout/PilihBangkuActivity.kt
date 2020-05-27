package com.maulnad.bwamov.checkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.maulnad.bwamov.R
import com.maulnad.bwamov.checkout.model.Checkout
import com.maulnad.bwamov.home.model.Film
import kotlinx.android.synthetic.main.activity_pilih_bangku.*

class PilihBangkuActivity : AppCompatActivity() {

    var statusA1:Boolean = false
    var statusA2:Boolean = false
    var statusA3:Boolean = false
    var statusA4:Boolean = false
    var statusB1:Boolean = false
    var statusB2:Boolean = false
    var statusB3:Boolean = false
    var statusB4:Boolean = false
    var total:Int = 0

    private var dataList = ArrayList<Checkout>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_bangku)

        val data = intent.getParcelableExtra<Film>("data")

        tv_title.text = data.judul

        a1.setOnClickListener {
            if(statusA1){
                a1.setImageResource(R.drawable.ic_rectangle_empty)
                statusA1 = false
                total -= 1
                beliTiket(total)

                dataList.remove(Checkout("A1","35000"))
            } else {
                a1.setImageResource(R.drawable.ic_rectangle_selected)
                statusA1 = true
                total += 1
                beliTiket(total)

                val data = Checkout("A1","35000")
                dataList.add(data)
            }
        }

        a2.setOnClickListener {
            if(statusA2){
                a2.setImageResource(R.drawable.ic_rectangle_empty)
                statusA2 = false
                total -= 1
                beliTiket(total)

                dataList.remove(Checkout("A2","35000"))
            } else {
                a2.setImageResource(R.drawable.ic_rectangle_selected)
                statusA2 = true
                total += 1
                beliTiket(total)

                val data = Checkout("A2","35000")
                dataList.add(data)
            }
        }

        a3.setOnClickListener {
                if(statusA3){
                    a3.setImageResource(R.drawable.ic_rectangle_empty)
                    statusA3 = false
                    total -= 1
                    beliTiket(total)

                    dataList.remove(Checkout("A3","35000"))
                } else {
                    a3.setImageResource(R.drawable.ic_rectangle_selected)
                    statusA3 = true
                    total += 1
                    beliTiket(total)

                    val data = Checkout("A3","35000")
                    dataList.add(data)
                }
        }

        a4.setOnClickListener {
            if(statusA4){
                a4.setImageResource(R.drawable.ic_rectangle_empty)
                statusA4 = false
                total -=1
                beliTiket(total)

                dataList.remove(Checkout("A4","35000"))
            } else {
                a4.setImageResource(R.drawable.ic_rectangle_selected)
                statusA4 = true
                total += 1

                val data = Checkout("A4", "35000")
                dataList.add(data)
            }
        }

        b1.setOnClickListener {
            if(statusB1){
                b1.setImageResource(R.drawable.ic_rectangle_empty)
                statusB1 = false
                total -=1
                beliTiket(total)

                dataList.remove(Checkout("B1", "35000"))
            } else {
                b1.setImageResource(R.drawable.ic_rectangle_selected)
                statusB1 = true
                total +=1
                beliTiket(total)

                val data = Checkout("B1", "35000")
                dataList.add(data)
            }
        }

        b2.setOnClickListener {
            if(statusB2){
                b2.setImageResource(R.drawable.ic_rectangle_empty)
                statusB2 = false
                total -=1
                beliTiket(total)

                dataList.remove(Checkout("B2", "35000"))
            } else {
                b2.setImageResource(R.drawable.ic_rectangle_selected)
                statusB2 = true
                total +=1
                beliTiket(total)

                val data = Checkout("B2", "35000")
                dataList.add(data)
            }
        }

        b3.setOnClickListener {
            if(statusB3){
                b3.setImageResource(R.drawable.ic_rectangle_empty)
                statusB3 = false
                total -=1
                beliTiket(total)

                dataList.remove(Checkout("B3", "35000"))
            } else {
                b3.setImageResource(R.drawable.ic_rectangle_selected)
                statusB3 = true
                total +=1
                beliTiket(total)

                val data = Checkout("B3", "35000")
                dataList.add(data)
            }
        }

        b4.setOnClickListener {
            if(statusB4){
                b4.setImageResource(R.drawable.ic_rectangle_empty)
                statusB4 = false
                total -=1
                beliTiket(total)

                dataList.remove(Checkout("B4", "35000"))
            } else {
                b4.setImageResource(R.drawable.ic_rectangle_selected)
                statusB4 = true
                total +=1
                beliTiket(total)

                val data = Checkout("B4", "35000")
                dataList.add(data)
            }
        }


        btn_home.setOnClickListener {
            val intent = Intent(this@PilihBangkuActivity,
            CheckoutActivity::class.java).putExtra("data", dataList)
            startActivity(intent)
        }

        btn_back.setOnClickListener {
            finish()
        }
    }

    private fun beliTiket(total:Int) {
            if (total == 0){
                btn_home.setText("Beli Tiket")
                btn_home.visibility = View.INVISIBLE
            } else {
                btn_home.setText("Beli Tiket("+total+")")
                btn_home.visibility = View.VISIBLE
            }
    }
}