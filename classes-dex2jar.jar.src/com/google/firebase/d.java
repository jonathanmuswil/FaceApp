package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.r.a;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.util.q;

public final class d
{
  private final String a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  
  private d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    t.b(q.a(paramString1) ^ true, "ApplicationId must be set.");
    this.b = paramString1;
    this.a = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
    this.f = paramString6;
    this.g = paramString7;
  }
  
  public static d a(Context paramContext)
  {
    paramContext = new x(paramContext);
    String str = paramContext.a("google_app_id");
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    return new d(str, paramContext.a("google_api_key"), paramContext.a("firebase_database_url"), paramContext.a("ga_trackingId"), paramContext.a("gcm_defaultSenderId"), paramContext.a("google_storage_bucket"), paramContext.a("project_id"));
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof d;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (d)paramObject;
    bool1 = bool2;
    if (r.a(this.b, ((d)paramObject).b))
    {
      bool1 = bool2;
      if (r.a(this.a, ((d)paramObject).a))
      {
        bool1 = bool2;
        if (r.a(this.c, ((d)paramObject).c))
        {
          bool1 = bool2;
          if (r.a(this.d, ((d)paramObject).d))
          {
            bool1 = bool2;
            if (r.a(this.e, ((d)paramObject).e))
            {
              bool1 = bool2;
              if (r.a(this.f, ((d)paramObject).f))
              {
                bool1 = bool2;
                if (r.a(this.g, ((d)paramObject).g)) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return r.a(new Object[] { this.b, this.a, this.c, this.d, this.e, this.f, this.g });
  }
  
  public String toString()
  {
    r.a locala = r.a(this);
    locala.a("applicationId", this.b);
    locala.a("apiKey", this.a);
    locala.a("databaseUrl", this.c);
    locala.a("gcmSenderId", this.e);
    locala.a("storageBucket", this.f);
    locala.a("projectId", this.g);
    return locala.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */