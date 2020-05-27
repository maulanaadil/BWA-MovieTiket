package com.maulnad.bwamov.checkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maulnad.bwamov.R
import com.maulnad.bwamov.home.HomeActivity
import kotlinx.android.synthetic.main.activity_checkout.*

class CheckoutSuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout_success)

        btn_daftar.setOnClickListener {
            finishAffinity()

            val intent = Intent(
                this@CheckoutSuccessActivity,
                HomeActivity::class.java
            )
            startActivity(intent)
        }

    }
}
