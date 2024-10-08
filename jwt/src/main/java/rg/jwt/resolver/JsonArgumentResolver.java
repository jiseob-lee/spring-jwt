package rg.jwt.resolver;

public class JsonArgumentResolver /* implements HandlerMethodArgumentResolver */ {
/*
    private static final String JSON_BODY_ATTRIBUTE = "JSON_REQUEST_BODY";

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(JsonArg.class);
    }

    @Override
    public Object resolveArgument(
      MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
      WebDataBinderFactory binderFactory) 
      throws Exception {
        String body = getRequestBody(webRequest);
        String jsonPath = Objects.requireNonNull(
          Objects.requireNonNull(parameter.getParameterAnnotation(JsonArg.class)).value());
        Class<?> parameterType = parameter.getParameterType();
        return JsonPath.parse(body).read(jsonPath, parameterType);
    }

    private String getRequestBody(NativeWebRequest webRequest) {
        HttpServletRequest servletRequest = Objects.requireNonNull(
          webRequest.getNativeRequest(HttpServletRequest.class));
        String jsonBody = (String) servletRequest.getAttribute(JSON_BODY_ATTRIBUTE);
        if (jsonBody == null) {
            try {
                jsonBody = IOUtils.toString(servletRequest.getInputStream());
                servletRequest.setAttribute(JSON_BODY_ATTRIBUTE, jsonBody);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return jsonBody;
    }
*/
}
