package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import fq;
import hq;

public final class CredentialPickerConfig
  extends fq
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new d();
  private final int a;
  private final boolean b;
  private final boolean c;
  @Deprecated
  private final boolean d;
  private final int e;
  
  CredentialPickerConfig(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    paramBoolean1 = true;
    int i = 1;
    if (paramInt1 < 2)
    {
      this.d = paramBoolean3;
      paramInt1 = i;
      if (paramBoolean3) {
        paramInt1 = 3;
      }
      this.e = paramInt1;
      return;
    }
    if (paramInt2 != 3) {
      paramBoolean1 = false;
    }
    this.d = paramBoolean1;
    this.e = paramInt2;
  }
  
  private CredentialPickerConfig(a parama)
  {
    this(2, a.a(parama), a.b(parama), false, a.c(parama));
  }
  
  public final boolean A()
  {
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, z());
    hq.a(paramParcel, 2, A());
    hq.a(paramParcel, 3, y());
    hq.a(paramParcel, 4, this.e);
    hq.a(paramParcel, 1000, this.a);
    hq.a(paramParcel, paramInt);
  }
  
  @Deprecated
  public final boolean y()
  {
    return this.e == 3;
  }
  
  public final boolean z()
  {
    return this.b;
  }
  
  public static class a
  {
    private boolean a = false;
    private boolean b = true;
    private int c = 1;
    
    public CredentialPickerConfig a()
    {
      return new CredentialPickerConfig(this, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/CredentialPickerConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */