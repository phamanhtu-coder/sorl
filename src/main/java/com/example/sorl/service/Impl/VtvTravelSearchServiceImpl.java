package com.example.sorl.service.Impl;

import com.example.sorl.model.VtvTravelSearch;
import com.example.sorl.repository.VtvTravelSearchRepository;
import com.example.sorl.service.ConvertStringService;
import com.example.sorl.service.VtvTravelSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VtvTravelSearchServiceImpl implements VtvTravelSearchService {
    @Autowired
    private VtvTravelSearchRepository vtvTravelSearchRepository;

    @Autowired
    private ConvertStringService convertStringService;

    @Override
    public List<VtvTravelSearch> findByContentName(String contentName) {

        return vtvTravelSearchRepository.findByContentName(convertStringService.convert(contentName), Sort.by(Sort.Direction.DESC, "view_count"));
    }

    @Override
    public List<VtvTravelSearch> findByContentNameAndRegionName(String contentName, String region_name) {
        return vtvTravelSearchRepository.findByContentNameAndRegionName(convertStringService.convert(contentName), convertStringService.convert(region_name));
    }

    @Override
    public List<VtvTravelSearch> findByContentNameAndRegionNameAndName1(String contentName, String region_name, String name) {
        return vtvTravelSearchRepository.findByContentNameAndRegionNameAndName1(convertStringService.convert(contentName), convertStringService.convert(region_name), convertStringService.convert(name));
    }


    @Override
    public List<VtvTravelSearch> findByContentNameAndRegionNameAndName2(String content_name, String region_name, String name) {
        return vtvTravelSearchRepository.findByContentNameAndRegionNameAndName2(convertStringService.convert(content_name), convertStringService.convert(region_name), name);
    }

    @Override
    public List<VtvTravelSearch> findByContentNameAndRegionNameAndAddress1(String content_name, String region_name, String address) {
        return vtvTravelSearchRepository.findByContentNameAndRegionNameAndAddress1(convertStringService.convert(content_name), convertStringService.convert(region_name), convertStringService.convert(address));
    }

    @Override
    public List<VtvTravelSearch> findByContentNameAndRegionNameAndAddress2(String content_name, String region_name, String address) {
        return vtvTravelSearchRepository.findByContentNameAndRegionNameAndAddress2(convertStringService.convert(content_name), convertStringService.convert(region_name), address, Sort.by(Sort.Direction.DESC, "view_count"));
    }

    @Override
    public List<VtvTravelSearch> findByDataLocRadius(String content_name, String latitude, String longitude, Integer distance) {
        return vtvTravelSearchRepository.findByContentNameAndDataLocWithin(convertStringService.convert(content_name), latitude, longitude, distance);
    }

    @Override
    public List<VtvTravelSearch> findByDataLocRadiusExpand(String content_name, String latitude, String longitude, Integer distance) {
        return vtvTravelSearchRepository.findByContentNameAndDataLocWithin2(convertStringService.convert(content_name), latitude, longitude, distance);
    }

    @Override
    public List<VtvTravelSearch> findByDataLocAroundTravelDistance(String content_name, String start_latitude, String start_longitude, String end_latitude, String end_longitude) {
        return vtvTravelSearchRepository.findByContentNameAndDataLocNear(convertStringService.convert(content_name), start_latitude, start_longitude, end_latitude, end_longitude);
    }

}
