package com.ohdroid.zbmaster.homepage.areamovie.view

import com.ohdroid.zbmaster.application.BaseView
import com.ohdroid.zbmaster.homepage.areaface.model.FaceInfo
import com.ohdroid.zbmaster.homepage.areamovie.model.MovieInfo

/**
 * Created by ohdroid on 2016/4/11.
 */
interface MovieListView : BaseView {

    /**
     * 显示表情列表
     * @param faces 表情url数组
     */
    fun showMovieList(faces: MutableList<MovieInfo>, hasMore: Boolean);

    /**
     * 显示更多表情
     */
    fun showMoreMovieInfo(hasMore: Boolean)

    /**
     *无数据时，显示空页面
     */
    fun showEmpty()

    /**
     * 显示错误提示页面
     */
    fun showErrorView(errorState: Int, errorMessage: String)

    /**
     * 显示表情详细信息
     */
    fun showMovieInfoDetail(movieInfo: MovieInfo)

    /**
     * 显示文字信息提示
     */
    fun showToastHint(msg: String)
}