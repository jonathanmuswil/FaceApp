package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@yh
public final class so
  implements BX, qaa, sba<dba>, Xba
{
  private static int a;
  private static int b;
  private final Context c;
  private final ro d;
  private final UX e;
  private final UX f;
  private final Saa g;
  private final vn h;
  private AX i;
  private ByteBuffer j;
  private boolean k;
  private Ao l;
  private int m;
  private Set<WeakReference<mo>> n = new HashSet();
  
  public so(Context paramContext, vn paramvn)
  {
    this.c = paramContext;
    this.h = paramvn;
    this.d = new ro();
    this.e = new Rba(this.c, OZ.a, 0L, vk.a, this, -1);
    this.f = new yY(OZ.a);
    this.g = new Paa();
    if (mk.a())
    {
      paramvn = String.valueOf(this);
      paramContext = new StringBuilder(String.valueOf(paramvn).length() + 28);
      paramContext.append("ExoPlayerAdapter initialize ");
      paramContext.append(paramvn);
      mk.f(paramContext.toString());
    }
    a += 1;
    paramContext = this.f;
    UX localUX = this.e;
    Saa localSaa = this.g;
    paramvn = this.d;
    this.i = EX.a(new UX[] { paramContext, localUX }, localSaa, paramvn);
    this.i.b(this);
  }
  
  private final taa a(Uri paramUri, String paramString)
  {
    if ((this.k) && (this.j.limit() > 0))
    {
      paramString = new byte[this.j.limit()];
      this.j.get(paramString);
      paramString = new to(paramString);
    }
    else
    {
      if (this.h.i > 0) {
        paramString = new uo(this, paramString);
      } else {
        paramString = new vo(this, paramString);
      }
      if (this.h.j) {
        paramString = new wo(this, paramString);
      }
      Object localObject = paramString;
      if (this.j.limit() > 0)
      {
        localObject = new byte[this.j.limit()];
        this.j.get((byte[])localObject);
        localObject = new xo(paramString, (byte[])localObject);
      }
      paramString = (String)localObject;
    }
    return new paa(paramUri, paramString, yo.a, -1, vk.a, this, null, this.h.g);
  }
  
  public static int d()
  {
    return a;
  }
  
  public static int e()
  {
    return b;
  }
  
  public final void a() {}
  
  final void a(float paramFloat, boolean paramBoolean)
  {
    DX localDX = new DX(this.f, 2, Float.valueOf(paramFloat));
    if (paramBoolean)
    {
      this.i.b(new DX[] { localDX });
      return;
    }
    this.i.a(new DX[] { localDX });
  }
  
  public final void a(int paramInt)
  {
    Iterator localIterator = this.n.iterator();
    while (localIterator.hasNext())
    {
      mo localmo = (mo)((WeakReference)localIterator.next()).get();
      if (localmo != null) {
        localmo.a(paramInt);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    Ao localAo = this.l;
    if (localAo != null) {
      localAo.b(paramInt1, paramInt2);
    }
  }
  
  public final void a(int paramInt, long paramLong) {}
  
  public final void a(Surface paramSurface) {}
  
  final void a(Surface paramSurface, boolean paramBoolean)
  {
    paramSurface = new DX(this.e, 1, paramSurface);
    if (paramBoolean)
    {
      this.i.b(new DX[] { paramSurface });
      return;
    }
    this.i.a(new DX[] { paramSurface });
  }
  
  public final void a(Ao paramAo)
  {
    this.l = paramAo;
  }
  
  public final void a(JY paramJY) {}
  
  public final void a(Kaa paramKaa, Xaa paramXaa) {}
  
  public final void a(NX paramNX) {}
  
  public final void a(TX paramTX) {}
  
  public final void a(XX paramXX, Object paramObject) {}
  
  public final void a(zX paramzX)
  {
    Ao localAo = this.l;
    if (localAo != null) {
      localAo.a("onPlayerError", paramzX);
    }
  }
  
  public final void a(IOException paramIOException)
  {
    Ao localAo = this.l;
    if (localAo != null) {
      localAo.a("onLoadError", paramIOException);
    }
  }
  
  public final void a(String paramString, long paramLong1, long paramLong2) {}
  
  public final void a(boolean paramBoolean) {}
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    Ao localAo = this.l;
    if (localAo != null) {
      localAo.a(paramInt);
    }
  }
  
  public final void a(Uri[] paramArrayOfUri, String paramString)
  {
    a(paramArrayOfUri, paramString, ByteBuffer.allocate(0), false);
  }
  
  public final void a(Uri[] paramArrayOfUri, String paramString, ByteBuffer paramByteBuffer, boolean paramBoolean)
  {
    this.j = paramByteBuffer;
    this.k = paramBoolean;
    int i1 = paramArrayOfUri.length;
    int i2 = 0;
    if (i1 == 1)
    {
      paramArrayOfUri = a(paramArrayOfUri[0], paramString);
    }
    else
    {
      paramByteBuffer = new taa[paramArrayOfUri.length];
      while (i2 < paramArrayOfUri.length)
      {
        paramByteBuffer[i2] = a(paramArrayOfUri[i2], paramString);
        i2++;
      }
      paramArrayOfUri = new waa(paramByteBuffer);
    }
    this.i.a(paramArrayOfUri);
    b += 1;
  }
  
  public final long b()
  {
    return this.m;
  }
  
  public final void b(JY paramJY) {}
  
  final void b(boolean paramBoolean)
  {
    for (int i1 = 0; i1 < this.i.v(); i1++) {
      this.g.a(i1, paramBoolean ^ true);
    }
  }
  
  public final void c()
  {
    AX localAX = this.i;
    if (localAX != null)
    {
      localAX.a(this);
      this.i.a();
      this.i = null;
      b -= 1;
    }
  }
  
  public final AX f()
  {
    return this.i;
  }
  
  public final void finalize()
    throws Throwable
  {
    a -= 1;
    if (mk.a())
    {
      String str = String.valueOf(this);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 26);
      localStringBuilder.append("ExoPlayerAdapter finalize ");
      localStringBuilder.append(str);
      mk.f(localStringBuilder.toString());
    }
  }
  
  public final ro g()
  {
    return this.d;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/so.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */