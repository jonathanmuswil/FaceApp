package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.text.TextUtils;
import com.facebook.common.d;
import com.facebook.internal.T;
import com.facebook.internal.l.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class z
  implements Parcelable
{
  public static final Parcelable.Creator<z> CREATOR = new y();
  K[] a;
  int b = -1;
  l c;
  b d;
  a e;
  boolean f;
  c g;
  Map<String, String> h;
  Map<String, String> i;
  private F j;
  
  public z(Parcel paramParcel)
  {
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(K.class.getClassLoader());
    this.a = new K[arrayOfParcelable.length];
    for (int k = 0; k < arrayOfParcelable.length; k++)
    {
      K[] arrayOfK = this.a;
      arrayOfK[k] = ((K)arrayOfParcelable[k]);
      arrayOfK[k].a(this);
    }
    this.b = paramParcel.readInt();
    this.g = ((c)paramParcel.readParcelable(c.class.getClassLoader()));
    this.h = com.facebook.internal.S.a(paramParcel);
    this.i = com.facebook.internal.S.a(paramParcel);
  }
  
  public z(l paraml)
  {
    this.c = paraml;
  }
  
  private void a(String paramString, d paramd, Map<String, String> paramMap)
  {
    a(paramString, paramd.a.a(), paramd.c, paramd.d, paramMap);
  }
  
  private void a(String paramString1, String paramString2, String paramString3, String paramString4, Map<String, String> paramMap)
  {
    if (this.g == null) {
      z().a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", paramString1);
    } else {
      z().a(this.g.m(), paramString1, paramString2, paramString3, paramString4, paramMap);
    }
  }
  
  private void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.h == null) {
      this.h = new HashMap();
    }
    Object localObject = paramString2;
    if (this.h.containsKey(paramString1))
    {
      localObject = paramString2;
      if (paramBoolean)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append((String)this.h.get(paramString1));
        ((StringBuilder)localObject).append(",");
        ((StringBuilder)localObject).append(paramString2);
        localObject = ((StringBuilder)localObject).toString();
      }
    }
    this.h.put(paramString1, localObject);
  }
  
  private void d(d paramd)
  {
    b localb = this.d;
    if (localb != null) {
      localb.a(paramd);
    }
  }
  
  static String p()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("init", System.currentTimeMillis());
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public static int s()
  {
    return l.b.a.a();
  }
  
  private void y()
  {
    a(d.a(this.g, "Login attempt failed.", null));
  }
  
  private F z()
  {
    F localF = this.j;
    if ((localF == null) || (!localF.a().equals(this.g.l()))) {
      this.j = new F(n(), this.g.l());
    }
    return this.j;
  }
  
  int a(String paramString)
  {
    return n().checkCallingOrSelfPermission(paramString);
  }
  
  void a(l paraml)
  {
    if (this.c == null)
    {
      this.c = paraml;
      return;
    }
    throw new com.facebook.p("Can't set fragment once it is already set.");
  }
  
  void a(a parama)
  {
    this.e = parama;
  }
  
  void a(b paramb)
  {
    this.d = paramb;
  }
  
  void a(c paramc)
  {
    if (paramc == null) {
      return;
    }
    if (this.g == null)
    {
      if ((com.facebook.b.w()) && (!m())) {
        return;
      }
      this.g = paramc;
      this.a = b(paramc);
      x();
      return;
    }
    throw new com.facebook.p("Attempted to authorize while a request is pending.");
  }
  
  void a(d paramd)
  {
    Object localObject = o();
    if (localObject != null) {
      a(((K)localObject).m(), paramd, ((K)localObject).a);
    }
    localObject = this.h;
    if (localObject != null) {
      paramd.f = ((Map)localObject);
    }
    localObject = this.i;
    if (localObject != null) {
      paramd.g = ((Map)localObject);
    }
    this.a = null;
    this.b = -1;
    this.g = null;
    this.h = null;
    d(paramd);
  }
  
  public boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.g != null) {
      return o().a(paramInt1, paramInt2, paramIntent);
    }
    return false;
  }
  
  void b(d paramd)
  {
    if ((paramd.b != null) && (com.facebook.b.w())) {
      c(paramd);
    } else {
      a(paramd);
    }
  }
  
  protected K[] b(c paramc)
  {
    ArrayList localArrayList = new ArrayList();
    paramc = paramc.r();
    if (paramc.d()) {
      localArrayList.add(new u(this));
    }
    if (paramc.e()) {
      localArrayList.add(new w(this));
    }
    if (paramc.c()) {
      localArrayList.add(new p(this));
    }
    if (paramc.a()) {
      localArrayList.add(new b(this));
    }
    if (paramc.f()) {
      localArrayList.add(new S(this));
    }
    if (paramc.b()) {
      localArrayList.add(new n(this));
    }
    paramc = new K[localArrayList.size()];
    localArrayList.toArray(paramc);
    return paramc;
  }
  
  void c(c paramc)
  {
    if (!r()) {
      a(paramc);
    }
  }
  
  void c(d paramd)
  {
    if (paramd.b != null)
    {
      com.facebook.b localb1 = com.facebook.b.n();
      com.facebook.b localb2 = paramd.b;
      if ((localb1 != null) && (localb2 != null)) {}
      try
      {
        if (localb1.v().equals(localb2.v())) {
          paramd = d.a(this.g, paramd.b);
        } else {
          paramd = d.a(this.g, "User logged in as different Facebook user.", null);
        }
        a(paramd);
      }
      catch (Exception paramd)
      {
        a(d.a(this.g, "Caught exception", paramd.getMessage()));
      }
      return;
    }
    throw new com.facebook.p("Can't validate without a token");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  void l()
  {
    if (this.b >= 0) {
      o().l();
    }
  }
  
  boolean m()
  {
    if (this.f) {
      return true;
    }
    if (a("android.permission.INTERNET") != 0)
    {
      Object localObject = n();
      String str = ((Activity)localObject).getString(d.com_facebook_internet_permission_error_title);
      localObject = ((Activity)localObject).getString(d.com_facebook_internet_permission_error_message);
      a(d.a(this.g, str, (String)localObject));
      return false;
    }
    this.f = true;
    return true;
  }
  
  o n()
  {
    return this.c.Ea();
  }
  
  K o()
  {
    int k = this.b;
    if (k >= 0) {
      return this.a[k];
    }
    return null;
  }
  
  public l q()
  {
    return this.c;
  }
  
  boolean r()
  {
    boolean bool;
    if ((this.g != null) && (this.b >= 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public c t()
  {
    return this.g;
  }
  
  void u()
  {
    a locala = this.e;
    if (locala != null) {
      locala.a();
    }
  }
  
  void v()
  {
    a locala = this.e;
    if (locala != null) {
      locala.b();
    }
  }
  
  boolean w()
  {
    K localK = o();
    if ((localK.n()) && (!m()))
    {
      a("no_internet_permission", "1", false);
      return false;
    }
    boolean bool = localK.a(this.g);
    if (bool)
    {
      z().b(this.g.m(), localK.m());
    }
    else
    {
      z().a(this.g.m(), localK.m());
      a("not_tried", localK.m(), true);
    }
    return bool;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelableArray(this.a, paramInt);
    paramParcel.writeInt(this.b);
    paramParcel.writeParcelable(this.g, paramInt);
    com.facebook.internal.S.a(paramParcel, this.h);
    com.facebook.internal.S.a(paramParcel, this.i);
  }
  
  void x()
  {
    if (this.b >= 0) {
      a(o().m(), "skipped", null, null, o().a);
    }
    do
    {
      K[] arrayOfK = this.a;
      if (arrayOfK == null) {
        break;
      }
      int k = this.b;
      if (k >= arrayOfK.length - 1) {
        break;
      }
      this.b = (k + 1);
    } while (!w());
    return;
    if (this.g != null) {
      y();
    }
  }
  
  static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
  }
  
  public static abstract interface b
  {
    public abstract void a(z.d paramd);
  }
  
  public static class c
    implements Parcelable
  {
    public static final Parcelable.Creator<c> CREATOR = new A();
    private final x a;
    private Set<String> b;
    private final c c;
    private final String d;
    private final String e;
    private boolean f;
    private String g;
    private String h;
    private String i;
    
    private c(Parcel paramParcel)
    {
      boolean bool = false;
      this.f = false;
      Object localObject1 = paramParcel.readString();
      Object localObject2 = null;
      if (localObject1 != null) {
        localObject1 = x.valueOf((String)localObject1);
      } else {
        localObject1 = null;
      }
      this.a = ((x)localObject1);
      localObject1 = new ArrayList();
      paramParcel.readStringList((List)localObject1);
      this.b = new HashSet((Collection)localObject1);
      String str = paramParcel.readString();
      localObject1 = localObject2;
      if (str != null) {
        localObject1 = c.valueOf(str);
      }
      this.c = ((c)localObject1);
      this.d = paramParcel.readString();
      this.e = paramParcel.readString();
      if (paramParcel.readByte() != 0) {
        bool = true;
      }
      this.f = bool;
      this.g = paramParcel.readString();
      this.h = paramParcel.readString();
      this.i = paramParcel.readString();
    }
    
    c(x paramx, Set<String> paramSet, c paramc, String paramString1, String paramString2, String paramString3)
    {
      this.f = false;
      this.a = paramx;
      if (paramSet == null) {
        paramSet = new HashSet();
      }
      this.b = paramSet;
      this.c = paramc;
      this.h = paramString1;
      this.d = paramString2;
      this.e = paramString3;
    }
    
    void a(Set<String> paramSet)
    {
      T.a(paramSet, "permissions");
      this.b = paramSet;
    }
    
    void a(boolean paramBoolean)
    {
      this.f = paramBoolean;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    String l()
    {
      return this.d;
    }
    
    String m()
    {
      return this.e;
    }
    
    String n()
    {
      return this.h;
    }
    
    c o()
    {
      return this.c;
    }
    
    String p()
    {
      return this.i;
    }
    
    String q()
    {
      return this.g;
    }
    
    x r()
    {
      return this.a;
    }
    
    Set<String> s()
    {
      return this.b;
    }
    
    boolean t()
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext()) {
        if (J.a((String)localIterator.next())) {
          return true;
        }
      }
      return false;
    }
    
    boolean u()
    {
      return this.f;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      Object localObject1 = this.a;
      Object localObject2 = null;
      if (localObject1 != null) {
        localObject1 = ((Enum)localObject1).name();
      } else {
        localObject1 = null;
      }
      paramParcel.writeString((String)localObject1);
      paramParcel.writeStringList(new ArrayList(this.b));
      c localc = this.c;
      localObject1 = localObject2;
      if (localc != null) {
        localObject1 = localc.name();
      }
      paramParcel.writeString((String)localObject1);
      paramParcel.writeString(this.d);
      paramParcel.writeString(this.e);
      paramParcel.writeByte((byte)this.f);
      paramParcel.writeString(this.g);
      paramParcel.writeString(this.h);
      paramParcel.writeString(this.i);
    }
  }
  
  public static class d
    implements Parcelable
  {
    public static final Parcelable.Creator<d> CREATOR = new B();
    final a a;
    final com.facebook.b b;
    final String c;
    final String d;
    final z.c e;
    public Map<String, String> f;
    public Map<String, String> g;
    
    private d(Parcel paramParcel)
    {
      this.a = a.valueOf(paramParcel.readString());
      this.b = ((com.facebook.b)paramParcel.readParcelable(com.facebook.b.class.getClassLoader()));
      this.c = paramParcel.readString();
      this.d = paramParcel.readString();
      this.e = ((z.c)paramParcel.readParcelable(z.c.class.getClassLoader()));
      this.f = com.facebook.internal.S.a(paramParcel);
      this.g = com.facebook.internal.S.a(paramParcel);
    }
    
    d(z.c paramc, a parama, com.facebook.b paramb, String paramString1, String paramString2)
    {
      T.a(parama, "code");
      this.e = paramc;
      this.b = paramb;
      this.c = paramString1;
      this.a = parama;
      this.d = paramString2;
    }
    
    static d a(z.c paramc, com.facebook.b paramb)
    {
      return new d(paramc, a.a, paramb, null, null);
    }
    
    static d a(z.c paramc, String paramString)
    {
      return new d(paramc, a.b, null, paramString, null);
    }
    
    static d a(z.c paramc, String paramString1, String paramString2)
    {
      return a(paramc, paramString1, paramString2, null);
    }
    
    static d a(z.c paramc, String paramString1, String paramString2, String paramString3)
    {
      paramString1 = TextUtils.join(": ", com.facebook.internal.S.a(new String[] { paramString1, paramString2 }));
      return new d(paramc, a.c, null, paramString1, paramString3);
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.a.name());
      paramParcel.writeParcelable(this.b, paramInt);
      paramParcel.writeString(this.c);
      paramParcel.writeString(this.d);
      paramParcel.writeParcelable(this.e, paramInt);
      com.facebook.internal.S.a(paramParcel, this.f);
      com.facebook.internal.S.a(paramParcel, this.g);
    }
    
    static enum a
    {
      private final String e;
      
      private a(String paramString)
      {
        this.e = paramString;
      }
      
      String a()
      {
        return this.e;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/login/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */