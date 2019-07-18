package com.google.ads;

@Deprecated
public final class AdRequest
{
  public static final String LOGTAG = "Ads";
  public static final String TEST_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
  public static final String VERSION = "0.0.0";
  
  public static enum ErrorCode
  {
    private final String b;
    
    static
    {
      NETWORK_ERROR = new ErrorCode("NETWORK_ERROR", 2, "A network error occurred.");
    }
    
    private ErrorCode(String paramString)
    {
      this.b = paramString;
    }
    
    public final String toString()
    {
      return this.b;
    }
  }
  
  public static enum Gender
  {
    static
    {
      MALE = new Gender("MALE", 1);
    }
    
    private Gender() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/ads/AdRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */