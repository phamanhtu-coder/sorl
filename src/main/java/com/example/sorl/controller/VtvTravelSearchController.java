package com.example.sorl.controller;

import com.example.sorl.service.VtvTravelSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VtvTravelSearchController {

    @Autowired
    private VtvTravelSearchService vtvTravelSearchService;

    @GetMapping("findByContentName/{contentName}")
    public ResponseEntity<?> getByContentName(@PathVariable String contentName) {
        try {
            return new ResponseEntity<>(vtvTravelSearchService.findByContentName(contentName), HttpStatus.OK);
        }catch (Exception exception)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("findByContentNameAndRegionName1/{contentName}/{regionName}")
    public ResponseEntity<?> getByContentNameAndRegionName(@PathVariable String contentName, @PathVariable String regionName) {
        try {

            return new ResponseEntity<>(vtvTravelSearchService.findByContentNameAndRegionName(contentName, regionName), HttpStatus.OK);
        }catch (Exception exception)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("findByContentNameAndRegionNameAndName1/{contentName}/{regionName}/{name}")
    public ResponseEntity<?> getByContentNameAndRegionNameAndName(@PathVariable String contentName, @PathVariable String regionName, @PathVariable String name) {
        try {
            return new ResponseEntity<>(vtvTravelSearchService.findByContentNameAndRegionNameAndName1(contentName, regionName, name), HttpStatus.OK);
        }catch (Exception exception)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("findByContentNameAndRegionNameAndName2/{contentName}/{regionName}/{name}")
    public ResponseEntity<?> getByContentNameAndRegionNameAndName2(@PathVariable String contentName, @PathVariable String regionName, @PathVariable String name) {
        try {
            return new ResponseEntity<>(vtvTravelSearchService.findByContentNameAndRegionNameAndName2(contentName, regionName, name), HttpStatus.OK);
        }catch (Exception exception)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("findByContentNameAndRegionNameAndAddress1/{contentName}/{regionName}/{address}")
    public ResponseEntity<?> getByContentNameAndRegionNameAndAddress1(@PathVariable String contentName, @PathVariable String regionName, @PathVariable String address) {
        try {
            return new ResponseEntity<>(vtvTravelSearchService.findByContentNameAndRegionNameAndAddress1(contentName, regionName, address), HttpStatus.OK);
        }catch (Exception exception)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("findByContentNameAndRegionNameAndAddress2/{contentName}/{regionName}/{address}")
    public ResponseEntity<?> getByContentNameAndRegionNameAndAddress2(@PathVariable String contentName, @PathVariable String regionName, @PathVariable String address) {
        try {
            return new ResponseEntity<>(vtvTravelSearchService.findByContentNameAndRegionNameAndAddress2(contentName, regionName, address),HttpStatus.OK);
        }catch (Exception exception)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("findByDataLocRadius/{contentName}/{latitude}/{longitude}/{distance}")
    public ResponseEntity<?> findByDataLocRadius(@PathVariable String contentName, @PathVariable String latitude, @PathVariable String longitude, @PathVariable Integer distance) {
            try {
                return new ResponseEntity<>(vtvTravelSearchService.findByDataLocRadius(contentName, latitude, longitude, distance), HttpStatus.OK);
            }catch (Exception exception)
            {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

    @GetMapping("findByDataLocRadiusExpand/{contentName}/{latitude}/{longitude}/{distance}")
    public ResponseEntity<?> findByDataLocRadiusExpand(@PathVariable String contentName, @PathVariable String latitude, @PathVariable String longitude, @PathVariable Integer distance) {
        try {
            return new ResponseEntity<>(vtvTravelSearchService.findByDataLocRadiusExpand(contentName, latitude, longitude, distance), HttpStatus.OK);
        }catch (Exception exception)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("findByDataLocAroundTravelDistance/{contentName}/{startLatitude}/{startLongitude}/{endLatitude}/{endLongitude}")
    public ResponseEntity<?> findByDataLocAroundTravelDistance(@PathVariable String contentName, @PathVariable String startLatitude, @PathVariable String startLongitude, @PathVariable String endLatitude, @PathVariable String endLongitude) {
        try {
            return new ResponseEntity<>(vtvTravelSearchService.findByDataLocAroundTravelDistance(contentName, startLatitude, startLongitude, endLatitude, endLongitude), HttpStatus.OK);
        }catch (Exception exception)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
