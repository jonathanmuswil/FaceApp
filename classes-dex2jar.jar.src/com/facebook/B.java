package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.internal.S;
import com.facebook.internal.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  private static final Date a = new Date(Long.MAX_VALUE);
  private static final Date b = a;
  private static final Date c = new Date();
  private static final i d = i.b;
  private final Date e;
  private final Set<String> f;
  private final Set<String> g;
  private final String h;
  private final i i;
  private final Date j;
  private final String k;
  private final String l;
  private final Date m;
  
  b(Parcel paramParcel)
  {
    this.e = new Date(paramParcel.readLong());
    ArrayList localArrayList = new ArrayList();
    paramParcel.readStringList(localArrayList);
    this.f = Collections.unmodifiableSet(new HashSet(localArrayList));
    localArrayList.clear();
    paramParcel.readStringList(localArrayList);
    this.g = Collections.unmodifiableSet(new HashSet(localArrayList));
    this.h = paramParcel.readString();
    this.i = i.valueOf(paramParcel.readString());
    this.j = new Date(paramParcel.readLong());
    this.k = paramParcel.readString();
    this.l = paramParcel.readString();
    this.m = new Date(paramParcel.readLong());
  }
  
  public b(String paramString1, String paramString2, String paramString3, Collection<String> paramCollection1, Collection<String> paramCollection2, i parami, Date paramDate1, Date paramDate2, Date paramDate3)
  {
    T.a(paramString1, "accessToken");
    T.a(paramString2, "applicationId");
    T.a(paramString3, "userId");
    if (paramDate1 == null) {
      paramDate1 = b;
    }
    this.e = paramDate1;
    if (paramCollection1 != null) {
      paramCollection1 = new HashSet(paramCollection1);
    } else {
      paramCollection1 = new HashSet();
    }
    this.f = Collections.unmodifiableSet(paramCollection1);
    if (paramCollection2 != null) {
      paramCollection1 = new HashSet(paramCollection2);
    } else {
      paramCollection1 = new HashSet();
    }
    this.g = Collections.unmodifiableSet(paramCollection1);
    this.h = paramString1;
    if (parami == null) {
      parami = d;
    }
    this.i = parami;
    if (paramDate2 == null) {
      paramDate2 = c;
    }
    this.j = paramDate2;
    this.k = paramString2;
    this.l = paramString3;
    if ((paramDate3 == null) || (paramDate3.getTime() == 0L)) {
      paramDate3 = b;
    }
    this.m = paramDate3;
  }
  
  static b a(Bundle paramBundle)
  {
    List localList1 = a(paramBundle, "com.facebook.TokenCachingStrategy.Permissions");
    List localList2 = a(paramBundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
    String str1 = K.a(paramBundle);
    String str2 = str1;
    if (S.b(str1)) {
      str2 = FacebookSdk.e();
    }
    str1 = K.c(paramBundle);
    Object localObject = S.a(str1);
    try
    {
      localObject = ((JSONObject)localObject).getString("id");
      return new b(str1, str2, (String)localObject, localList1, localList2, K.b(paramBundle), K.a(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), K.a(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
    }
    catch (JSONException paramBundle) {}
    return null;
  }
  
  static b a(b paramb)
  {
    return new b(paramb.h, paramb.k, paramb.v(), paramb.s(), paramb.p(), paramb.i, new Date(), new Date(), paramb.m);
  }
  
  static b a(JSONObject paramJSONObject)
    throws JSONException
  {
    if (paramJSONObject.getInt("version") <= 1)
    {
      String str1 = paramJSONObject.getString("token");
      Date localDate1 = new Date(paramJSONObject.getLong("expires_at"));
      JSONArray localJSONArray1 = paramJSONObject.getJSONArray("permissions");
      JSONArray localJSONArray2 = paramJSONObject.getJSONArray("declined_permissions");
      Date localDate2 = new Date(paramJSONObject.getLong("last_refresh"));
      i locali = i.valueOf(paramJSONObject.getString("source"));
      String str2 = paramJSONObject.getString("application_id");
      String str3 = paramJSONObject.getString("user_id");
      paramJSONObject = new Date(paramJSONObject.getLong("data_access_expiration_time"));
      return new b(str1, str2, str3, S.a(localJSONArray1), S.a(localJSONArray2), locali, localDate1, localDate2, paramJSONObject);
    }
    throw new p("Unknown AccessToken serialization format.");
  }
  
  static List<String> a(Bundle paramBundle, String paramString)
  {
    paramBundle = paramBundle.getStringArrayList(paramString);
    if (paramBundle == null) {
      paramBundle = Collections.emptyList();
    } else {
      paramBundle = Collections.unmodifiableList(new ArrayList(paramBundle));
    }
    return paramBundle;
  }
  
  private void a(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(" permissions:");
    if (this.f == null)
    {
      paramStringBuilder.append("null");
    }
    else
    {
      paramStringBuilder.append("[");
      paramStringBuilder.append(TextUtils.join(", ", this.f));
      paramStringBuilder.append("]");
    }
  }
  
  public static void b(b paramb)
  {
    h.d().a(paramb);
  }
  
  static void l()
  {
    b localb = h.d().c();
    if (localb != null) {
      b(a(localb));
    }
  }
  
  public static b n()
  {
    return h.d().c();
  }
  
  public static boolean w()
  {
    b localb = h.d().c();
    boolean bool;
    if ((localb != null) && (!localb.x())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private String z()
  {
    if (this.h == null) {
      return "null";
    }
    if (FacebookSdk.a(L.b)) {
      return this.h;
    }
    return "ACCESS_TOKEN_REMOVED";
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    if ((this.e.equals(((b)paramObject).e)) && (this.f.equals(((b)paramObject).f)) && (this.g.equals(((b)paramObject).g)) && (this.h.equals(((b)paramObject).h)) && (this.i == ((b)paramObject).i) && (this.j.equals(((b)paramObject).j)))
    {
      String str = this.k;
      if ((str == null ? ((b)paramObject).k == null : str.equals(((b)paramObject).k)) && (this.l.equals(((b)paramObject).l)) && (this.m.equals(((b)paramObject).m))) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int n = this.e.hashCode();
    int i1 = this.f.hashCode();
    int i2 = this.g.hashCode();
    int i3 = this.h.hashCode();
    int i4 = this.i.hashCode();
    int i5 = this.j.hashCode();
    String str = this.k;
    int i6;
    if (str == null) {
      i6 = 0;
    } else {
      i6 = str.hashCode();
    }
    return ((((((((527 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + this.l.hashCode()) * 31 + this.m.hashCode();
  }
  
  public String m()
  {
    return this.k;
  }
  
  public Date o()
  {
    return this.m;
  }
  
  public Set<String> p()
  {
    return this.g;
  }
  
  public Date q()
  {
    return this.e;
  }
  
  public Date r()
  {
    return this.j;
  }
  
  public Set<String> s()
  {
    return this.f;
  }
  
  public i t()
  {
    return this.i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{AccessToken");
    localStringBuilder.append(" token:");
    localStringBuilder.append(z());
    a(localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public String u()
  {
    return this.h;
  }
  
  public String v()
  {
    return this.l;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.e.getTime());
    paramParcel.writeStringList(new ArrayList(this.f));
    paramParcel.writeStringList(new ArrayList(this.g));
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i.name());
    paramParcel.writeLong(this.j.getTime());
    paramParcel.writeString(this.k);
    paramParcel.writeString(this.l);
    paramParcel.writeLong(this.m.getTime());
  }
  
  public boolean x()
  {
    return new Date().after(this.e);
  }
  
  JSONObject y()
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("version", 1);
    localJSONObject.put("token", this.h);
    localJSONObject.put("expires_at", this.e.getTime());
    localJSONObject.put("permissions", new JSONArray(this.f));
    localJSONObject.put("declined_permissions", new JSONArray(this.g));
    localJSONObject.put("last_refresh", this.j.getTime());
    localJSONObject.put("source", this.i.name());
    localJSONObject.put("application_id", this.k);
    localJSONObject.put("user_id", this.l);
    localJSONObject.put("data_access_expiration_time", this.m.getTime());
    return localJSONObject;
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
    
    public abstract void a(p paramp);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */