package me.jbusdriver.mvp.presenter

import me.jbusdriver.mvp.LinkCollectContract
import me.jbusdriver.mvp.bean.ILink

class LinkCollectPresenterImpl : BaseAbsCollectPresenter<LinkCollectContract.LinkCollectView, ILink>(), LinkCollectContract.LinkCollectPresenter {
    override fun lazyLoad() {
        onFirstLoad()
    }
}