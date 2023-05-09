package com.bitRoute.service.questions;

import com.bitRoute.entity.Questions;
import org.json.JSONException;

public interface QuestionsService {
  public String findQuestions();
  public String findByDomainId(String Domain) throws JSONException;
}
