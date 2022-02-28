package com.giboow.article.jsonview.repository;

import com.giboow.article.jsonview.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>  {
}
