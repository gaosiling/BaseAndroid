package com.yuyoubang.manager;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.yuyoubang.R;

public class ImageOption {

    public static final DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
            .showImageOnLoading(R.mipmap.building) //设置图片在下载期间显示的图片
            .showImageForEmptyUri(R.mipmap.building)//设置图片Uri为空或是错误的时候显示的图片
            .showImageOnFail(R.mipmap.building)  //设置图片加载/解码过程中错误时候显示的图片
            .cacheOnDisk(true)//设置下载的图片是否缓存在SD卡中
            .considerExifParams(true)  //是否考虑JPEG图像EXIF参数（旋转，翻转）
            .resetViewBeforeLoading(true)//设置图片在下载前是否重置，复位
            .build();//构建完成

    public static final DisplayImageOptions defaultOptions_des = new DisplayImageOptions.Builder()
            .cacheInMemory(true)
            .cacheOnDisk(true)//设置下载的图片是否缓存在SD卡中
            .considerExifParams(true)  //是否考虑JPEG图像EXIF参数（旋转，翻转）
            .resetViewBeforeLoading(true)//设置图片在下载前是否重置，复位
            .build();//构建完成

    public static final DisplayImageOptions circle = new DisplayImageOptions.Builder()
            .cacheOnDisk(true)//设置下载的图片是否缓存在SD卡中
            .considerExifParams(true)  //是否考虑JPEG图像EXIF参数（旋转，翻转）
            .resetViewBeforeLoading(true)//设置图片在下载前是否重置，复位
            .displayer(new RoundedBitmapDisplayer(200))//是否设置为圆角，弧度为多少
            .build();//构建完成

    public static final DisplayImageOptions default_avatar = new DisplayImageOptions.Builder()
            .cacheOnDisk(true)//设置下载的图片是否缓存在SD卡中
            .considerExifParams(true)  //是否考虑JPEG图像EXIF参数（旋转，翻转）
            .resetViewBeforeLoading(true)//设置图片在下载前是否重置，复位
            .displayer(new RoundedBitmapDisplayer(200))//是否设置为圆角，弧度为多少
            .showImageForEmptyUri(R.mipmap.mine_mine)
            .showImageOnFail(R.mipmap.mine_mine)
            .build();//构建完成

    public static final DisplayImageOptions circle_14 = new DisplayImageOptions.Builder()
            .cacheOnDisk(true)//设置下载的图片是否缓存在SD卡中
            .considerExifParams(true)  //是否考虑JPEG图像EXIF参数（旋转，翻转）
            .showImageOnLoading(R.mipmap.building) //设置图片在下载期间显示的图片
            .showImageForEmptyUri(R.mipmap.building)//设置图片Uri为空或是错误的时候显示的图片
            .showImageOnFail(R.mipmap.building)  //设置图片加载/解码过程中错误时候显示的图片
            .resetViewBeforeLoading(true)//设置图片在下载前是否重置，复位
            .displayer(new RoundedBitmapDisplayer(19))//是否设置为圆角，弧度为多少
            .build();//构建完成
    public static final DisplayImageOptions circle_cache = new DisplayImageOptions.Builder()
            .cacheOnDisk(true)//设置下载的图片是否缓存在SD卡中
            .considerExifParams(true)  //是否考虑JPEG图像EXIF参数（旋转，翻转）
            .resetViewBeforeLoading(true)//设置图片在下载前是否重置，复位
            .displayer(new RoundedBitmapDisplayer(200))//是否设置为圆角，弧度为多少
            .build();//构建完成

}
