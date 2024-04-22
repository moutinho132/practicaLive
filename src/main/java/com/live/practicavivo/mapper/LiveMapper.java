package com.live.practicavivo.mapper;

import com.live.practicavivo.domain.Live;
import com.live.practicavivo.model.LiveDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LiveMapper {
    LiveDto entityToModel(final Live entity);

    Live modelToEntity(final LiveDto dto);
}
