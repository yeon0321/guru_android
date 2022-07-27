package com.example.guruapp

import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.NonNull
import com.naver.maps.geometry.LatLng
import com.naver.maps.map.LocationTrackingMode
import com.naver.maps.map.MapView
import com.naver.maps.map.NaverMap
import com.naver.maps.map.OnMapReadyCallback
import com.naver.maps.map.overlay.InfoWindow
import com.naver.maps.map.overlay.Marker
import com.naver.maps.map.overlay.Overlay
import com.naver.maps.map.util.FusedLocationSource
import com.naver.maps.map.util.MarkerIcons

class MainActivity : Activity(), OnMapReadyCallback {

    private lateinit var mapView: MapView
    private val LOCATION_PERMISSTION_REQUEST_CODE: Int = 1000
    private lateinit var locationSource: FusedLocationSource // 위치를 반환하는 구현체
    private lateinit var naverMap: NaverMap
    //근린공원 마커
    private val marker = Marker()
    private val marker1 = Marker()
    private val marker2 = Marker()
    private val marker3 = Marker()
    private val marker4 = Marker()
    private val marker5 = Marker()
    private val marker6 = Marker()
    private val marker7 = Marker()
    private val marker8 = Marker()
    private val marker9 = Marker()
    private val marker10 = Marker()

    private val marker11 = Marker()
    private val marker12 = Marker()
    private val marker13 = Marker()
    private val marker14 = Marker()
    private val marker15 = Marker()
    private val marker16 = Marker()
    private val marker17 = Marker()
    private val marker18 = Marker()
    private val marker19 = Marker()
    private val marker20 = Marker()

    private val marker21 = Marker()
    private val marker22 = Marker()
    private val marker23 = Marker()
    private val marker24 = Marker()
    private val marker25 = Marker()
    private val marker26 = Marker()

    //마커 클릭시 주소 나오게 하기 위한 변수 선언
    private val infoWindow = InfoWindow()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapView = findViewById(R.id.Walkmap_view)
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)

        locationSource = FusedLocationSource(this, LOCATION_PERMISSTION_REQUEST_CODE)

    }


    override fun onMapReady(@NonNull naverMap: NaverMap) {
        this.naverMap = naverMap
        naverMap.locationSource = locationSource
        naverMap.locationTrackingMode = LocationTrackingMode.Follow

        //ui 설정
        val uiSettings = naverMap.uiSettings
        uiSettings.isCompassEnabled = false
        uiSettings.isLocationButtonEnabled = true


        marker.position = LatLng(37.6281, 127.0905)
        marker.map = naverMap
        marker.icon = MarkerIcons.BLACK
        marker.iconTintColor = Color.RED //현재위치

        //장소
        marker1.position = LatLng(37.6207, 127.0864)
        marker1.map = naverMap
        marker1.captionText = "공릉동근린공원"

        marker2.position = LatLng(37.6120, 127.0888)
        marker2.map = naverMap
        marker2.captionText = "신내공원"

        marker3.position = LatLng(37.6530, 127.0122)
        marker3.map = naverMap
        marker3.captionText = "솔밭근린공원"

        marker4.position = LatLng(37.6205, 127.0833)
        marker4.map = naverMap
        marker4.captionText = "무지개공원"

        marker5.position = LatLng(37.6144, 127.0730)
        marker5.map = naverMap
        marker5.captionText = "중랑장미공원"

        marker6.position = LatLng(37.6278, 127.0850)
        marker6.map = naverMap
        marker6.captionText = "마실공원"

        //해당 근린공원은 네이버 지도에는 있는데 애뮬레이터 지도에는 안나옴
        marker7.position = LatLng(37.6258, 127.0928)
        marker7.map = naverMap
        marker7.captionText = "배꽃공원"

        marker8.position = LatLng(37.6252, 127.0846)
        marker8.map = naverMap
        marker8.captionText = "공릉동마을마당공원"

        marker9.position = LatLng(37.6171, 127.0837)
        marker9.map = naverMap
        marker9.captionText = "봉화마을마당"

        marker10.position = LatLng(37.6239, 127.0749)
        marker10.map = naverMap
        marker10.captionText = "샘말공원"

        marker11.position = LatLng(37.6149, 127.0785)
        marker11.map = naverMap
        marker11.captionText = "정자묵마을마당"

        //여기서부터는 다시 나오는 근린공원

        marker12.position = LatLng(37.6118, 127.0974)
        marker12.map = naverMap
        marker12.captionText = "능산공원원"

        marker13.position = LatLng(37.6447, 127.0743)
        marker13.map = naverMap
        marker13.captionText = "한글비근린공원"

        marker14.position = LatLng(37.6408, 127.0769)
        marker14.map = naverMap
        marker14.captionText = "층숙근린공원"

        marker15.position = LatLng(37.6067, 127.0917)
        marker15.map = naverMap
        marker15.captionText = "봉화산근린공원"

        marker16.position = LatLng(37.6064, 127.0998)
        marker16.map = naverMap
        marker16.captionText = "피울공원"

        marker17.position = LatLng(37.6137, 127.0993)
        marker17.map = naverMap
        marker17.captionText = "신내어울공원"

        marker18.position = LatLng(37.6078, 127.0911)
        marker18.map = naverMap
        marker18.captionText = "봉수대공원"

        marker19.position = LatLng(37.6387, 127.074)
        marker19.map = naverMap
        marker19.captionText = "골마을근린공원"

        marker20.position = LatLng(37.6405, 127.0671)
        marker20.map = naverMap
        marker20.captionText = "등나무근린공원 "

        marker21.position = LatLng(37.6227, 127.0692)
        marker21.map = naverMap
        marker21.captionText = "한내근린공원"

        marker22.position = LatLng(37.6371, 127.0762)
        marker22.map = naverMap
        marker22.captionText = "국화공원"

        marker23.position = LatLng(37.6067, 127.0917)
        marker23.map = naverMap
        marker23.captionText = "봉화산근린공원봉화원"

        marker24.position = LatLng(37.6278, 127.0734)
        marker24.map = naverMap
        marker24.captionText = "씨알공원"

        marker25.position = LatLng(37.6305, 127.0735)
        marker25.map = naverMap
        marker25.captionText = "한무리공원"

        marker26.position = LatLng(37.6317, 127.0689)
        marker26.map = naverMap
        marker26.captionText = "경춘숲공원"


        //마커 위치 정보 표시
        marker1.tag = "서울 노원구 화랑로 540"
        marker1.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker1)
            true

        }

        marker2.tag = "서울 중랑구 신내동 652"
        marker2.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker2)
            true
        }
        marker3.tag = "서울 노원구 화랑로51길 17"
        marker3.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker3)
            true
        }

        marker4.tag = "서울 노원구 공릉동 89"
        marker4.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker4)
            true
        }
        marker5.tag = "서울 중랑구 묵동 375"
        marker5.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker5)
            true
        }

        marker6.tag = "서울 노원구 공릉동 산208-1"
        marker6.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker6)
            true
        }

        marker7.tag = "서울 노원구 공릉동 123-1"
        marker7.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker7)
            true
        }

        marker8.tag = "서울 노원구 공릉동 230-9"
        marker8.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker8)
            true
        }
        marker9.tag = "서울 중랑구 묵동 35-23"
        marker9.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker9)
            true
        }

        marker10.tag = "서울 노원구 공릉동 517-15"
        marker10.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker10)
            true
        }

        marker11.tag = "서울 중랑구 묵동 171-1"
        marker11.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker11)
            true
        }

        marker12.tag = "서울 중랑구 신내동 317-2"
        marker12.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker12)
            true
        }
        marker13.tag = "서울 노원구 하계동 288-2"
        marker13.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker13)
            true
        }

        marker14.tag = "서울 노원구 한글비석로 144"
        marker14.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker14)
            true
        }
        marker15.tag = "서울 중랑구 신내동 산136-1"
        marker15.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker15)
            true
        }

        marker16.tag = "서울 중랑구 신내동 388-12"
        marker16.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker16)
            true
        }

        marker17.tag = "서울 중랑구 신내동 315-5"
        marker17.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker17)
            true
        }

        marker18.tag = "서울 중랑구 신내동 602-1"
        marker18.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker18)
            true
        }
        marker19.tag = "서울 노원구 한글비석로 107"
        marker19.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker19)
            true
        }

        marker20.tag = "서울 노원구 동일로 1238"
        marker20.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker20)
            true
        }
//
        marker21.tag = "서울 노원구 마들로 86"
        marker21.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker21)
            true
        }
        marker22.tag = "서울 노원구 하계동 252-11"
        marker22.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker22)
            true
        }
        marker23.tag = "서울 중랑구 묵동 122-12"
        marker23.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker23)
            true
        }
        marker24.tag = "서울 노원구 공릉동 371-1"
        marker24.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker24)
            true
        }
        marker25.tag = "서울 노원구 공릉로 261-5"
        marker25.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker25)
            true
        }
        marker26.tag = "서울 노원구 하계동 107-1"
        marker26.setOnClickListener {
            // 마커를 클릭할 때 정보창을 엶
            infoWindow.open(marker26)
            true
        }

        infoWindow.adapter = object : InfoWindow.DefaultTextAdapter(this) {
            override fun getText(infoWindow: InfoWindow): CharSequence {
                // 정보 창이 열린 마커의 tag를 텍스트로 노출하도록 반환
                return infoWindow.marker?.tag as CharSequence? ?: ""
            }
        }


    }
    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }
}
