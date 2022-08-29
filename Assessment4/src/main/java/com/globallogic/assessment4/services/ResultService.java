package com.globallogic.assessment4.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.assessment4.entity.Result;

@Service
public interface ResultService {
public String adddetails(Result rs);
public String updatedetails(Result rs);
public List<Result> alldetails();
}
