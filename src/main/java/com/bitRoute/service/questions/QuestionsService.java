package com.bitRoute.service.questions;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONException;

public interface QuestionsService {
  public String findQuestions() throws JsonProcessingException, JSONException;
  public String findByDomainId(String Domain) throws JSONException, JsonProcessingException;
}
