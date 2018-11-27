package id.co.jamal.warungproject.activity.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import id.co.jamal.warungproject.R
import id.co.jamal.warungproject.activity.HomeActivity
import id.co.jamal.warungproject.activity.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    var userEmail: String? = null
    var userPassword: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {

            userEmail = inputEmail.text.toString()
            userPassword = inputPassword.text.toString()

            if (TextUtils.isEmpty(userEmail) or TextUtils.isEmpty(userPassword)){
                Toast.makeText(this, "Please ! Insert User or Password", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(applicationContext, HomeActivity::class.java)
                startActivity(intent)
            }
        }

        txtSigup.setOnClickListener {
            val intent = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.animator.fade_in_animation, R.animator.fade_out_animation)
        }
    }
}
