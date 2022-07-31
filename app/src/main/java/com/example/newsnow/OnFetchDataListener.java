package com.example.newsnow;

import com.example.newsnow.Models.NewsApiResponse;
import com.example.newsnow.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
