package com.zhy.adapter.recyclerview.base;


/**
 * Created by zhy on 16/6/22.
 */
public abstract class ItemViewDelegate<T> {

    public abstract int getItemViewLayoutId();

    public abstract boolean isForViewType(T item, int position);

    public abstract void convert(ViewHolder holder, T t, int position);

    /**
     * 设置 item 占用几格,默认是1格
     * 注意 如果是 {@link androidx.recyclerview.widget.GridLayoutManager} 占用列数可自己配置
     * 如果是 {@link androidx.recyclerview.widget.StaggeredGridLayoutManager} 只可以选择1格,或者 占用一行全部的格数
     * {@see SPAN_FULL}
     *
     * @return
     */
    public int getSpan(){
        return SPAN_DEFAULT;
    }

    /**
     * 默认格数
     */
    public static final int SPAN_DEFAULT = 1;
    /**
     * 占用一行全部的格数
     * 如果在 GridLayoutManager 中返回这个,将占用一整行
     */
    public static final int SPAN_FULL = -1;
}
