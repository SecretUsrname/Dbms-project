package org.example.dbmsprojectgui.repository;

import org.example.dbmsprojectgui.model.Satellite;
import org.example.dbmsprojectgui.model.SatelliteDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SatelliteRepository extends JpaRepository<Satellite, Integer> {
    @Procedure(name = "GetSatelliteDetailsByOrbitType")
    List<SatelliteDetails> getSatelliteDetailsByOrbitType(@Param("Otype") String OrbitType);
}
