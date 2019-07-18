package com.facebook;

public class q
  extends p
{
  private final I a;
  
  public q(I paramI, String paramString)
  {
    super(paramString);
    this.a = paramI;
  }
  
  public final String toString()
  {
    Object localObject = this.a;
    if (localObject != null) {
      localObject = ((I)localObject).a();
    } else {
      localObject = null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{FacebookGraphResponseException: ");
    String str = getMessage();
    if (str != null)
    {
      localStringBuilder.append(str);
      localStringBuilder.append(" ");
    }
    if (localObject != null)
    {
      localStringBuilder.append("httpResponseCode: ");
      localStringBuilder.append(((t)localObject).q());
      localStringBuilder.append(", facebookErrorCode: ");
      localStringBuilder.append(((t)localObject).m());
      localStringBuilder.append(", facebookErrorType: ");
      localStringBuilder.append(((t)localObject).o());
      localStringBuilder.append(", message: ");
      localStringBuilder.append(((t)localObject).n());
      localStringBuilder.append("}");
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */