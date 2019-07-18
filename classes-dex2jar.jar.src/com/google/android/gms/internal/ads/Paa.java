package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

public final class paa
  implements taa, uaa
{
  private final Uri a;
  private final eba b;
  private final XY c;
  private final int d;
  private final Handler e;
  private final qaa f;
  private final ZX g;
  private final String h;
  private final int i;
  private uaa j;
  private XX k;
  private boolean l;
  
  public paa(Uri paramUri, eba parameba, XY paramXY, int paramInt1, Handler paramHandler, qaa paramqaa, String paramString, int paramInt2)
  {
    this.a = paramUri;
    this.b = parameba;
    this.c = paramXY;
    this.d = -1;
    this.e = paramHandler;
    this.f = paramqaa;
    this.h = null;
    this.i = paramInt2;
    this.g = new ZX();
  }
  
  public final raa a(int paramInt, bba parambba)
  {
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    }
    tba.a(bool);
    return new gaa(this.a, this.b.a(), this.c.a(), this.d, this.e, this.f, this, parambba, null, this.i);
  }
  
  public final void a()
  {
    this.j = null;
  }
  
  public final void a(AX paramAX, boolean paramBoolean, uaa paramuaa)
  {
    this.j = paramuaa;
    this.k = new Haa(-9223372036854775807L, false);
    paramuaa.a(this.k, null);
  }
  
  public final void a(XX paramXX, Object paramObject)
  {
    paramObject = this.g;
    boolean bool = false;
    if (paramXX.a(0, (ZX)paramObject, false).d != -9223372036854775807L) {
      bool = true;
    }
    if ((this.l) && (!bool)) {
      return;
    }
    this.k = paramXX;
    this.l = bool;
    this.j.a(this.k, null);
  }
  
  public final void a(raa paramraa)
  {
    ((gaa)paramraa).g();
  }
  
  public final void b()
    throws IOException
  {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/paa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */