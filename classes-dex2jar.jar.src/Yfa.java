public final class yfa
{
  private final String app_version;
  private final String device_id;
  private final String device_model;
  private final String lang_code;
  private final String registration_id;
  private final boolean sandbox;
  private final String system_version;
  private final String token_type;
  
  public yfa(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this.device_id = paramString1;
    this.registration_id = paramString2;
    this.sandbox = paramBoolean;
    this.app_version = paramString3;
    this.device_model = paramString4;
    this.lang_code = paramString5;
    this.system_version = paramString6;
    this.token_type = paramString7;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof yfa))
      {
        paramObject = (yfa)paramObject;
        if ((oXa.a(this.device_id, ((yfa)paramObject).device_id)) && (oXa.a(this.registration_id, ((yfa)paramObject).registration_id)))
        {
          int i;
          if (this.sandbox == ((yfa)paramObject).sandbox) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.app_version, ((yfa)paramObject).app_version)) && (oXa.a(this.device_model, ((yfa)paramObject).device_model)) && (oXa.a(this.lang_code, ((yfa)paramObject).lang_code)) && (oXa.a(this.system_version, ((yfa)paramObject).system_version)) && (oXa.a(this.token_type, ((yfa)paramObject).token_type))) {
            break label142;
          }
        }
      }
      return false;
    }
    label142:
    return true;
  }
  
  public int hashCode()
  {
    String str = this.device_id;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.registration_id;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    int m = this.sandbox;
    int i1 = m;
    if (m != 0) {
      i1 = 1;
    }
    str = this.app_version;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    str = this.device_model;
    int i2;
    if (str != null) {
      i2 = str.hashCode();
    } else {
      i2 = 0;
    }
    str = this.lang_code;
    int i3;
    if (str != null) {
      i3 = str.hashCode();
    } else {
      i3 = 0;
    }
    str = this.system_version;
    int i4;
    if (str != null) {
      i4 = str.hashCode();
    } else {
      i4 = 0;
    }
    str = this.token_type;
    if (str != null) {
      i = str.hashCode();
    }
    return ((((((j * 31 + k) * 31 + i1) * 31 + n) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RegisterForPushRequest(device_id=");
    localStringBuilder.append(this.device_id);
    localStringBuilder.append(", registration_id=");
    localStringBuilder.append(this.registration_id);
    localStringBuilder.append(", sandbox=");
    localStringBuilder.append(this.sandbox);
    localStringBuilder.append(", app_version=");
    localStringBuilder.append(this.app_version);
    localStringBuilder.append(", device_model=");
    localStringBuilder.append(this.device_model);
    localStringBuilder.append(", lang_code=");
    localStringBuilder.append(this.lang_code);
    localStringBuilder.append(", system_version=");
    localStringBuilder.append(this.system_version);
    localStringBuilder.append(", token_type=");
    localStringBuilder.append(this.token_type);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */