package ru.volkov.bootsample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import ru.volkov.bootsample.entity.Location;

/**
 * User: serg-v
 * Date: 6/20/16
 * Time: 11:37 PM
 */
@Repository
public interface LocationRepository extends MongoRepository<Location, String>{
}
