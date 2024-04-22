package com.live.practicavivo.service;

import com.live.practicavivo.model.LiveDto;

public interface LiveService {
    LiveDto addLive(LiveDto live);

    LiveDto updateLive(LiveDto live);

    LiveDto deleteLive(LiveDto live);

    LiveDto findLiveById(Long id);

    LiveDto findLiveByName(String name);

    LiveDto findLiveByUserName(String userName);

    LiveDto listAllLive();
}
