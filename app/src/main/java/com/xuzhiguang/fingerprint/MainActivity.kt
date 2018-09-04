package com.xuzhiguang.fingerprint

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.security.KeyStore

class MainActivity : AppCompatActivity() {

    //无效秘钥 键值
    private var KEY_NAME_NOT_INVALIDATED = "key_not_invalidated"
    private lateinit var mKeyStore: KeyStore

    companion object {
        val TAG = MainActivity::class.simpleName
        val DIALOG_FRAGMENT_TAG = "myFragment"
        val SECRET_MESSAGE = "Very secret message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
