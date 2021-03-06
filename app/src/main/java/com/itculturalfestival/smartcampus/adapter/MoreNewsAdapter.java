package com.itculturalfestival.smartcampus.adapter;

import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.itculturalfestival.smartcampus.R;
import com.itculturalfestival.smartcampus.entity.News;
import com.itculturalfestival.smartcampus.ui.main.home.ArticleDetailActivity;
import com.itculturalfestival.smartcampus.utils.GlideUtils;

/**
 * Created by vegen on 2018/3/21.
 */

public class MoreNewsAdapter extends BaseQuickAdapter<News, BaseViewHolder> {

    public MoreNewsAdapter() {
        super(R.layout.app_item_more_news);
    }

    @Override
    protected void convert(BaseViewHolder helper, News item) {
        // 新闻图片
        GlideUtils.load(mContext, true, item.getNews_pic(), (ImageView) helper.getView(R.id.iv_news_img));
        // 新闻时间
        helper.setText(R.id.tv_news_time, item.getNews_date());
        // 新闻标题
        helper.setText(R.id.tv_news_title, item.getNews_title());

        helper.itemView.setOnClickListener(v -> ArticleDetailActivity.start(mContext, item.getNews_title(), item.getNews_url()));
    }
}