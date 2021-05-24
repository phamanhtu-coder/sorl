package com.example.sorl.service;

import com.example.sorl.model.VtvTravelSearch;

import java.util.List;

public interface VtvTravelSearchService {
    List<VtvTravelSearch> findByContentName(String contentName);

    List<VtvTravelSearch> findByContentNameAndRegionName(String contentName, String regionName);

    List<VtvTravelSearch> findByContentNameAndRegionNameAndName1(String contentName, String regionName, String name);

    List<VtvTravelSearch> findByContentNameAndRegionNameAndName2(String contentName, String regionName, String name);

    List<VtvTravelSearch> findByContentNameAndRegionNameAndAddress1(String contentName, String regionName, String address);

    List<VtvTravelSearch> findByContentNameAndRegionNameAndAddress2(String contentName, String regionName, String address);

    List<VtvTravelSearch> findByDataLocRadius(String contentName, String latitude, String longitude, Integer distance);

    List<VtvTravelSearch> findByDataLocRadiusExpand(String contentName, String latitude, String longitude, Integer distance);

    List<VtvTravelSearch> findByDataLocAroundTravelDistance(String contentName, String startLatitude, String startLongitude, String endLatitude, String endLongitude);

}
