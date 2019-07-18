package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import fq;
import hq;
import java.util.Collections;
import java.util.List;

public class Credential
  extends fq
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Credential> CREATOR = new b();
  private final String a;
  private final String b;
  private final Uri c;
  private final List<IdToken> d;
  private final String e;
  private final String f;
  private final String g;
  private final String h;
  
  Credential(String paramString1, String paramString2, Uri paramUri, List<IdToken> paramList, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    t.a(paramString1, "credential identifier cannot be null");
    String str = ((String)paramString1).trim();
    t.a(str, "credential identifier cannot be empty");
    if ((paramString3 != null) && (TextUtils.isEmpty(paramString3))) {
      throw new IllegalArgumentException("Password must not be empty if set");
    }
    if (paramString4 != null)
    {
      boolean bool1 = TextUtils.isEmpty(paramString4);
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (!bool1)
      {
        paramString1 = Uri.parse(paramString4);
        bool3 = bool2;
        if (paramString1.isAbsolute())
        {
          bool3 = bool2;
          if (paramString1.isHierarchical())
          {
            bool3 = bool2;
            if (!TextUtils.isEmpty(paramString1.getScheme())) {
              if (TextUtils.isEmpty(paramString1.getAuthority()))
              {
                bool3 = bool2;
              }
              else if (!"http".equalsIgnoreCase(paramString1.getScheme()))
              {
                bool3 = bool2;
                if (!"https".equalsIgnoreCase(paramString1.getScheme())) {}
              }
              else
              {
                bool3 = true;
              }
            }
          }
        }
      }
      if (!Boolean.valueOf(bool3).booleanValue()) {
        throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
      }
    }
    if ((!TextUtils.isEmpty(paramString4)) && (!TextUtils.isEmpty(paramString3))) {
      throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
    }
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (TextUtils.isEmpty(paramString2.trim())) {
        paramString1 = null;
      }
    }
    this.b = paramString1;
    this.c = paramUri;
    if (paramList == null) {
      paramString1 = Collections.emptyList();
    } else {
      paramString1 = Collections.unmodifiableList(paramList);
    }
    this.d = paramString1;
    this.a = str;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramString5;
    this.h = paramString6;
  }
  
  public String A()
  {
    return this.g;
  }
  
  public String B()
  {
    return this.a;
  }
  
  public List<IdToken> C()
  {
    return this.d;
  }
  
  public String D()
  {
    return this.b;
  }
  
  public String E()
  {
    return this.e;
  }
  
  public Uri F()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Credential)) {
      return false;
    }
    paramObject = (Credential)paramObject;
    return (TextUtils.equals(this.a, ((Credential)paramObject).a)) && (TextUtils.equals(this.b, ((Credential)paramObject).b)) && (r.a(this.c, ((Credential)paramObject).c)) && (TextUtils.equals(this.e, ((Credential)paramObject).e)) && (TextUtils.equals(this.f, ((Credential)paramObject).f));
  }
  
  public int hashCode()
  {
    return r.a(new Object[] { this.a, this.b, this.c, this.e, this.f });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = hq.a(paramParcel);
    hq.a(paramParcel, 1, B(), false);
    hq.a(paramParcel, 2, D(), false);
    hq.a(paramParcel, 3, F(), paramInt, false);
    hq.c(paramParcel, 4, C(), false);
    hq.a(paramParcel, 5, E(), false);
    hq.a(paramParcel, 6, y(), false);
    hq.a(paramParcel, 9, A(), false);
    hq.a(paramParcel, 10, z(), false);
    hq.a(paramParcel, i);
  }
  
  public String y()
  {
    return this.f;
  }
  
  public String z()
  {
    return this.h;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/Credential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */