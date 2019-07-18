package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

final class gaa
  implements WY, raa, Daa, oba<maa>
{
  private boolean[] A;
  private boolean B;
  private long C;
  private long D;
  private long E;
  private int F;
  private boolean G;
  private boolean H;
  private final Uri a;
  private final dba b;
  private final int c;
  private final Handler d;
  private final qaa e;
  private final uaa f;
  private final bba g;
  private final String h;
  private final long i;
  private final nba j;
  private final naa k;
  private final vba l;
  private final Runnable m;
  private final Runnable n;
  private final Handler o;
  private final SparseArray<Baa> p;
  private saa q;
  private aZ r;
  private boolean s;
  private boolean t;
  private boolean u;
  private boolean v;
  private int w;
  private Kaa x;
  private long y;
  private boolean[] z;
  
  public gaa(Uri paramUri, dba paramdba, UY[] paramArrayOfUY, int paramInt1, Handler paramHandler, qaa paramqaa, uaa paramuaa, bba parambba, String paramString, int paramInt2)
  {
    this.a = paramUri;
    this.b = paramdba;
    this.c = paramInt1;
    this.d = paramHandler;
    this.e = paramqaa;
    this.f = paramuaa;
    this.g = parambba;
    this.h = paramString;
    this.i = paramInt2;
    this.j = new nba("Loader:ExtractorMediaPeriod");
    this.k = new naa(paramArrayOfUY, this);
    this.l = new vba();
    this.m = new iaa(this);
    this.n = new jaa(this);
    this.o = new Handler();
    this.E = -9223372036854775807L;
    this.p = new SparseArray();
    this.C = -1L;
  }
  
  private final void a(maa parammaa)
  {
    if (this.C == -1L) {
      this.C = maa.a(parammaa);
    }
  }
  
  private final void i()
  {
    maa localmaa = new maa(this, this.a, this.b, this.k, this.l);
    if (this.t)
    {
      tba.b(j());
      long l1 = this.y;
      if ((l1 != -9223372036854775807L) && (this.E >= l1))
      {
        this.G = true;
        this.E = -9223372036854775807L;
        return;
      }
      localmaa.a(this.r.a(this.E), this.E);
      this.E = -9223372036854775807L;
    }
    this.F = l();
    int i1 = this.c;
    int i2 = i1;
    if (i1 == -1)
    {
      if ((this.t) && (this.C == -1L))
      {
        aZ localaZ = this.r;
        if ((localaZ == null) || (localaZ.c() == -9223372036854775807L))
        {
          i2 = 6;
          break label182;
        }
      }
      i2 = 3;
    }
    label182:
    this.j.a(localmaa, this, i2);
  }
  
  private final boolean j()
  {
    return this.E != -9223372036854775807L;
  }
  
  private final void k()
  {
    if ((!this.H) && (!this.t) && (this.r != null) && (this.s))
    {
      int i1 = this.p.size();
      for (int i2 = 0; i2 < i1; i2++) {
        if (((Baa)this.p.valueAt(i2)).e() == null) {
          return;
        }
      }
      this.l.c();
      Jaa[] arrayOfJaa = new Jaa[i1];
      this.A = new boolean[i1];
      this.z = new boolean[i1];
      this.y = this.r.c();
      for (i2 = 0;; i2++)
      {
        int i3 = 1;
        if (i2 >= i1) {
          break;
        }
        Object localObject = ((Baa)this.p.valueAt(i2)).e();
        arrayOfJaa[i2] = new Jaa(new NX[] { localObject });
        localObject = ((NX)localObject).f;
        int i4 = i3;
        if (!yba.b((String)localObject)) {
          if (yba.a((String)localObject)) {
            i4 = i3;
          } else {
            i4 = 0;
          }
        }
        this.A[i2] = i4;
        this.B = (i4 | this.B);
      }
      this.x = new Kaa(arrayOfJaa);
      this.t = true;
      this.f.a(new Haa(this.y, this.r.b()), null);
      this.q.a(this);
    }
  }
  
  private final int l()
  {
    int i1 = this.p.size();
    int i2 = 0;
    int i3 = 0;
    while (i2 < i1)
    {
      i3 += ((Baa)this.p.valueAt(i2)).c();
      i2++;
    }
    return i3;
  }
  
  private final long m()
  {
    int i1 = this.p.size();
    long l1 = Long.MIN_VALUE;
    for (int i2 = 0; i2 < i1; i2++) {
      l1 = Math.max(l1, ((Baa)this.p.valueAt(i2)).b());
    }
    return l1;
  }
  
  final int a(int paramInt, PX paramPX, KY paramKY, boolean paramBoolean)
  {
    if ((!this.v) && (!j())) {
      return ((Baa)this.p.valueAt(paramInt)).a(paramPX, paramKY, paramBoolean, this.G, this.D);
    }
    return -3;
  }
  
  public final long a()
  {
    if (this.w == 0) {
      return Long.MIN_VALUE;
    }
    return b();
  }
  
  public final long a(long paramLong)
  {
    if (!this.r.b()) {
      paramLong = 0L;
    }
    this.D = paramLong;
    int i1 = this.p.size();
    boolean bool = j() ^ true;
    for (int i2 = 0; (bool) && (i2 < i1); i2++) {
      if (this.z[i2] != 0) {
        bool = ((Baa)this.p.valueAt(i2)).a(paramLong, false);
      }
    }
    if (!bool)
    {
      this.E = paramLong;
      this.G = false;
      if (this.j.a()) {
        this.j.b();
      } else {
        for (i2 = 0; i2 < i1; i2++) {
          ((Baa)this.p.valueAt(i2)).a(this.z[i2]);
        }
      }
    }
    this.v = false;
    return paramLong;
  }
  
  public final long a(Vaa[] paramArrayOfVaa, boolean[] paramArrayOfBoolean1, Eaa[] paramArrayOfEaa, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    tba.b(this.t);
    int i1 = 0;
    for (int i2 = 0; i2 < paramArrayOfVaa.length; i2++) {
      if ((paramArrayOfEaa[i2] != null) && ((paramArrayOfVaa[i2] == null) || (paramArrayOfBoolean1[i2] == 0)))
      {
        i3 = oaa.a((oaa)paramArrayOfEaa[i2]);
        tba.b(this.z[i3]);
        this.w -= 1;
        this.z[i3] = false;
        ((Baa)this.p.valueAt(i3)).a();
        paramArrayOfEaa[i2] = null;
      }
    }
    int i3 = 0;
    int i4;
    for (i2 = 0; i3 < paramArrayOfVaa.length; i2 = i4)
    {
      i4 = i2;
      if (paramArrayOfEaa[i3] == null)
      {
        i4 = i2;
        if (paramArrayOfVaa[i3] != null)
        {
          paramArrayOfBoolean1 = paramArrayOfVaa[i3];
          boolean bool;
          if (paramArrayOfBoolean1.length() == 1) {
            bool = true;
          } else {
            bool = false;
          }
          tba.b(bool);
          if (paramArrayOfBoolean1.b(0) == 0) {
            bool = true;
          } else {
            bool = false;
          }
          tba.b(bool);
          i2 = this.x.a(paramArrayOfBoolean1.a());
          tba.b(this.z[i2] ^ 0x1);
          this.w += 1;
          this.z[i2] = true;
          paramArrayOfEaa[i3] = new oaa(this, i2);
          paramArrayOfBoolean2[i3] = true;
          i4 = 1;
        }
      }
      i3++;
    }
    if (!this.u)
    {
      i4 = this.p.size();
      for (i3 = 0; i3 < i4; i3++) {
        if (this.z[i3] == 0) {
          ((Baa)this.p.valueAt(i3)).a();
        }
      }
    }
    long l1;
    if (this.w == 0)
    {
      this.v = false;
      l1 = paramLong;
      if (this.j.a())
      {
        this.j.b();
        l1 = paramLong;
      }
    }
    else
    {
      if (this.u)
      {
        l1 = paramLong;
        if (i2 == 0) {
          break label442;
        }
      }
      else
      {
        l1 = paramLong;
        if (paramLong == 0L) {
          break label442;
        }
      }
      paramLong = a(paramLong);
      for (i2 = i1;; i2++)
      {
        l1 = paramLong;
        if (i2 >= paramArrayOfEaa.length) {
          break;
        }
        if (paramArrayOfEaa[i2] != null) {
          paramArrayOfBoolean2[i2] = true;
        }
      }
    }
    label442:
    this.u = true;
    return l1;
  }
  
  final void a(int paramInt, long paramLong)
  {
    Baa localBaa = (Baa)this.p.valueAt(paramInt);
    if ((this.G) && (paramLong > localBaa.b()))
    {
      localBaa.f();
      return;
    }
    localBaa.a(paramLong, true);
  }
  
  public final void a(NX paramNX)
  {
    this.o.post(this.m);
  }
  
  public final void a(aZ paramaZ)
  {
    this.r = paramaZ;
    this.o.post(this.m);
  }
  
  public final void a(saa paramsaa, long paramLong)
  {
    this.q = paramsaa;
    this.l.b();
    i();
  }
  
  final boolean a(int paramInt)
  {
    return (this.G) || ((!j()) && (((Baa)this.p.valueAt(paramInt)).d()));
  }
  
  public final long b()
  {
    if (this.G) {
      return Long.MIN_VALUE;
    }
    if (j()) {
      return this.E;
    }
    if (this.B)
    {
      long l1 = Long.MAX_VALUE;
      int i1 = this.p.size();
      int i2 = 0;
      for (;;)
      {
        l2 = l1;
        if (i2 >= i1) {
          break;
        }
        l2 = l1;
        if (this.A[i2] != 0) {
          l2 = Math.min(l1, ((Baa)this.p.valueAt(i2)).b());
        }
        i2++;
        l1 = l2;
      }
    }
    long l2 = m();
    if (l2 == Long.MIN_VALUE) {
      return this.D;
    }
    return l2;
  }
  
  public final cZ b(int paramInt1, int paramInt2)
  {
    Baa localBaa1 = (Baa)this.p.get(paramInt1);
    Baa localBaa2 = localBaa1;
    if (localBaa1 == null)
    {
      localBaa2 = new Baa(this.g);
      localBaa2.a(this);
      this.p.put(paramInt1, localBaa2);
    }
    return localBaa2;
  }
  
  public final boolean b(long paramLong)
  {
    if ((!this.G) && ((!this.t) || (this.w != 0)))
    {
      boolean bool = this.l.b();
      if (!this.j.a())
      {
        i();
        bool = true;
      }
      return bool;
    }
    return false;
  }
  
  public final long c()
  {
    if (this.v)
    {
      this.v = false;
      return this.D;
    }
    return -9223372036854775807L;
  }
  
  public final void c(long paramLong) {}
  
  public final void d()
  {
    this.s = true;
    this.o.post(this.m);
  }
  
  public final void e()
    throws IOException
  {
    this.j.a(Integer.MIN_VALUE);
  }
  
  public final Kaa f()
  {
    return this.x;
  }
  
  public final void g()
  {
    naa localnaa = this.k;
    this.j.a(new kaa(this, localnaa));
    this.o.removeCallbacksAndMessages(null);
    this.H = true;
  }
  
  final void h()
    throws IOException
  {
    this.j.a(Integer.MIN_VALUE);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */