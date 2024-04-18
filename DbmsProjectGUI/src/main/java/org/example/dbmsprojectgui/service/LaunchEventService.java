package org.example.dbmsprojectgui.service;

import org.example.dbmsprojectgui.model.Launchevent;
import org.example.dbmsprojectgui.repository.LaunchEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaunchEventService {
    private final LaunchEventRepository launchEventRepository;

    @Autowired
    public LaunchEventService(LaunchEventRepository launchEventRepository) {
        this.launchEventRepository = launchEventRepository;
    }
    public Launchevent saveLaunchEvent(Launchevent launchEvent) {
        return launchEventRepository.save(launchEvent);
    }

}
