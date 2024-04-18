package org.example.dbmsprojectgui.repository;
import org.example.dbmsprojectgui.model.LaunchVehicleStatistics;
import org.example.dbmsprojectgui.model.Launchevent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LaunchEventRepository extends JpaRepository<Launchevent, Integer> {

    @Procedure(name = "GetSuccessDetails")
    List<Object[]> getSuccessDetails(@Param("Sdate") Date startDate, @Param("edate") Date endDate);
}
