package com.facebook;

public class z
  extends p
{
  private final t a;
  
  public z(t paramt, String paramString)
  {
    super(paramString);
    this.a = paramt;
  }
  
  public final t a()
  {
    return this.a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{FacebookServiceException: ");
    localStringBuilder.append("httpResponseCode: ");
    localStringBuilder.append(this.a.q());
    localStringBuilder.append(", facebookErrorCode: ");
    localStringBuilder.append(this.a.m());
    localStringBuilder.append(", facebookErrorType: ");
    localStringBuilder.append(this.a.o());
    localStringBuilder.append(", message: ");
    localStringBuilder.append(this.a.n());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */