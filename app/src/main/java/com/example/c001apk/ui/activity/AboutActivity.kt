package com.example.c001apk.ui.activity

import android.annotation.SuppressLint
import android.widget.ImageView
import android.widget.TextView
import com.drakeet.about.*
import com.example.c001apk.BuildConfig
import com.example.c001apk.R

class AboutActivity : AbsAboutActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreateHeader(icon: ImageView, slogan: TextView, version: TextView) {
        icon.setImageResource(R.mipmap.ic_launcher)
        slogan.text = applicationInfo.loadLabel(packageManager)
        version.text = "${BuildConfig.VERSION_NAME}(${BuildConfig.VERSION_CODE})"
    }

    override fun onItemsCreated(items: MutableList<Any>) {
        items.add(Category(getString(R.string.about)))
        items.add(Card("fake coolapk"))

        items.add(Category(getString(R.string.feedback)))
        items.add(Card("Github\nhttps://github.com/bggRGjQaUbCoE/c001apk"))

        items.add(Category(getString(R.string.about_open_source)))
        items.add(License("kotlin", "JetBrains", License.APACHE_2, "https://github.com/JetBrains/kotlin"))
        items.add(License("AndroidX", "Google", License.APACHE_2, "https://source.google.com"))
        items.add(License("material-components-android", "Google", License.APACHE_2, "https://github.com/material-components/material-components-android"))
        items.add(License("RikkaX", "RikkaApps", License.MIT, "https://github.com/RikkaApps/RikkaX"))
        items.add(License("about-page", "drakeet", License.APACHE_2, "https://github.com/drakeet/about-page"))
        items.add(License("LSPosed", "LSPosed", License.GPL_V3, "https://github.com/LSPosed/LSPosed"))
        items.add(License("LibChecker", "LibChecker", License.GPL_V3, "https://github.com/LibChecker/LibChecker"))
        items.add(License("Hide-My-Applist", "Dr-TSNG", License.GPL_V3, "https://github.com/Dr-TSNG/Hide-My-Applist"))
        items.add(License("okhttp", "square", License.APACHE_2, "https://github.com/square/okhttp"))
        items.add(License("retrofit", "square", License.APACHE_2, "https://github.com/square/retrofit"))
        items.add(License("glide", "bumptech", License.APACHE_2, "https://github.com/bumptech/glide"))
        items.add(License("SherlockGougou", "BigImageViewPager", License.APACHE_2, "https://github.com/SherlockGougou/BigImageViewPager"))
        items.add(License("jBCrypt", "jeremyh", License.APACHE_2, "https://github.com/jeremyh/jBCrypt"))
        items.add(License("flexbox-layout", "google", License.APACHE_2, "https://github.com/google/flexbox-layout"))
        items.add(License("glide-transformations", "wasabeef", License.APACHE_2, "https://github.com/wasabeef/glide-transformations"))
        items.add(License("jsoup", "jhy", License.MIT, "https://github.com/jhy/jsoup"))
        items.add(License("VerticalTabLayout", "qstumn", License.APACHE_2, "https://github.com/qstumn/VerticalTabLayout"))
        items.add(License("NineImageView", "HotBitmapGG", License.APACHE_2, "https://github.com/HotBitmapGG/NineImageView"))
    }
}
