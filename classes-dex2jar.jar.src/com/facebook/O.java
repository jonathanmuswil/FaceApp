package com.facebook;

public class o
  extends p
{
  private int a;
  private String b;
  
  public o(String paramString1, int paramInt, String paramString2)
  {
    super(paramString1);
    this.a = paramInt;
    this.b = paramString2;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{FacebookDialogException: ");
    localStringBuilder.append("errorCode: ");
    localStringBuilder.append(a());
    localStringBuilder.append(", message: ");
    localStringBuilder.append(getMessage());
    localStringBuilder.append(", url: ");
    localStringBuilder.append(b());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */