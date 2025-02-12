package gomez.alejandro.papucheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnCold: Button = findViewById(R.id.cold_drinks) as Button
        var btnHot: Button = findViewById(R.id.hot_drinks) as Button
        var btnSweets: Button = findViewById(R.id.sweets) as Button
        var btnSalties: Button = findViewById(R.id.salties) as Button

        btnCold.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "coldDrinks")
            startActivity(intent)
        }

        btnHot.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "hotDrinks")
            startActivity(intent)
        }

        btnSweets.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "sweets")
            startActivity(intent)
        }

        btnSalties.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", "salties")
            startActivity(intent)
        }


    }
}