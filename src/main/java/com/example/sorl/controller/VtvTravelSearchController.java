package com.example.sorl.controller;

import com.example.sorl.model.VtvTravelSearch;
import com.example.sorl.service.VtvTravelSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VtvTravelSearchController {

    @Autowired
    private VtvTravelSearchService vtvTravelSearchService;

    @GetMapping("findByContentName1/{contentName}")
    public Iterable<VtvTravelSearch> getByContentName(@PathVariable String contentName) {
        return vtvTravelSearchService.findByContentName(contentName);
    }

    @GetMapping("findByContentNameAndRegionName1/{contentName}/{regionName}")
    public List<VtvTravelSearch> getByContentNameAndRegionName(@PathVariable String contentName, @PathVariable String regionName) {
        return vtvTravelSearchService.findByContentNameAndRegionName(contentName, regionName);
    }

    @GetMapping("findByContentNameAndRegionNameAndName1/{contentName}/{regionName}/{name}")
    public List<VtvTravelSearch> getByContentNameAndRegionNameAndName(@PathVariable String contentName, @PathVariable String regionName, @PathVariable String name) {
        return vtvTravelSearchService.findByContentNameAndRegionNameAndName1(contentName, regionName, name);
    }

    @GetMapping("findByContentNameAndRegionNameAndName2/{contentName}/{regionName}/{name}")
    public List<VtvTravelSearch> getByContentNameAndRegionNameAndName2(@PathVariable String contentName, @PathVariable String regionName, @PathVariable String name) {
        return vtvTravelSearchService.findByContentNameAndRegionNameAndName2(contentName, regionName, name);
    }

    @GetMapping("findByContentNameAndRegionNameAndAddress1/{contentName}/{regionName}/{address}")
    public List<VtvTravelSearch> getByContentNameAndRegionNameAndAddress1(@PathVariable String contentName, @PathVariable String regionName, @PathVariable String address) {
        return vtvTravelSearchService.findByContentNameAndRegionNameAndAddress1(contentName, regionName, address);
    }

    @GetMapping("findByContentNameAndRegionNameAndAddress2/{contentName}/{regionName}/{address}")
    public List<VtvTravelSearch> getByContentNameAndRegionNameAndAddress2(@PathVariable String contentName, @PathVariable String regionName, @PathVariable String address) {
        return vtvTravelSearchService.findByContentNameAndRegionNameAndAddress2(contentName, regionName, address);
    }

    @GetMapping("findByDataLocRadius/{contentName}/{latitude}/{longitude}/{distance}")
    public List<VtvTravelSearch> findByDataLocRadius(@PathVariable String contentName, @PathVariable String latitude, @PathVariable String longitude, @PathVariable Integer distance) {
        return vtvTravelSearchService.findByDataLocRadius(contentName, latitude, longitude, distance);
    }

    @GetMapping("findByDataLocRadiusExpand/{contentName}/{latitude}/{longitude}/{distance}")
    public List<VtvTravelSearch> findByDataLocRadiusExpand(@PathVariable String contentName, @PathVariable String latitude, @PathVariable String longitude, @PathVariable Integer distance) {
        return vtvTravelSearchService.findByDataLocRadiusExpand(contentName, latitude, longitude, distance);
    }

    @GetMapping("findByDataLocAroundTravelDistance/{contentName}/{startLatitude}/{startLongitude}/{endLatitude}/{endLongitude}")
    public List<VtvTravelSearch> findByDataLocAroundTravelDistance(@PathVariable String contentName, @PathVariable String startLatitude, @PathVariable String startLongitude, @PathVariable String endLatitude, @PathVariable String endLongitude) {
        return vtvTravelSearchService.findByDataLocAroundTravelDistance(contentName, startLatitude, startLongitude, endLatitude, endLongitude);
    }

}
