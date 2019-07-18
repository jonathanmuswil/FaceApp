package com.google.android.gms.internal.ads;

import java.util.List;

public final class vt
  extends pR<vt, a>
  implements _R
{
  private static volatile hS<vt> zzdv;
  private static final vt zzhj = new vt();
  private int zzdj;
  private String zzdt = "";
  private String zzej = "";
  private String zzel = "";
  private String zzem = "D";
  private String zzen = "D";
  private int zzeq;
  private int zzer;
  private String zzes = "";
  private long zzet;
  private long zzeu;
  private long zzev;
  private long zzew;
  private long zzex;
  private long zzey;
  private long zzez;
  private long zzfa;
  private long zzfb;
  private long zzfc;
  private String zzfd = "";
  private long zzfe;
  private long zzff;
  private long zzfg;
  private long zzfh;
  private long zzfi;
  private long zzfj;
  private long zzfk;
  private long zzfl;
  private long zzfm;
  private String zzfn = "";
  private long zzfo;
  private long zzfp;
  private long zzfq;
  private long zzfr;
  private long zzfs = -1L;
  private long zzft = -1L;
  private wt zzfu;
  private long zzfv = -1L;
  private long zzfw = -1L;
  private long zzfx = -1L;
  private long zzfy = -1L;
  private long zzfz = -1L;
  private long zzga = -1L;
  private int zzgb = 1000;
  private int zzgc = 1000;
  private long zzgd = -1L;
  private long zzge = -1L;
  private long zzgf = -1L;
  private long zzgg = -1L;
  private long zzgh = -1L;
  private int zzgi = 1000;
  private e zzgj;
  private xR<e> zzgk = pR.i();
  private f zzgl;
  private long zzgm = -1L;
  private long zzgn = -1L;
  private long zzgo = -1L;
  private long zzgp = -1L;
  private long zzgq = -1L;
  private long zzgr = -1L;
  private long zzgs = -1L;
  private long zzgt = -1L;
  private String zzgu = "D";
  private long zzgv = -1L;
  private int zzgw;
  private int zzgx;
  private int zzgy;
  private zt zzgz;
  private long zzha = -1L;
  private int zzhb = 1000;
  private long zzhc;
  private String zzhd = "";
  private int zzhe = 2;
  private boolean zzhf;
  private String zzhg = "";
  private long zzhh;
  private yt zzhi;
  
  static
  {
    pR.a(vt.class, zzhj);
  }
  
  private final void A(long paramLong)
  {
    this.zzdj |= 0x10000000;
    this.zzfr = paramLong;
  }
  
  private final void B(long paramLong)
  {
    this.zzdj |= 0x20000000;
    this.zzfs = paramLong;
  }
  
  private final void C(long paramLong)
  {
    this.zzdj |= 0x40000000;
    this.zzft = paramLong;
  }
  
  private final void D(long paramLong)
  {
    this.zzeq |= 0x1;
    this.zzfv = paramLong;
  }
  
  private final void E(long paramLong)
  {
    this.zzeq |= 0x2;
    this.zzfw = paramLong;
  }
  
  private final void F(long paramLong)
  {
    this.zzeq |= 0x4;
    this.zzfx = paramLong;
  }
  
  private final void G(long paramLong)
  {
    this.zzeq |= 0x8;
    this.zzfy = paramLong;
  }
  
  public static vt a(byte[] paramArrayOfByte, bR parambR)
    throws yR
  {
    return (vt)pR.a(zzhj, paramArrayOfByte, parambR);
  }
  
  private final void a(long paramLong)
  {
    this.zzeq |= 0x10;
    this.zzfz = paramLong;
  }
  
  private final void a(Fy paramFy)
  {
    if (paramFy != null)
    {
      this.zzeq |= 0x100;
      this.zzgb = paramFy.n();
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(c paramc)
  {
    if (paramc != null)
    {
      this.zzer |= 0x10;
      this.zzhe = paramc.n();
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(e parame)
  {
    if (parame != null)
    {
      this.zzgj = parame;
      this.zzeq |= 0x10000;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(f paramf)
  {
    if (paramf != null)
    {
      this.zzgl = paramf;
      this.zzeq |= 0x20000;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(zt paramzt)
  {
    if (paramzt != null)
    {
      this.zzgz = paramzt;
      this.zzeq |= 0x80000000;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(String paramString)
  {
    if (paramString != null)
    {
      this.zzdj |= 0x1;
      this.zzes = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void a(boolean paramBoolean)
  {
    this.zzer |= 0x20;
    this.zzhf = paramBoolean;
  }
  
  private final void b(long paramLong)
  {
    this.zzeq |= 0x20;
    this.zzga = paramLong;
  }
  
  private final void b(Fy paramFy)
  {
    if (paramFy != null)
    {
      this.zzeq |= 0x200;
      this.zzgc = paramFy.n();
      return;
    }
    throw new NullPointerException();
  }
  
  private final void b(e parame)
  {
    if (parame != null)
    {
      if (!this.zzgk.h())
      {
        xR localxR = this.zzgk;
        int i = localxR.size();
        if (i == 0) {
          i = 10;
        } else {
          i <<= 1;
        }
        this.zzgk = localxR.e(i);
      }
      this.zzgk.add(parame);
      return;
    }
    throw new NullPointerException();
  }
  
  private final void b(String paramString)
  {
    if (paramString != null)
    {
      this.zzdj |= 0x2;
      this.zzdt = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void c(long paramLong)
  {
    this.zzeq |= 0x400;
    this.zzgd = paramLong;
  }
  
  private final void c(Fy paramFy)
  {
    if (paramFy != null)
    {
      this.zzeq |= 0x8000;
      this.zzgi = paramFy.n();
      return;
    }
    throw new NullPointerException();
  }
  
  private final void c(String paramString)
  {
    if (paramString != null)
    {
      this.zzdj |= 0x400000;
      this.zzej = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void d(long paramLong)
  {
    this.zzeq |= 0x800;
    this.zzge = paramLong;
  }
  
  private final void d(Fy paramFy)
  {
    if (paramFy != null)
    {
      this.zzer |= 0x2;
      this.zzhb = paramFy.n();
      return;
    }
    throw new NullPointerException();
  }
  
  private final void d(String paramString)
  {
    if (paramString != null)
    {
      this.zzdj |= 0x800000;
      this.zzfn = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void e(long paramLong)
  {
    this.zzeq |= 0x1000;
    this.zzgf = paramLong;
  }
  
  private final void e(String paramString)
  {
    if (paramString != null)
    {
      this.zzdj |= 0x8000000;
      this.zzel = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void f(long paramLong)
  {
    this.zzeq |= 0x80000;
    this.zzgn = paramLong;
  }
  
  private final void f(String paramString)
  {
    if (paramString != null)
    {
      this.zzeq |= 0x40;
      this.zzem = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void g(long paramLong)
  {
    this.zzeq |= 0x100000;
    this.zzgo = paramLong;
  }
  
  private final void g(String paramString)
  {
    if (paramString != null)
    {
      this.zzeq |= 0x80;
      this.zzen = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void h(long paramLong)
  {
    this.zzeq |= 0x200000;
    this.zzgp = paramLong;
  }
  
  private final void h(String paramString)
  {
    if (paramString != null)
    {
      this.zzeq |= 0x4000000;
      this.zzgu = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void i(long paramLong)
  {
    this.zzeq |= 0x1000000;
    this.zzgs = paramLong;
  }
  
  private final void i(String paramString)
  {
    if (paramString != null)
    {
      this.zzer |= 0x8;
      this.zzhd = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  private final void j(long paramLong)
  {
    this.zzeq |= 0x2000000;
    this.zzgt = paramLong;
  }
  
  private final void k(long paramLong)
  {
    this.zzer |= 0x80;
    this.zzhh = paramLong;
  }
  
  private final void l(long paramLong)
  {
    this.zzdj |= 0x4;
    this.zzet = paramLong;
  }
  
  private final void m(long paramLong)
  {
    this.zzdj |= 0x10;
    this.zzev = paramLong;
  }
  
  public static a n()
  {
    return (a)zzhj.a(pR.e.e, null, null);
  }
  
  private final void n(long paramLong)
  {
    this.zzdj |= 0x20;
    this.zzew = paramLong;
  }
  
  private final void o(long paramLong)
  {
    this.zzdj |= 0x400;
    this.zzfb = paramLong;
  }
  
  private final void p()
  {
    this.zzgk = pR.i();
  }
  
  private final void p(long paramLong)
  {
    this.zzdj |= 0x800;
    this.zzfc = paramLong;
  }
  
  private final void q(long paramLong)
  {
    this.zzdj |= 0x2000;
    this.zzfe = paramLong;
  }
  
  private final void r(long paramLong)
  {
    this.zzdj |= 0x4000;
    this.zzff = paramLong;
  }
  
  private final void s(long paramLong)
  {
    this.zzdj |= 0x8000;
    this.zzfg = paramLong;
  }
  
  private final void t(long paramLong)
  {
    this.zzdj |= 0x10000;
    this.zzfh = paramLong;
  }
  
  private final void u(long paramLong)
  {
    this.zzdj |= 0x80000;
    this.zzfk = paramLong;
  }
  
  private final void v(long paramLong)
  {
    this.zzdj |= 0x100000;
    this.zzfl = paramLong;
  }
  
  private final void w(long paramLong)
  {
    this.zzdj |= 0x200000;
    this.zzfm = paramLong;
  }
  
  private final void x(long paramLong)
  {
    this.zzdj |= 0x1000000;
    this.zzfo = paramLong;
  }
  
  private final void y(long paramLong)
  {
    this.zzdj |= 0x2000000;
    this.zzfp = paramLong;
  }
  
  private final void z(long paramLong)
  {
    this.zzdj |= 0x4000000;
    this.zzfq = paramLong;
  }
  
  protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (au.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zzdv;
      paramObject1 = paramObject2;
      if (paramObject2 == null) {
        try
        {
          paramObject2 = zzdv;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new com/google/android/gms/internal/ads/pR$b;
            ((pR.b)paramObject1).<init>(zzhj);
            zzdv = (hS)paramObject1;
          }
        }
        finally {}
      }
      return paramObject1;
    case 4: 
      return zzhj;
    case 3: 
      uR localuR1 = c.a();
      uR localuR2 = Fy.a();
      uR localuR3 = Fy.a();
      uR localuR4 = Fy.a();
      paramObject1 = dx.a();
      uR localuR5 = hA.a();
      paramObject2 = b.a();
      uR localuR6 = Fy.a();
      return pR.a(zzhj, "\001J\000\003\001ÉJ\000\001\000\001\b\000\002\b\001\003\002\002\004\002\003\005\002\004\006\002\005\007\002\006\b\002\007\t\002\b\n\002\t\013\002\n\f\002\013\r\b\f\016\002\r\017\002\016\020\002\017\021\002\020\022\002\021\023\002\022\024\002\023\025\002B\026\002\024\027\002\025\030\bC\031\002G\032\fD\033\b\026\034\007E\035\b\027\036\bF\037\002\030 \002\031!\002\032\"\b\033#\002\034$\002\035%\002\036&\t\037'\002 (\002!)\002\"*\002#+\033,\002$-\002%.\b&/\b'0\f(1\f)2\t03\002*4\002+5\002,6\002-7\002.8\f/9\t1:\0022;\0023<\0024=\0025>\0028?\0029@\002;A\f<B\f=C\b:D\f>E\t?F\002@G\0026H\0027I\fAÉ\tH", new Object[] { "zzdj", "zzeq", "zzer", "zzes", "zzdt", "zzet", "zzeu", "zzev", "zzew", "zzex", "zzey", "zzez", "zzfa", "zzfb", "zzfc", "zzfd", "zzfe", "zzff", "zzfg", "zzfh", "zzfi", "zzfj", "zzfk", "zzhc", "zzfl", "zzfm", "zzhd", "zzhh", "zzhe", localuR1, "zzej", "zzhf", "zzfn", "zzhg", "zzfo", "zzfp", "zzfq", "zzel", "zzfr", "zzfs", "zzft", "zzfu", "zzfv", "zzfw", "zzfx", "zzfy", "zzgk", e.class, "zzfz", "zzga", "zzem", "zzen", "zzgb", localuR2, "zzgc", localuR3, "zzgj", "zzgd", "zzge", "zzgf", "zzgg", "zzgh", "zzgi", localuR4, "zzgl", "zzgm", "zzgn", "zzgo", "zzgp", "zzgs", "zzgt", "zzgv", "zzgw", paramObject1, "zzgx", localuR5, "zzgu", "zzgy", paramObject2, "zzgz", "zzha", "zzgq", "zzgr", "zzhb", localuR6, "zzhi" });
    case 2: 
      return new a(null);
    }
    return new vt();
  }
  
  public final String j()
  {
    return this.zzej;
  }
  
  public final boolean k()
  {
    return (this.zzdj & 0x400000) == 4194304;
  }
  
  public final boolean l()
  {
    return (this.zzer & 0x100) == 256;
  }
  
  public final yt m()
  {
    yt localyt1 = this.zzhi;
    yt localyt2 = localyt1;
    if (localyt1 == null) {
      localyt2 = yt.l();
    }
    return localyt2;
  }
  
  public static final class a
    extends pR.a<vt, a>
    implements _R
  {
    private a()
    {
      super();
    }
    
    public final a A(long paramLong)
    {
      g();
      vt.b((vt)this.b, paramLong);
      return this;
    }
    
    public final a B(long paramLong)
    {
      g();
      vt.c((vt)this.b, paramLong);
      return this;
    }
    
    public final a C(long paramLong)
    {
      g();
      vt.d((vt)this.b, paramLong);
      return this;
    }
    
    public final a D(long paramLong)
    {
      g();
      vt.e((vt)this.b, paramLong);
      return this;
    }
    
    public final a E(long paramLong)
    {
      g();
      vt.f((vt)this.b, paramLong);
      return this;
    }
    
    public final a F(long paramLong)
    {
      g();
      vt.g((vt)this.b, paramLong);
      return this;
    }
    
    public final a G(long paramLong)
    {
      g();
      vt.h((vt)this.b, paramLong);
      return this;
    }
    
    public final a a(long paramLong)
    {
      g();
      vt.a((vt)this.b, paramLong);
      return this;
    }
    
    public final a a(Fy paramFy)
    {
      g();
      vt.a((vt)this.b, paramFy);
      return this;
    }
    
    public final a a(vt.c paramc)
    {
      g();
      vt.a((vt)this.b, paramc);
      return this;
    }
    
    public final a a(vt.e parame)
    {
      g();
      vt.a((vt)this.b, parame);
      return this;
    }
    
    public final a a(vt.f paramf)
    {
      g();
      vt.a((vt)this.b, paramf);
      return this;
    }
    
    public final a a(zt paramzt)
    {
      g();
      vt.a((vt)this.b, paramzt);
      return this;
    }
    
    public final a a(String paramString)
    {
      g();
      vt.d((vt)this.b, paramString);
      return this;
    }
    
    public final a a(boolean paramBoolean)
    {
      g();
      vt.a((vt)this.b, paramBoolean);
      return this;
    }
    
    public final a b(long paramLong)
    {
      g();
      vt.i((vt)this.b, paramLong);
      return this;
    }
    
    public final a b(Fy paramFy)
    {
      g();
      vt.b((vt)this.b, paramFy);
      return this;
    }
    
    public final a b(vt.e parame)
    {
      g();
      vt.b((vt)this.b, parame);
      return this;
    }
    
    public final a b(String paramString)
    {
      g();
      vt.e((vt)this.b, paramString);
      return this;
    }
    
    public final a c(long paramLong)
    {
      g();
      vt.j((vt)this.b, paramLong);
      return this;
    }
    
    public final a c(Fy paramFy)
    {
      g();
      vt.c((vt)this.b, paramFy);
      return this;
    }
    
    public final a c(String paramString)
    {
      g();
      vt.f((vt)this.b, paramString);
      return this;
    }
    
    public final a d(long paramLong)
    {
      g();
      vt.k((vt)this.b, paramLong);
      return this;
    }
    
    public final a d(Fy paramFy)
    {
      g();
      vt.d((vt)this.b, paramFy);
      return this;
    }
    
    public final a d(String paramString)
    {
      g();
      vt.g((vt)this.b, paramString);
      return this;
    }
    
    public final a e(long paramLong)
    {
      g();
      vt.l((vt)this.b, paramLong);
      return this;
    }
    
    public final a e(String paramString)
    {
      g();
      vt.h((vt)this.b, paramString);
      return this;
    }
    
    public final a f(long paramLong)
    {
      g();
      vt.m((vt)this.b, paramLong);
      return this;
    }
    
    public final a f(String paramString)
    {
      g();
      vt.i((vt)this.b, paramString);
      return this;
    }
    
    public final a g(long paramLong)
    {
      g();
      vt.n((vt)this.b, paramLong);
      return this;
    }
    
    public final a g(String paramString)
    {
      g();
      vt.a((vt)this.b, paramString);
      return this;
    }
    
    public final a h(long paramLong)
    {
      g();
      vt.o((vt)this.b, paramLong);
      return this;
    }
    
    public final a h(String paramString)
    {
      g();
      vt.b((vt)this.b, paramString);
      return this;
    }
    
    public final a i(long paramLong)
    {
      g();
      vt.p((vt)this.b, paramLong);
      return this;
    }
    
    public final a i(String paramString)
    {
      g();
      vt.c((vt)this.b, paramString);
      return this;
    }
    
    public final a j()
    {
      g();
      vt.a((vt)this.b);
      return this;
    }
    
    public final a j(long paramLong)
    {
      g();
      vt.q((vt)this.b, paramLong);
      return this;
    }
    
    public final a k(long paramLong)
    {
      g();
      vt.r((vt)this.b, paramLong);
      return this;
    }
    
    public final a l(long paramLong)
    {
      g();
      vt.s((vt)this.b, paramLong);
      return this;
    }
    
    public final a m(long paramLong)
    {
      g();
      vt.t((vt)this.b, paramLong);
      return this;
    }
    
    public final a n(long paramLong)
    {
      g();
      vt.u((vt)this.b, paramLong);
      return this;
    }
    
    public final a o(long paramLong)
    {
      g();
      vt.v((vt)this.b, paramLong);
      return this;
    }
    
    public final a p(long paramLong)
    {
      g();
      vt.w((vt)this.b, paramLong);
      return this;
    }
    
    @Deprecated
    public final a q(long paramLong)
    {
      g();
      vt.x((vt)this.b, paramLong);
      return this;
    }
    
    public final a r(long paramLong)
    {
      g();
      vt.y((vt)this.b, paramLong);
      return this;
    }
    
    public final a s(long paramLong)
    {
      g();
      vt.z((vt)this.b, paramLong);
      return this;
    }
    
    public final a t(long paramLong)
    {
      g();
      vt.A((vt)this.b, paramLong);
      return this;
    }
    
    public final a u(long paramLong)
    {
      g();
      vt.B((vt)this.b, paramLong);
      return this;
    }
    
    public final a v(long paramLong)
    {
      g();
      vt.C((vt)this.b, paramLong);
      return this;
    }
    
    public final a w(long paramLong)
    {
      g();
      vt.D((vt)this.b, paramLong);
      return this;
    }
    
    public final a x(long paramLong)
    {
      g();
      vt.E((vt)this.b, paramLong);
      return this;
    }
    
    public final a y(long paramLong)
    {
      g();
      vt.F((vt)this.b, paramLong);
      return this;
    }
    
    public final a z(long paramLong)
    {
      g();
      vt.G((vt)this.b, paramLong);
      return this;
    }
  }
  
  public static enum b
    implements sR
  {
    private static final tR<b> e = new Bu();
    private final int g;
    
    private b(int paramInt)
    {
      this.g = paramInt;
    }
    
    public static uR a()
    {
      return bv.a;
    }
    
    public static b a(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3) {
              return null;
            }
            return d;
          }
          return c;
        }
        return b;
      }
      return a;
    }
    
    public final int n()
    {
      return this.g;
    }
  }
  
  public static enum c
    implements sR
  {
    private static final tR<c> h = new Cv();
    private final int j;
    
    private c(int paramInt)
    {
      this.j = paramInt;
    }
    
    public static uR a()
    {
      return cw.a;
    }
    
    public static c a(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 6: 
        return g;
      case 5: 
        return f;
      case 4: 
        return e;
      case 3: 
        return d;
      case 2: 
        return c;
      case 1: 
        return b;
      }
      return a;
    }
    
    public final int n()
    {
      return this.j;
    }
  }
  
  public static enum d
    implements sR
  {
    private static final tR<d> z = new Dw();
    private final int B;
    
    private d(int paramInt)
    {
      this.B = paramInt;
    }
    
    public final int n()
    {
      return this.B;
    }
  }
  
  public static final class e
    extends pR<e, a>
    implements _R
  {
    private static volatile hS<e> zzdv;
    private static final e zzjq = new e();
    private int zzdj;
    private long zzfe = -1L;
    private long zzff = -1L;
    private long zzix = -1L;
    private long zziy = -1L;
    private long zziz = -1L;
    private long zzja = -1L;
    private int zzjb = 1000;
    private long zzjc = -1L;
    private long zzjd = -1L;
    private long zzje = -1L;
    private int zzjf = 1000;
    private long zzjg = -1L;
    private long zzjh = -1L;
    private long zzji = -1L;
    private long zzjj = -1L;
    private long zzjk;
    private long zzjl;
    private long zzjm = -1L;
    private long zzjn = -1L;
    private long zzjo = -1L;
    private long zzjp = -1L;
    
    static
    {
      pR.a(e.class, zzjq);
    }
    
    private final void a(long paramLong)
    {
      this.zzdj |= 0x4;
      this.zzix = paramLong;
    }
    
    private final void a(Fy paramFy)
    {
      if (paramFy != null)
      {
        this.zzdj |= 0x40;
        this.zzjb = paramFy.n();
        return;
      }
      throw new NullPointerException();
    }
    
    private final void b(long paramLong)
    {
      this.zzdj |= 0x8;
      this.zziy = paramLong;
    }
    
    private final void b(Fy paramFy)
    {
      if (paramFy != null)
      {
        this.zzdj |= 0x400;
        this.zzjf = paramFy.n();
        return;
      }
      throw new NullPointerException();
    }
    
    private final void c(long paramLong)
    {
      this.zzdj |= 0x10;
      this.zziz = paramLong;
    }
    
    private final void d(long paramLong)
    {
      this.zzdj |= 0x20;
      this.zzja = paramLong;
    }
    
    private final void e(long paramLong)
    {
      this.zzdj |= 0x80;
      this.zzjc = paramLong;
    }
    
    private final void f(long paramLong)
    {
      this.zzdj |= 0x100;
      this.zzjd = paramLong;
    }
    
    private final void g(long paramLong)
    {
      this.zzdj |= 0x200;
      this.zzje = paramLong;
    }
    
    private final void h(long paramLong)
    {
      this.zzdj |= 0x800;
      this.zzjg = paramLong;
    }
    
    private final void i(long paramLong)
    {
      this.zzdj |= 0x1000;
      this.zzjh = paramLong;
    }
    
    public static a j()
    {
      return (a)zzjq.a(pR.e.e, null, null);
    }
    
    private final void j(long paramLong)
    {
      this.zzdj |= 0x2000;
      this.zzji = paramLong;
    }
    
    private final void k(long paramLong)
    {
      this.zzdj |= 0x4000;
      this.zzjj = paramLong;
    }
    
    private final void l()
    {
      this.zzdj &= 0xFFFFFFF7;
      this.zziy = -1L;
    }
    
    private final void l(long paramLong)
    {
      this.zzdj |= 0x8000;
      this.zzjk = paramLong;
    }
    
    private final void m(long paramLong)
    {
      this.zzdj |= 0x10000;
      this.zzjl = paramLong;
    }
    
    private final void n(long paramLong)
    {
      this.zzdj |= 0x20000;
      this.zzjm = paramLong;
    }
    
    private final void o(long paramLong)
    {
      this.zzdj |= 0x40000;
      this.zzjn = paramLong;
    }
    
    private final void p(long paramLong)
    {
      this.zzdj |= 0x1;
      this.zzfe = paramLong;
    }
    
    private final void q(long paramLong)
    {
      this.zzdj |= 0x2;
      this.zzff = paramLong;
    }
    
    protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
    {
      switch (au.a[(paramInt - 1)])
      {
      default: 
        throw new UnsupportedOperationException();
      case 7: 
        return null;
      case 6: 
        return Byte.valueOf((byte)1);
      case 5: 
        paramObject2 = zzdv;
        paramObject1 = paramObject2;
        if (paramObject2 == null) {
          try
          {
            paramObject2 = zzdv;
            paramObject1 = paramObject2;
            if (paramObject2 == null)
            {
              paramObject1 = new com/google/android/gms/internal/ads/pR$b;
              ((pR.b)paramObject1).<init>(zzjq);
              zzdv = (hS)paramObject1;
            }
          }
          finally {}
        }
        return paramObject1;
      case 4: 
        return zzjq;
      case 3: 
        paramObject1 = Fy.a();
        paramObject2 = Fy.a();
        return pR.a(zzjq, "\001\025\000\001\001\025\025\000\000\000\001\002\000\002\002\001\003\002\002\004\002\003\005\002\004\006\002\005\007\f\006\b\002\007\t\002\b\n\002\t\013\f\n\f\002\013\r\002\f\016\002\r\017\002\016\020\002\017\021\002\020\022\002\021\023\002\022\024\002\023\025\002\024", new Object[] { "zzdj", "zzfe", "zzff", "zzix", "zziy", "zziz", "zzja", "zzjb", paramObject1, "zzjc", "zzjd", "zzje", "zzjf", paramObject2, "zzjg", "zzjh", "zzji", "zzjj", "zzjk", "zzjl", "zzjm", "zzjn", "zzjo", "zzjp" });
      case 2: 
        return new a(null);
      }
      return new e();
    }
    
    public static final class a
      extends pR.a<vt.e, a>
      implements _R
    {
      private a()
      {
        super();
      }
      
      public final a a(long paramLong)
      {
        g();
        vt.e.a((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a a(Fy paramFy)
      {
        g();
        vt.e.a((vt.e)this.b, paramFy);
        return this;
      }
      
      public final a b(long paramLong)
      {
        g();
        vt.e.b((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a b(Fy paramFy)
      {
        g();
        vt.e.b((vt.e)this.b, paramFy);
        return this;
      }
      
      public final a c(long paramLong)
      {
        g();
        vt.e.c((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a d(long paramLong)
      {
        g();
        vt.e.d((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a e(long paramLong)
      {
        g();
        vt.e.e((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a f(long paramLong)
      {
        g();
        vt.e.f((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a g(long paramLong)
      {
        g();
        vt.e.g((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a h(long paramLong)
      {
        g();
        vt.e.h((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a i(long paramLong)
      {
        g();
        vt.e.i((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a j()
      {
        g();
        vt.e.a((vt.e)this.b);
        return this;
      }
      
      public final a j(long paramLong)
      {
        g();
        vt.e.j((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a k(long paramLong)
      {
        g();
        vt.e.k((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a l(long paramLong)
      {
        g();
        vt.e.l((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a m(long paramLong)
      {
        g();
        vt.e.m((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a n(long paramLong)
      {
        g();
        vt.e.n((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a o(long paramLong)
      {
        g();
        vt.e.o((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a p(long paramLong)
      {
        g();
        vt.e.p((vt.e)this.b, paramLong);
        return this;
      }
      
      public final a q(long paramLong)
      {
        g();
        vt.e.q((vt.e)this.b, paramLong);
        return this;
      }
    }
  }
  
  public static final class f
    extends pR<f, a>
    implements _R
  {
    private static volatile hS<f> zzdv;
    private static final f zzjv = new f();
    private int zzdj;
    private long zzgg = -1L;
    private long zzgh = -1L;
    private long zzjr = -1L;
    private long zzjs = -1L;
    private long zzjt = -1L;
    private long zzju = -1L;
    
    static
    {
      pR.a(f.class, zzjv);
    }
    
    private final void a(long paramLong)
    {
      this.zzdj |= 0x4;
      this.zzjr = paramLong;
    }
    
    private final void b(long paramLong)
    {
      this.zzdj |= 0x8;
      this.zzjs = paramLong;
    }
    
    private final void c(long paramLong)
    {
      this.zzdj |= 0x10;
      this.zzjt = paramLong;
    }
    
    private final void d(long paramLong)
    {
      this.zzdj |= 0x20;
      this.zzju = paramLong;
    }
    
    public static a j()
    {
      return (a)zzjv.a(pR.e.e, null, null);
    }
    
    protected final Object a(int paramInt, Object paramObject1, Object paramObject2)
    {
      switch (au.a[(paramInt - 1)])
      {
      default: 
        throw new UnsupportedOperationException();
      case 7: 
        return null;
      case 6: 
        return Byte.valueOf((byte)1);
      case 5: 
        paramObject2 = zzdv;
        paramObject1 = paramObject2;
        if (paramObject2 == null) {
          try
          {
            paramObject2 = zzdv;
            paramObject1 = paramObject2;
            if (paramObject2 == null)
            {
              paramObject1 = new com/google/android/gms/internal/ads/pR$b;
              ((pR.b)paramObject1).<init>(zzjv);
              zzdv = (hS)paramObject1;
            }
          }
          finally {}
        }
        return paramObject1;
      case 4: 
        return zzjv;
      case 3: 
        return pR.a(zzjv, "\001\006\000\001\001\006\006\000\000\000\001\002\000\002\002\001\003\002\002\004\002\003\005\002\004\006\002\005", new Object[] { "zzdj", "zzgg", "zzgh", "zzjr", "zzjs", "zzjt", "zzju" });
      case 2: 
        return new a(null);
      }
      return new f();
    }
    
    public static final class a
      extends pR.a<vt.f, a>
      implements _R
    {
      private a()
      {
        super();
      }
      
      public final a a(long paramLong)
      {
        g();
        vt.f.a((vt.f)this.b, paramLong);
        return this;
      }
      
      public final a b(long paramLong)
      {
        g();
        vt.f.b((vt.f)this.b, paramLong);
        return this;
      }
      
      public final a c(long paramLong)
      {
        g();
        vt.f.c((vt.f)this.b, paramLong);
        return this;
      }
      
      public final a d(long paramLong)
      {
        g();
        vt.f.d((vt.f)this.b, paramLong);
        return this;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */