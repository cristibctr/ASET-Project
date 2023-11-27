package com.bctr.ssvs.voting.observer;

import com.bctr.ssvs.voting.DTO.GenericEventDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.bctr.ssvs.voting.observer.EventType.ADMINISTRATOR;
import static com.bctr.ssvs.voting.observer.EventType.COUNTER;

public class EventManager {
    Map<EventType, List<EventListener<? extends GenericEventDTO>>> listeners = new HashMap<>();
    public static EventManager instance;

    private EventManager() {
        this.listeners.put(ADMINISTRATOR, new ArrayList<>());
        this.listeners.put(COUNTER, new ArrayList<>());
    }

    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    public <T extends GenericEventDTO> void subscribe(EventType eventType, EventListener<T> listener) {
        List<EventListener<? extends GenericEventDTO>> users = listeners.get(eventType);
        users.add(listener);
    }

    public <T extends GenericEventDTO> void unsubscribe(EventType eventType, EventListener<T> listener) {
        List<EventListener<? extends GenericEventDTO>> users = listeners.get(eventType);
        users.remove(listener);
    }

    public <T extends GenericEventDTO> void notify(EventType eventType, T genericEventDTO) {
        List<EventListener<? extends GenericEventDTO>> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, genericEventDTO);
        }
    }
}
