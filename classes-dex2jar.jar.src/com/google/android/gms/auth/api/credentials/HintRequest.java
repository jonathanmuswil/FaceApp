package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import fq;
import hq;

public final class HintRequest
  extends fq
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<HintRequest> CREATOR = new f();
  private final int a;
  private final CredentialPickerConfig b;
  private final boolean c;
  private final boolean d;
  private final String[] e;
  private final boolean f;
  private final String g;
  private final String h;
  
  HintRequest(int paramInt, CredentialPickerConfig paramCredentialPickerConfig, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, boolean paramBoolean3, String paramString1, String paramString2)
  {
    this.a = paramInt;
    t.a(paramCredentialPickerConfig);
    this.b = ((CredentialPickerConfig)paramCredentialPickerConfig);
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    t.a(paramArrayOfString);
    this.e = ((String[])paramArrayOfString);
    if (this.a < 2)
    {
      this.f = true;
      this.g = null;
      this.h = null;
      return;
    }
    this.f = paramBoolean3;
    this.g = paramString1;
    this.h = paramString2;
  }
  
  private HintRequest(a parama)
  {
    this(2, a.a(parama), a.b(parama), a.c(parama), a.d(parama), a.e(parama), a.f(parama), a.g(parama));
  }
  
  public final String A()
  {
    return this.h;
  }
  
  public final String B()
  {
    return this.g;
  }
  
  public final boolean C()
  {
    return this.c;
  }
  
  public final boolean D()
  {
    return this.f;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = hq.a(paramParcel);
    hq.a(paramParcel, 1, z(), paramInt, false);
    hq.a(paramParcel, 2, C());
    hq.a(paramParcel, 3, this.d);
    hq.a(paramParcel, 4, y(), false);
    hq.a(paramParcel, 5, D());
    hq.a(paramParcel, 6, B(), false);
    hq.a(paramParcel, 7, A(), false);
    hq.a(paramParcel, 1000, this.a);
    hq.a(paramParcel, i);
  }
  
  public final String[] y()
  {
    return this.e;
  }
  
  public final CredentialPickerConfig z()
  {
    return this.b;
  }
  
  public static final class a
  {
    private boolean a;
    private boolean b;
    private String[] c;
    private CredentialPickerConfig d = new CredentialPickerConfig.a().a();
    private boolean e = false;
    private String f;
    private String g;
    
    public final a a(boolean paramBoolean)
    {
      this.a = paramBoolean;
      return this;
    }
    
    public final HintRequest a()
    {
      if (this.c == null) {
        this.c = new String[0];
      }
      if ((!this.a) && (!this.b) && (this.c.length == 0)) {
        throw new IllegalStateException("At least one authentication method must be specified");
      }
      return new HintRequest(this, null);
    }
    
    public final a b(boolean paramBoolean)
    {
      this.b = paramBoolean;
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/HintRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */