package com.entregaTP3.repository;

import com.entregaTP3.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class CoursesRepository  implements JpaRepository<Courses, Integer> {

}
