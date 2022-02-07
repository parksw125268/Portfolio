package com.kotlin.mydelivery

import android.app.Application
import android.content.Context

class MyDeliveryApplication : Application() {
    //onCreate시에 appContext를 사용해야 하기 때문에 (뭔소린지 모름)
    override fun onCreate(){
        super.onCreate()
        appContext = this
    }


    override fun onTerminate(){ //앱종료시
        super.onTerminate()
        appContext = null
    }

    companion object{
        //terminate가 된case는 null로 바꿔줘야되기 때문에 nullable하게 선언
        var appContext: Context? = null
            private set //<==??
    }

}