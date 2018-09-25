package id.co.jamal.warungproject.activity.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.co.jamal.warungproject.R
import id.co.jamal.warungproject.activity.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            Toast.makeText(this, "Hi there! This is a Toast.", Toast.LENGTH_SHORT).show()
        }

        txtSigup.setOnClickListener {
            val intent = Intent(applicationContext,RegisterActivity::class.java)
            startActivity(intent) }
    }
}
