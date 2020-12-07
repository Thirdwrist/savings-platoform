package com.getThirdwrist.Savings.App.Security;

public class SecurityConstants {
    public static final String SECRET = "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTYwNzI5NTA1MiwiaWF0IjoxNjA3Mjk1MDUyfQ.ZBtbMlFgikW_Wr6ZrkxZ-Wc38PRjRAEXGjrfM_Q7U60";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/signup/**";
}
