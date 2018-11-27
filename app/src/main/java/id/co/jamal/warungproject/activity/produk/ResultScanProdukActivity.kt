package id.co.jamal.warungproject.activity.produk

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.util.Log
import id.co.jamal.warungproject.R
import id.co.jamal.warungproject.activity.HomeActivity

import kotlinx.android.synthetic.main.activity_result_scan_produk.*
import kotlinx.android.synthetic.main.content_scan_produk.*

class ResultScanProdukActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_scan_produk)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        fab.setOnClickListener { view ->
            val intent = Intent(this@ResultScanProdukActivity, ScanProdukActivity::class.java)
            startActivity(intent)
            finish()
        }

        var bundel : Bundle ?=intent.extras
        var codeScan = bundel!!.getString("code")

        name.text = codeScan

    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(applicationContext, HomeActivity::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
        return true
    }

}
