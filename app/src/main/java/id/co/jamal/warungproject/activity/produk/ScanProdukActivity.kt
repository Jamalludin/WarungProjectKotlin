package id.co.jamal.warungproject.activity.produk

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseArray
import com.google.android.gms.vision.barcode.Barcode
import id.co.jamal.warungproject.R
import info.androidhive.barcode.BarcodeReader

class ScanProdukActivity : AppCompatActivity(), BarcodeReader.BarcodeReaderListener {

    private var barcodeReader: BarcodeReader? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan_produk)

        barcodeReader = supportFragmentManager.findFragmentById(R.id.barcode_scanner) as BarcodeReader
    }

    override fun onScanned(barcode: Barcode?) {
        barcodeReader?.playBeep()

        val intent = Intent(this@ScanProdukActivity, ResultScanProdukActivity::class.java)
        intent.putExtra("code", barcode?.displayValue)
        startActivity(intent)
        finish()
    }

    override fun onBitmapScanned(sparseArray: SparseArray<Barcode>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onScannedMultiple(barcodes: MutableList<Barcode>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCameraPermissionDenied() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onScanError(errorMessage: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
