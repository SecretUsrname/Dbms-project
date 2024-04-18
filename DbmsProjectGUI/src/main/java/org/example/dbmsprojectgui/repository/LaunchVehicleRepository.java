package org.example.dbmsprojectgui.repository;

import org.example.dbmsprojectgui.model.Launchvehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaunchVehicleRepository extends JpaRepository<Launchvehicle, Integer> {
}
