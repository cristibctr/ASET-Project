package com.bctr.ssvs.voting.observer;

import com.bctr.ssvs.voting.DTO.GenericEventDTO;

public interface EventListener<T extends GenericEventDTO> {
    void update(EventType eventType, T genericEvent);
}
