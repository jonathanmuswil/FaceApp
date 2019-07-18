package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import fq;
import hq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount
  extends fq
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();
  private static e a = h.d();
  private final int b;
  private String c;
  private String d;
  private String e;
  private String f;
  private Uri g;
  private String h;
  private long i;
  private String j;
  private List<Scope> k;
  private String l;
  private String m;
  private Set<Scope> n = new HashSet();
  
  GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List<Scope> paramList, String paramString7, String paramString8)
  {
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramUri;
    this.h = paramString5;
    this.i = paramLong;
    this.j = paramString6;
    this.k = paramList;
    this.l = paramString7;
    this.m = paramString8;
  }
  
  private final JSONObject K()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (D() != null) {
        localJSONObject.put("id", D());
      }
      if (E() != null) {
        localJSONObject.put("tokenId", E());
      }
      if (A() != null) {
        localJSONObject.put("email", A());
      }
      if (z() != null) {
        localJSONObject.put("displayName", z());
      }
      if (C() != null) {
        localJSONObject.put("givenName", C());
      }
      if (B() != null) {
        localJSONObject.put("familyName", B());
      }
      if (F() != null) {
        localJSONObject.put("photoUrl", F().toString());
      }
      if (H() != null) {
        localJSONObject.put("serverAuthCode", H());
      }
      localJSONObject.put("expirationTime", this.i);
      localJSONObject.put("obfuscatedIdentifier", this.j);
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      Scope[] arrayOfScope = (Scope[])this.k.toArray(new Scope[this.k.size()]);
      Arrays.sort(arrayOfScope, b.a);
      int i1 = arrayOfScope.length;
      for (int i2 = 0; i2 < i1; i2++) {
        localJSONArray.put(arrayOfScope[i2].y());
      }
      localJSONObject.put("grantedScopes", localJSONArray);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
  }
  
  private static GoogleSignInAccount a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Uri paramUri, Long paramLong, String paramString7, Set<Scope> paramSet)
  {
    if (paramLong == null) {
      paramLong = Long.valueOf(a.a() / 1000L);
    }
    long l1 = paramLong.longValue();
    t.b(paramString7);
    t.a(paramSet);
    return new GoogleSignInAccount(3, paramString1, paramString2, paramString3, paramString4, paramUri, null, l1, paramString7, new ArrayList((Collection)paramSet), paramString5, paramString6);
  }
  
  public static GoogleSignInAccount b(String paramString)
    throws JSONException
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    paramString = localJSONObject.optString("photoUrl", null);
    if (!TextUtils.isEmpty(paramString)) {
      paramString = Uri.parse(paramString);
    } else {
      paramString = null;
    }
    long l1 = Long.parseLong(localJSONObject.getString("expirationTime"));
    HashSet localHashSet = new HashSet();
    JSONArray localJSONArray = localJSONObject.getJSONArray("grantedScopes");
    int i1 = localJSONArray.length();
    for (int i2 = 0; i2 < i1; i2++) {
      localHashSet.add(new Scope(localJSONArray.getString(i2)));
    }
    paramString = a(localJSONObject.optString("id"), localJSONObject.optString("tokenId", null), localJSONObject.optString("email", null), localJSONObject.optString("displayName", null), localJSONObject.optString("givenName", null), localJSONObject.optString("familyName", null), paramString, Long.valueOf(l1), localJSONObject.getString("obfuscatedIdentifier"), localHashSet);
    paramString.h = localJSONObject.optString("serverAuthCode", null);
    return paramString;
  }
  
  public String A()
  {
    return this.e;
  }
  
  public String B()
  {
    return this.m;
  }
  
  public String C()
  {
    return this.l;
  }
  
  public String D()
  {
    return this.c;
  }
  
  public String E()
  {
    return this.d;
  }
  
  public Uri F()
  {
    return this.g;
  }
  
  public Set<Scope> G()
  {
    HashSet localHashSet = new HashSet(this.k);
    localHashSet.addAll(this.n);
    return localHashSet;
  }
  
  public String H()
  {
    return this.h;
  }
  
  public final String I()
  {
    return this.j;
  }
  
  public final String J()
  {
    JSONObject localJSONObject = K();
    localJSONObject.remove("serverAuthCode");
    return localJSONObject.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof GoogleSignInAccount)) {
      return false;
    }
    paramObject = (GoogleSignInAccount)paramObject;
    return (((GoogleSignInAccount)paramObject).j.equals(this.j)) && (((GoogleSignInAccount)paramObject).G().equals(G()));
  }
  
  public int hashCode()
  {
    return (this.j.hashCode() + 527) * 31 + G().hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.b);
    hq.a(paramParcel, 2, D(), false);
    hq.a(paramParcel, 3, E(), false);
    hq.a(paramParcel, 4, A(), false);
    hq.a(paramParcel, 5, z(), false);
    hq.a(paramParcel, 6, F(), paramInt, false);
    hq.a(paramParcel, 7, H(), false);
    hq.a(paramParcel, 8, this.i);
    hq.a(paramParcel, 9, this.j, false);
    hq.c(paramParcel, 10, this.k, false);
    hq.a(paramParcel, 11, C(), false);
    hq.a(paramParcel, 12, B(), false);
    hq.a(paramParcel, i1);
  }
  
  public Account y()
  {
    String str = this.e;
    if (str == null) {
      return null;
    }
    return new Account(str, "com.google");
  }
  
  public String z()
  {
    return this.f;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/GoogleSignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */