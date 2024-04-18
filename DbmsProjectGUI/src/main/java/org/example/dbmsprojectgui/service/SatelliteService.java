package org.example.dbmsprojectgui.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;
import org.example.dbmsprojectgui.model.Satellite;
import org.example.dbmsprojectgui.model.SatelliteDetails;
import org.example.dbmsprojectgui.repository.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class SatelliteService {
    private final SatelliteRepository satelliteRepository;

    @Autowired
    public SatelliteService(SatelliteRepository satelliteRepository) {
        this.satelliteRepository = satelliteRepository;
    }

    public List<Satellite> findAllSatellites() {
        return satelliteRepository.findAll();
    }

    public Satellite findSatelliteById(Integer id) {
        return satelliteRepository.findById(id).orElse(null);
    }

    public Satellite saveSatellite(Satellite satellite) {
        return satelliteRepository.save(satellite);
    }

    public void deleteSatellite(Integer id) {
        satelliteRepository.deleteById(id);
    }

    @PersistenceContext
    private EntityManager entityManager;

    public List<SatelliteDetails> getSatellitesByOrbitType(String orbitType) {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("GetSatelliteDetailsByOrbitType", SatelliteDetails.class);
        query.registerStoredProcedureParameter("p_OrbitType", String.class, ParameterMode.IN);
        query.setParameter("p_OrbitType", orbitType);
        return query.getResultList();
    }
}
