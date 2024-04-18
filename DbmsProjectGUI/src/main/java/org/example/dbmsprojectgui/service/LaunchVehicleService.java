package org.example.dbmsprojectgui.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
import org.example.dbmsprojectgui.model.LaunchVehicleStatistics;
import org.example.dbmsprojectgui.model.Launchvehicle;
import org.example.dbmsprojectgui.repository.LaunchVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Date;

import java.util.List;

@Service
public class LaunchVehicleService {
    private final LaunchVehicleRepository launchVehicleRepository;

    @Autowired
    public LaunchVehicleService(LaunchVehicleRepository launchVehicleRepository) {
        this.launchVehicleRepository = launchVehicleRepository;
    }

    public List<Launchvehicle> findAllLaunchVehicles() {
        return launchVehicleRepository.findAll();
    }

    public Launchvehicle findLaunchVehicleById(Integer id) {
        return launchVehicleRepository.findById(id).orElse(null);
    }

    public Launchvehicle saveLaunchVehicle(Launchvehicle launchVehicle) {
        return launchVehicleRepository.save(launchVehicle);
    }

    @Autowired
    private EntityManager entityManager;

    public List<Object[]> getSuccessDetails(Date startDate, Date endDate) {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("GetSuccessDetails");
        query.registerStoredProcedureParameter("Sdate", Date.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("edate", Date.class, ParameterMode.IN);
        query.setParameter("Sdate", startDate);
        query.setParameter("edate", endDate);

        query.execute();
        return query.getResultList();
    }

    public void deleteLaunchVehicle(Integer id) {
        launchVehicleRepository.deleteById(id);
    }
}
