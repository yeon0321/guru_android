package com.example.guruapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import android.widget.Toast


open class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var preEx_body: Button
    lateinit var preEx_upperbody: Button
    lateinit var preEx_lowerbody: Button
    lateinit var preEx_stretch: Button
    lateinit var button: Button

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prepare_ex)

        preEx_body = findViewById(R.id.preEx_body)
        preEx_upperbody = findViewById(R.id.preEx_upperbody)
        preEx_lowerbody = findViewById(R.id.preEx_lowerbody)
        preEx_stretch = findViewById(R.id.preEx_stretch)
        button = findViewById(R.id.button2)


        val toolbar: Toolbar = findViewById(R.id.toolbar) // toolBar를 통해 App Bar 생성
        setSupportActionBar(toolbar) // 툴바 적용

        supportActionBar?.setDisplayHomeAsUpEnabled(true) // 드로어를 꺼낼 홈 버튼 활성화
        supportActionBar?.setHomeAsUpIndicator(R.drawable.navi_menu) // 홈버튼 이미지 변경
        supportActionBar?.setDisplayShowTitleEnabled(false) // 툴바에 타이틀 안보이게

        // 네비게이션 드로어 생성
        drawerLayout = findViewById(R.id.drawer_layout)

        // 네비게이션 드로어 내에있는 화면의 이벤트를 처리하기 위해 생성
        navigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this) //navigation 리스너




        button.setOnClickListener({
            val intent_diary = Intent(this, prepare_ex_body::class.java)
            startActivity(intent_diary)
        })

        preEx_body.setOnClickListener({
            val intent_body = Intent(this, prepare_ex_body::class.java)
            startActivity(intent_body)
        })


        preEx_lowerbody.setOnClickListener({
            val intent_lowerbody = Intent(this, prepare_ex_lowerbody::class.java)
            startActivity(intent_lowerbody)
        })

        preEx_upperbody.setOnClickListener({
            val intent_upperbody = Intent(this, prepare_ex_upperbody::class.java)
            startActivity(intent_upperbody)
        })

        preEx_stretch.setOnClickListener({
            val intent_stretch = Intent(this, prepare_ex_stretching::class.java)
            startActivity(intent_stretch)
        })
    }

    // 툴바 메뉴 버튼이 클릭 됐을 때 실행하는 함수
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // 클릭한 툴바 메뉴 아이템 id 마다 다르게 실행하도록 설정
        when(item!!.itemId){
            android.R.id.home->{
                // 햄버거 버튼 클릭시 네비게이션 드로어 열기
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    // 드로어 내 아이템 클릭 이벤트 처리하는 함수
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_item1-> Toast.makeText(this,"menu_item1 실행",Toast.LENGTH_SHORT).show()
            R.id.menu_item2-> Toast.makeText(this,"menu_item2 실행",Toast.LENGTH_SHORT).show()
            R.id.menu_item3-> Toast.makeText(this,"menu_item3 실행",Toast.LENGTH_SHORT).show()
        }
        return false
    }





    }