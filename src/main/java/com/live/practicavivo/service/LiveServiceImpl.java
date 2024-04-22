package com.live.practicavivo.service;

import com.live.practicavivo.mapper.LiveMapper;
import com.live.practicavivo.model.LiveDto;
import com.live.practicavivo.repository.LiveRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class LiveServiceImpl implements LiveService{
    private LiveMapper mapper;
    private LiveRepository repository;

    /**
     *
     * @param live
     * @return
     */
    @Override
    public LiveDto addLive(LiveDto live) {
        return mapper.entityToModel(repository.save(mapper.modelToEntity(live)));
    }

    @Override
    public LiveDto updateLive(LiveDto live) {
        return null;
    }

    @Override
    public LiveDto deleteLive(LiveDto live) {
        return null;
    }

    @Override
    public LiveDto findLiveById(Long id) {
        return null;
    }

    @Override
    public LiveDto findLiveByName(String name) {
        return null;
    }

    @Override
    public LiveDto findLiveByUserName(String userName) {
        return null;
    }

    @Override
    public LiveDto listAllLive() {
        return null;
    }
}
