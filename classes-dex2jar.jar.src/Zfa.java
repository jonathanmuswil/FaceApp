public final class zfa
{
  private final int android_sdk;
  private final String app_version;
  private final int build_number;
  private final int rating;
  private final String text;
  
  public zfa(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.rating = paramInt1;
    this.text = paramString1;
    this.app_version = paramString2;
    this.build_number = paramInt2;
    this.android_sdk = paramInt3;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof zfa))
      {
        paramObject = (zfa)paramObject;
        int i;
        if (this.rating == ((zfa)paramObject).rating) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i != 0) && (oXa.a(this.text, ((zfa)paramObject).text)) && (oXa.a(this.app_version, ((zfa)paramObject).app_version)))
        {
          if (this.build_number == ((zfa)paramObject).build_number) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.android_sdk == ((zfa)paramObject).android_sdk) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label116;
            }
          }
        }
      }
      return false;
    }
    label116:
    return true;
  }
  
  public int hashCode()
  {
    int i = this.rating;
    String str = this.text;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = this.app_version;
    if (str != null) {
      j = str.hashCode();
    }
    return (((i * 31 + k) * 31 + j) * 31 + this.build_number) * 31 + this.android_sdk;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Feedback(rating=");
    localStringBuilder.append(this.rating);
    localStringBuilder.append(", text=");
    localStringBuilder.append(this.text);
    localStringBuilder.append(", app_version=");
    localStringBuilder.append(this.app_version);
    localStringBuilder.append(", build_number=");
    localStringBuilder.append(this.build_number);
    localStringBuilder.append(", android_sdk=");
    localStringBuilder.append(this.android_sdk);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */