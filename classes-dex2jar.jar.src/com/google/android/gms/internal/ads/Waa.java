package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public final class waa
  implements taa
{
  private final taa[] a;
  private final ArrayList<taa> b;
  private final _X c;
  private uaa d;
  private XX e;
  private Object f;
  private int g;
  private yaa h;
  
  public waa(taa... paramVarArgs)
  {
    this.a = paramVarArgs;
    this.b = new ArrayList(Arrays.asList(paramVarArgs));
    this.c = new _X();
    this.g = -1;
  }
  
  private final void a(int paramInt, XX paramXX, Object paramObject)
  {
    if (this.h == null)
    {
      int i = paramXX.b();
      for (int j = 0; j < i; j++) {
        if (paramXX.a(j, this.c, false).e)
        {
          localyaa = new yaa(0);
          break label105;
        }
      }
      if (this.g == -1)
      {
        this.g = paramXX.c();
      }
      else if (paramXX.c() != this.g)
      {
        localyaa = new yaa(1);
        break label105;
      }
      yaa localyaa = null;
      label105:
      this.h = localyaa;
    }
    if (this.h != null) {
      return;
    }
    this.b.remove(this.a[paramInt]);
    if (paramInt == 0)
    {
      this.e = paramXX;
      this.f = paramObject;
    }
    if (this.b.isEmpty()) {
      this.d.a(this.e, this.f);
    }
  }
  
  public final raa a(int paramInt, bba parambba)
  {
    raa[] arrayOfraa = new raa[this.a.length];
    for (int i = 0; i < arrayOfraa.length; i++) {
      arrayOfraa[i] = this.a[i].a(paramInt, parambba);
    }
    return new vaa(arrayOfraa);
  }
  
  public final void a()
  {
    taa[] arrayOftaa = this.a;
    int i = arrayOftaa.length;
    for (int j = 0; j < i; j++) {
      arrayOftaa[j].a();
    }
  }
  
  public final void a(AX paramAX, boolean paramBoolean, uaa paramuaa)
  {
    this.d = paramuaa;
    for (int i = 0;; i++)
    {
      paramuaa = this.a;
      if (i >= paramuaa.length) {
        break;
      }
      paramuaa[i].a(paramAX, false, new xaa(this, i));
    }
  }
  
  public final void a(raa paramraa)
  {
    paramraa = (vaa)paramraa;
    for (int i = 0;; i++)
    {
      taa[] arrayOftaa = this.a;
      if (i >= arrayOftaa.length) {
        break;
      }
      arrayOftaa[i].a(paramraa.a[i]);
    }
  }
  
  public final void b()
    throws IOException
  {
    Object localObject = this.h;
    if (localObject == null)
    {
      localObject = this.a;
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        localObject[j].b();
      }
      return;
    }
    throw ((Throwable)localObject);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/waa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */