package com.example.sorl.repository;

import com.example.sorl.model.VtvTravelSearch;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.Repository;
import org.springframework.data.solr.repository.Query;

import java.util.List;

public interface VtvTravelSearchRepository extends Repository<VtvTravelSearch, String> {

    List<VtvTravelSearch> findByNameStartingWith(String name);

    @Query(value = "content_name:?0*")
    List<VtvTravelSearch> findByContentName(String contentName, Sort sort);

    @Query(value = "content_name:?0 AND region_name:?1")
    List<VtvTravelSearch> findByContentNameAndRegionName(String contentName, String regionName);

    @Query(value = "content_name:?0 AND region_name:?1 AND name:?2*")
    List<VtvTravelSearch> findByContentNameAndRegionNameAndName1(String contentName, String regionName, String name);

    @Query(value = "content_name:?0 AND region_name:?1 AND name:?2*")
    List<VtvTravelSearch> findByContentNameAndRegionNameAndName2(String contentName, String regionName, String name);

    @Query(value = "content_name:?0 AND region_name:?1 AND address:?2*")
    List<VtvTravelSearch> findByContentNameAndRegionNameAndAddress1(String contentName, String regionName, String address);

    @Query(value = "content_name:?0 AND region_name:?1 AND address:?2*")
    List<VtvTravelSearch> findByContentNameAndRegionNameAndAddress2(String contentName, String regionName, String address, Sort sort);

    @Query(value = "content_name:?0 AND {!geofilt  pt=?1,?2 sfield=data_loc d=?3}")
    List<VtvTravelSearch> findByContentNameAndDataLocWithin(String contentName, String latitude, String longitude, Integer distance);

    @Query(value = "content_name:?0 AND {!bbox pt=?1,?2 sfield=data_loc d=?3}")
    List<VtvTravelSearch> findByContentNameAndDataLocWithin2(String contentName, String latitude, String longitude, Integer distance);

    @Query(value = "content_name:?0 AND data_loc:[?1,?2 TO ?3,?4]")
    List<VtvTravelSearch> findByContentNameAndDataLocNear(String contentName, String startLatitude, String startLongitude, String endLatitude, String endLongitude);
}
