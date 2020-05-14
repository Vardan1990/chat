package am.gitc.chat.util;

import am.gitc.chat.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

  private static final ObjectMapper objectMapper = new ObjectMapper();

  private JsonUtil() {
    throw new SecurityException("Can't instantiate this class.");
  }

  public static String serialize(Object obj) throws JsonProcessingException {
    return objectMapper.writer().writeValueAsString(obj);
  }
}
