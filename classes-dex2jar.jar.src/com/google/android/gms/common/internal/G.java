package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.d;
import com.google.android.gms.common.f;
import fq;
import hq;

public class g
  extends fq
{
  public static final Parcelable.Creator<g> CREATOR = new J();
  private final int a;
  private final int b;
  private int c;
  String d;
  IBinder e;
  Scope[] f;
  Bundle g;
  Account h;
  d[] i;
  d[] j;
  private boolean k;
  
  public g(int paramInt)
  {
    this.a = 4;
    this.c = f.a;
    this.b = paramInt;
    this.k = true;
  }
  
  g(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, d[] paramArrayOfd1, d[] paramArrayOfd2, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    if ("com.google.android.gms".equals(paramString)) {
      this.d = "com.google.android.gms";
    } else {
      this.d = paramString;
    }
    if (paramInt1 < 2)
    {
      paramString = null;
      if (paramIBinder != null) {
        paramString = a.a(m.a.a(paramIBinder));
      }
      this.h = paramString;
    }
    else
    {
      this.e = paramIBinder;
      this.h = paramAccount;
    }
    this.f = paramArrayOfScope;
    this.g = paramBundle;
    this.i = paramArrayOfd1;
    this.j = paramArrayOfd2;
    this.k = paramBoolean;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a);
    hq.a(paramParcel, 2, this.b);
    hq.a(paramParcel, 3, this.c);
    hq.a(paramParcel, 4, this.d, false);
    hq.a(paramParcel, 5, this.e, false);
    hq.a(paramParcel, 6, this.f, paramInt, false);
    hq.a(paramParcel, 7, this.g, false);
    hq.a(paramParcel, 8, this.h, paramInt, false);
    hq.a(paramParcel, 10, this.i, paramInt, false);
    hq.a(paramParcel, 11, this.j, paramInt, false);
    hq.a(paramParcel, 12, this.k);
    hq.a(paramParcel, m);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */