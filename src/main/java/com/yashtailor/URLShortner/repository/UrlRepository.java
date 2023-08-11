package com.yashtailor.URLShortner.repository;

import com.yashtailor.URLShortner.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url, Integer> {
    @Query(value = "select originalurl from Url where shorturl = ?1", nativeQuery = true)
    String findByShortUrl(String id);
}
