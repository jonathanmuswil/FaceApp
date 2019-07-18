package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.i;
import com.facebook.internal.L;
import com.facebook.internal.S;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class u
  extends K
{
  public static final Parcelable.Creator<u> CREATOR = new t();
  private q c;
  
  u(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  u(z paramz)
  {
    super(paramz);
  }
  
  void a(z.c paramc, Bundle paramBundle)
  {
    String str = paramBundle.getString("com.facebook.platform.extra.USER_ID");
    if ((str != null) && (!str.isEmpty()))
    {
      c(paramc, paramBundle);
    }
    else
    {
      this.b.u();
      S.a(paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new s(this, paramBundle, paramc));
    }
  }
  
  boolean a(z.c paramc)
  {
    this.c = new q(this.b.n(), paramc.l());
    if (!this.c.b()) {
      return false;
    }
    this.b.u();
    paramc = new r(this, paramc);
    this.c.a(paramc);
    return true;
  }
  
  void b(z.c paramc, Bundle paramBundle)
  {
    Object localObject1 = this.c;
    if (localObject1 != null) {
      ((L)localObject1).a(null);
    }
    this.c = null;
    this.b.v();
    if (paramBundle != null)
    {
      localObject1 = paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
      Object localObject2 = paramc.s();
      if ((localObject1 != null) && ((localObject2 == null) || (((ArrayList)localObject1).containsAll((Collection)localObject2))))
      {
        a(paramc, paramBundle);
        return;
      }
      paramBundle = new HashSet();
      Iterator localIterator = ((Set)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        if (!((ArrayList)localObject1).contains(localObject2)) {
          paramBundle.add(localObject2);
        }
      }
      if (!paramBundle.isEmpty()) {
        a("new_permissions", TextUtils.join(",", paramBundle));
      }
      paramc.a(paramBundle);
    }
    this.b.x();
  }
  
  void c(z.c paramc, Bundle paramBundle)
  {
    paramc = K.a(paramBundle, i.d, paramc.l());
    paramc = z.d.a(this.b.t(), paramc);
    this.b.b(paramc);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  void l()
  {
    q localq = this.c;
    if (localq != null)
    {
      localq.a();
      this.c.a(null);
      this.c = null;
    }
  }
  
  String m()
  {
    return "get_token";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/login/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */