package com.example.sorl.service.Impl;

import com.example.sorl.service.ConvertStringService;
import org.springframework.stereotype.Service;

@Service
public class ConvertStringServiceImpl implements ConvertStringService {

    public String convert(String chainKey)
    {
        return "\"" + chainKey + "\"";

    }

}
