package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.a;
import com.google.android.gms.auth.api.signin.internal.b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.d.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import fq;
import hq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions
  extends fq
  implements a.d.e, ReflectedParcelable
{
  public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new e();
  public static final Scope a = new Scope("profile");
  public static final Scope b = new Scope("email");
  public static final Scope c = new Scope("openid");
  public static final Scope d = new Scope("https://www.googleapis.com/auth/games_lite");
  public static final Scope e = new Scope("https://www.googleapis.com/auth/games");
  public static final GoogleSignInOptions f;
  public static final GoogleSignInOptions g;
  private static Comparator<Scope> h = new d();
  private final int i;
  private final ArrayList<Scope> j;
  private Account k;
  private boolean l;
  private final boolean m;
  private final boolean n;
  private String o;
  private String p;
  private ArrayList<a> q;
  private Map<Integer, a> r;
  
  static
  {
    a locala = new a();
    locala.b();
    locala.c();
    f = locala.a();
    locala = new a();
    locala.a(d, new Scope[0]);
    g = locala.a();
  }
  
  GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, ArrayList<a> paramArrayList1)
  {
    this(paramInt, paramArrayList, paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2, b(paramArrayList1));
  }
  
  private GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, Map<Integer, a> paramMap)
  {
    this.i = paramInt;
    this.j = paramArrayList;
    this.k = paramAccount;
    this.l = paramBoolean1;
    this.m = paramBoolean2;
    this.n = paramBoolean3;
    this.o = paramString1;
    this.p = paramString2;
    this.q = new ArrayList(paramMap.values());
    this.r = paramMap;
  }
  
  private final JSONObject G()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      Collections.sort(this.j, h);
      ArrayList localArrayList = this.j;
      int i1 = localArrayList.size();
      int i2 = 0;
      while (i2 < i1)
      {
        Object localObject = localArrayList.get(i2);
        i2++;
        localJSONArray.put(((Scope)localObject).y());
      }
      localJSONObject.put("scopes", localJSONArray);
      if (this.k != null) {
        localJSONObject.put("accountName", this.k.name);
      }
      localJSONObject.put("idTokenRequested", this.l);
      localJSONObject.put("forceCodeForRefreshToken", this.n);
      localJSONObject.put("serverAuthRequested", this.m);
      if (!TextUtils.isEmpty(this.o)) {
        localJSONObject.put("serverClientId", this.o);
      }
      if (!TextUtils.isEmpty(this.p)) {
        localJSONObject.put("hostedDomain", this.p);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
  }
  
  public static GoogleSignInOptions b(String paramString)
    throws JSONException
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    HashSet localHashSet = new HashSet();
    paramString = localJSONObject.getJSONArray("scopes");
    int i1 = paramString.length();
    for (int i2 = 0; i2 < i1; i2++) {
      localHashSet.add(new Scope(paramString.getString(i2)));
    }
    paramString = localJSONObject.optString("accountName", null);
    if (!TextUtils.isEmpty(paramString)) {
      paramString = new Account(paramString, "com.google");
    } else {
      paramString = null;
    }
    return new GoogleSignInOptions(3, new ArrayList(localHashSet), paramString, localJSONObject.getBoolean("idTokenRequested"), localJSONObject.getBoolean("serverAuthRequested"), localJSONObject.getBoolean("forceCodeForRefreshToken"), localJSONObject.optString("serverClientId", null), localJSONObject.optString("hostedDomain", null), new HashMap());
  }
  
  private static Map<Integer, a> b(List<a> paramList)
  {
    HashMap localHashMap = new HashMap();
    if (paramList == null) {
      return localHashMap;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      a locala = (a)paramList.next();
      localHashMap.put(Integer.valueOf(locala.y()), locala);
    }
    return localHashMap;
  }
  
  public ArrayList<Scope> A()
  {
    return new ArrayList(this.j);
  }
  
  public String B()
  {
    return this.o;
  }
  
  public boolean C()
  {
    return this.n;
  }
  
  public boolean D()
  {
    return this.l;
  }
  
  public boolean E()
  {
    return this.m;
  }
  
  public final String F()
  {
    return G().toString();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    try
    {
      paramObject = (GoogleSignInOptions)paramObject;
      if ((this.q.size() <= 0) && (((GoogleSignInOptions)paramObject).q.size() <= 0) && (this.j.size() == ((GoogleSignInOptions)paramObject).A().size()) && (this.j.containsAll(((GoogleSignInOptions)paramObject).A())) && (this.k == null ? ((GoogleSignInOptions)paramObject).y() == null : this.k.equals(((GoogleSignInOptions)paramObject).y())) && (TextUtils.isEmpty(this.o) ? TextUtils.isEmpty(((GoogleSignInOptions)paramObject).B()) : this.o.equals(((GoogleSignInOptions)paramObject).B())) && (this.n == ((GoogleSignInOptions)paramObject).C()) && (this.l == ((GoogleSignInOptions)paramObject).D()))
      {
        boolean bool1 = this.m;
        boolean bool2 = ((GoogleSignInOptions)paramObject).E();
        if (bool1 == bool2) {
          return true;
        }
      }
    }
    catch (ClassCastException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  public int hashCode()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.j;
    int i1 = ((ArrayList)localObject1).size();
    int i2 = 0;
    while (i2 < i1)
    {
      Object localObject2 = ((ArrayList)localObject1).get(i2);
      i2++;
      localArrayList.add(((Scope)localObject2).y());
    }
    Collections.sort(localArrayList);
    localObject1 = new b();
    ((b)localObject1).a(localArrayList);
    ((b)localObject1).a(this.k);
    ((b)localObject1).a(this.o);
    ((b)localObject1).a(this.n);
    ((b)localObject1).a(this.l);
    ((b)localObject1).a(this.m);
    return ((b)localObject1).a();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.i);
    hq.c(paramParcel, 2, A(), false);
    hq.a(paramParcel, 3, y(), paramInt, false);
    hq.a(paramParcel, 4, D());
    hq.a(paramParcel, 5, E());
    hq.a(paramParcel, 6, C());
    hq.a(paramParcel, 7, B(), false);
    hq.a(paramParcel, 8, this.p, false);
    hq.c(paramParcel, 9, z(), false);
    hq.a(paramParcel, i1);
  }
  
  public Account y()
  {
    return this.k;
  }
  
  public ArrayList<a> z()
  {
    return this.q;
  }
  
  public static final class a
  {
    private Set<Scope> a = new HashSet();
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private Account f;
    private String g;
    private Map<Integer, a> h = new HashMap();
    
    public a() {}
    
    public a(GoogleSignInOptions paramGoogleSignInOptions)
    {
      t.a(paramGoogleSignInOptions);
      this.a = new HashSet(GoogleSignInOptions.a(paramGoogleSignInOptions));
      this.b = GoogleSignInOptions.b(paramGoogleSignInOptions);
      this.c = GoogleSignInOptions.c(paramGoogleSignInOptions);
      this.d = GoogleSignInOptions.d(paramGoogleSignInOptions);
      this.e = GoogleSignInOptions.e(paramGoogleSignInOptions);
      this.f = GoogleSignInOptions.f(paramGoogleSignInOptions);
      this.g = GoogleSignInOptions.g(paramGoogleSignInOptions);
      this.h = GoogleSignInOptions.a(GoogleSignInOptions.h(paramGoogleSignInOptions));
    }
    
    public final a a(Scope paramScope, Scope... paramVarArgs)
    {
      this.a.add(paramScope);
      this.a.addAll(Arrays.asList(paramVarArgs));
      return this;
    }
    
    public final GoogleSignInOptions a()
    {
      if ((this.a.contains(GoogleSignInOptions.e)) && (this.a.contains(GoogleSignInOptions.d))) {
        this.a.remove(GoogleSignInOptions.d);
      }
      if ((this.d) && ((this.f == null) || (!this.a.isEmpty()))) {
        b();
      }
      return new GoogleSignInOptions(3, new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, null);
    }
    
    public final a b()
    {
      this.a.add(GoogleSignInOptions.c);
      return this;
    }
    
    public final a c()
    {
      this.a.add(GoogleSignInOptions.a);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/GoogleSignInOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */