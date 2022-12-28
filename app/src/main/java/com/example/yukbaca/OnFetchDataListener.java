package com.example.yukbaca;

import com.example.yukbaca.models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String messsage);
    void onError(String message);
}
