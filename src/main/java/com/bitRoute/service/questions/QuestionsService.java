package com.bitRoute.service.questions;

import com.bitRoute.entity.Questions;
import org.json.JSONException;

import java.util.List;

public interface QuestionsService {
  public String findQuestions();
  public List<Questions> findByDomainId(String Domain) throws JSONException;
}
