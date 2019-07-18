import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.m;
import java.util.Map;

public abstract class _i<T extends _i<T>>
  implements Cloneable
{
  private int a;
  private float b = 1.0F;
  private Hf c = Hf.e;
  private Fe d = Fe.c;
  private Drawable e;
  private int f;
  private Drawable g;
  private int h;
  private boolean i = true;
  private int j = -1;
  private int k = -1;
  private g l = Aj.a();
  private boolean m;
  private boolean n = true;
  private Drawable o;
  private int p;
  private j q = new j();
  private Map<Class<?>, m<?>> r = new Dj();
  private Class<?> s = Object.class;
  private boolean t;
  private Resources.Theme u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y = true;
  private boolean z;
  
  private T a(Eh paramEh, m<Bitmap> paramm, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramEh = b(paramEh, paramm);
    } else {
      paramEh = a(paramEh, paramm);
    }
    paramEh.y = true;
    return paramEh;
  }
  
  private boolean b(int paramInt)
  {
    return b(this.a, paramInt);
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 & paramInt2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private T c(Eh paramEh, m<Bitmap> paramm)
  {
    return a(paramEh, paramm, false);
  }
  
  private T da()
  {
    return this;
  }
  
  private T ea()
  {
    if (!this.t)
    {
      da();
      return this;
    }
    throw new IllegalStateException("You cannot modify locked T, consider clone()");
  }
  
  public final boolean P()
  {
    return this.z;
  }
  
  public final boolean Q()
  {
    return this.w;
  }
  
  public final boolean R()
  {
    return this.i;
  }
  
  public final boolean S()
  {
    return b(8);
  }
  
  boolean T()
  {
    return this.y;
  }
  
  public final boolean U()
  {
    return this.n;
  }
  
  public final boolean V()
  {
    return this.m;
  }
  
  public final boolean W()
  {
    return b(2048);
  }
  
  public final boolean X()
  {
    return Pj.b(this.k, this.j);
  }
  
  public T Y()
  {
    this.t = true;
    da();
    return this;
  }
  
  public T Z()
  {
    return a(Eh.b, new Ah());
  }
  
  public T a()
  {
    if ((this.t) && (!this.v)) {
      throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }
    this.v = true;
    return Y();
  }
  
  public T a(float paramFloat)
  {
    if (this.v) {
      return clone().a(paramFloat);
    }
    if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F))
    {
      this.b = paramFloat;
      this.a |= 0x2;
      ea();
      return this;
    }
    throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
  }
  
  public T a(int paramInt)
  {
    if (this.v) {
      return clone().a(paramInt);
    }
    this.h = paramInt;
    this.a |= 0x80;
    this.g = null;
    this.a &= 0xFFFFFFBF;
    ea();
    return this;
  }
  
  public T a(int paramInt1, int paramInt2)
  {
    if (this.v) {
      return clone().a(paramInt1, paramInt2);
    }
    this.k = paramInt1;
    this.j = paramInt2;
    this.a |= 0x200;
    ea();
    return this;
  }
  
  public T a(Eh paramEh)
  {
    i locali = Eh.h;
    Nj.a(paramEh);
    return a(locali, paramEh);
  }
  
  final T a(Eh paramEh, m<Bitmap> paramm)
  {
    if (this.v) {
      return clone().a(paramEh, paramm);
    }
    a(paramEh);
    return a(paramm, false);
  }
  
  public T a(Fe paramFe)
  {
    if (this.v) {
      return clone().a(paramFe);
    }
    Nj.a(paramFe);
    this.d = ((Fe)paramFe);
    this.a |= 0x8;
    ea();
    return this;
  }
  
  public T a(Hf paramHf)
  {
    if (this.v) {
      return clone().a(paramHf);
    }
    Nj.a(paramHf);
    this.c = ((Hf)paramHf);
    this.a |= 0x4;
    ea();
    return this;
  }
  
  public T a(_i<?> param_i)
  {
    if (this.v) {
      return clone().a(param_i);
    }
    if (b(param_i.a, 2)) {
      this.b = param_i.b;
    }
    if (b(param_i.a, 262144)) {
      this.w = param_i.w;
    }
    if (b(param_i.a, 1048576)) {
      this.z = param_i.z;
    }
    if (b(param_i.a, 4)) {
      this.c = param_i.c;
    }
    if (b(param_i.a, 8)) {
      this.d = param_i.d;
    }
    if (b(param_i.a, 16))
    {
      this.e = param_i.e;
      this.f = 0;
      this.a &= 0xFFFFFFDF;
    }
    if (b(param_i.a, 32))
    {
      this.f = param_i.f;
      this.e = null;
      this.a &= 0xFFFFFFEF;
    }
    if (b(param_i.a, 64))
    {
      this.g = param_i.g;
      this.h = 0;
      this.a &= 0xFF7F;
    }
    if (b(param_i.a, 128))
    {
      this.h = param_i.h;
      this.g = null;
      this.a &= 0xFFFFFFBF;
    }
    if (b(param_i.a, 256)) {
      this.i = param_i.i;
    }
    if (b(param_i.a, 512))
    {
      this.k = param_i.k;
      this.j = param_i.j;
    }
    if (b(param_i.a, 1024)) {
      this.l = param_i.l;
    }
    if (b(param_i.a, 4096)) {
      this.s = param_i.s;
    }
    if (b(param_i.a, 8192))
    {
      this.o = param_i.o;
      this.p = 0;
      this.a &= 0xBFFF;
    }
    if (b(param_i.a, 16384))
    {
      this.p = param_i.p;
      this.o = null;
      this.a &= 0xDFFF;
    }
    if (b(param_i.a, 32768)) {
      this.u = param_i.u;
    }
    if (b(param_i.a, 65536)) {
      this.n = param_i.n;
    }
    if (b(param_i.a, 131072)) {
      this.m = param_i.m;
    }
    if (b(param_i.a, 2048))
    {
      this.r.putAll(param_i.r);
      this.y = param_i.y;
    }
    if (b(param_i.a, 524288)) {
      this.x = param_i.x;
    }
    if (!this.n)
    {
      this.r.clear();
      this.a &= 0xF7FF;
      this.m = false;
      this.a &= 0xFFFDFFFF;
      this.y = true;
    }
    this.a |= param_i.a;
    this.q.a(param_i.q);
    ea();
    return this;
  }
  
  public T a(Drawable paramDrawable)
  {
    if (this.v) {
      return clone().a(paramDrawable);
    }
    this.g = paramDrawable;
    this.a |= 0x40;
    this.h = 0;
    this.a &= 0xFF7F;
    ea();
    return this;
  }
  
  public T a(b paramb)
  {
    Nj.a(paramb);
    return a(Gh.a, paramb).a(ni.a, paramb);
  }
  
  public T a(g paramg)
  {
    if (this.v) {
      return clone().a(paramg);
    }
    Nj.a(paramg);
    this.l = ((g)paramg);
    this.a |= 0x400;
    ea();
    return this;
  }
  
  public <Y> T a(i<Y> parami, Y paramY)
  {
    if (this.v) {
      return clone().a(parami, paramY);
    }
    Nj.a(parami);
    Nj.a(paramY);
    this.q.a(parami, paramY);
    ea();
    return this;
  }
  
  public T a(m<Bitmap> paramm)
  {
    return a(paramm, true);
  }
  
  T a(m<Bitmap> paramm, boolean paramBoolean)
  {
    if (this.v) {
      return clone().a(paramm, paramBoolean);
    }
    Jh localJh = new Jh(paramm, paramBoolean);
    a(Bitmap.class, paramm, paramBoolean);
    a(Drawable.class, localJh, paramBoolean);
    localJh.a();
    a(BitmapDrawable.class, localJh, paramBoolean);
    a(hi.class, new ki(paramm), paramBoolean);
    ea();
    return this;
  }
  
  public T a(Class<?> paramClass)
  {
    if (this.v) {
      return clone().a(paramClass);
    }
    Nj.a(paramClass);
    this.s = ((Class)paramClass);
    this.a |= 0x1000;
    ea();
    return this;
  }
  
  <Y> T a(Class<Y> paramClass, m<Y> paramm, boolean paramBoolean)
  {
    if (this.v) {
      return clone().a(paramClass, paramm, paramBoolean);
    }
    Nj.a(paramClass);
    Nj.a(paramm);
    this.r.put(paramClass, paramm);
    this.a |= 0x800;
    this.n = true;
    this.a |= 0x10000;
    this.y = false;
    if (paramBoolean)
    {
      this.a |= 0x20000;
      this.m = true;
    }
    ea();
    return this;
  }
  
  public T a(boolean paramBoolean)
  {
    if (this.v) {
      return clone().a(true);
    }
    this.i = (paramBoolean ^ true);
    this.a |= 0x100;
    ea();
    return this;
  }
  
  public T aa()
  {
    return c(Eh.e, new Bh());
  }
  
  public T b()
  {
    return b(Eh.b, new Ah());
  }
  
  final T b(Eh paramEh, m<Bitmap> paramm)
  {
    if (this.v) {
      return clone().b(paramEh, paramm);
    }
    a(paramEh);
    return a(paramm);
  }
  
  public T b(boolean paramBoolean)
  {
    if (this.v) {
      return clone().b(paramBoolean);
    }
    this.z = paramBoolean;
    this.a |= 0x100000;
    ea();
    return this;
  }
  
  public T ba()
  {
    return a(Eh.b, new Ch());
  }
  
  public T c()
  {
    return b(Eh.e, new Ch());
  }
  
  public T ca()
  {
    return c(Eh.a, new Lh());
  }
  
  public T clone()
  {
    try
    {
      _i local_i = (_i)super.clone();
      Object localObject = new com/bumptech/glide/load/j;
      ((j)localObject).<init>();
      local_i.q = ((j)localObject);
      local_i.q.a(this.q);
      localObject = new Dj;
      ((Dj)localObject).<init>();
      local_i.r = ((Map)localObject);
      local_i.r.putAll(this.r);
      local_i.t = false;
      local_i.v = false;
      return local_i;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new RuntimeException(localCloneNotSupportedException);
    }
  }
  
  public T d()
  {
    return a(Gh.d, Boolean.valueOf(false));
  }
  
  public final Hf e()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof _i;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (_i)paramObject;
      bool3 = bool2;
      if (Float.compare(((_i)paramObject).b, this.b) == 0)
      {
        bool3 = bool2;
        if (this.f == ((_i)paramObject).f)
        {
          bool3 = bool2;
          if (Pj.b(this.e, ((_i)paramObject).e))
          {
            bool3 = bool2;
            if (this.h == ((_i)paramObject).h)
            {
              bool3 = bool2;
              if (Pj.b(this.g, ((_i)paramObject).g))
              {
                bool3 = bool2;
                if (this.p == ((_i)paramObject).p)
                {
                  bool3 = bool2;
                  if (Pj.b(this.o, ((_i)paramObject).o))
                  {
                    bool3 = bool2;
                    if (this.i == ((_i)paramObject).i)
                    {
                      bool3 = bool2;
                      if (this.j == ((_i)paramObject).j)
                      {
                        bool3 = bool2;
                        if (this.k == ((_i)paramObject).k)
                        {
                          bool3 = bool2;
                          if (this.m == ((_i)paramObject).m)
                          {
                            bool3 = bool2;
                            if (this.n == ((_i)paramObject).n)
                            {
                              bool3 = bool2;
                              if (this.w == ((_i)paramObject).w)
                              {
                                bool3 = bool2;
                                if (this.x == ((_i)paramObject).x)
                                {
                                  bool3 = bool2;
                                  if (this.c.equals(((_i)paramObject).c))
                                  {
                                    bool3 = bool2;
                                    if (this.d == ((_i)paramObject).d)
                                    {
                                      bool3 = bool2;
                                      if (this.q.equals(((_i)paramObject).q))
                                      {
                                        bool3 = bool2;
                                        if (this.r.equals(((_i)paramObject).r))
                                        {
                                          bool3 = bool2;
                                          if (this.s.equals(((_i)paramObject).s))
                                          {
                                            bool3 = bool2;
                                            if (Pj.b(this.l, ((_i)paramObject).l))
                                            {
                                              bool3 = bool2;
                                              if (Pj.b(this.u, ((_i)paramObject).u)) {
                                                bool3 = true;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool3;
  }
  
  public final int f()
  {
    return this.f;
  }
  
  public final Drawable g()
  {
    return this.e;
  }
  
  public final Drawable h()
  {
    return this.o;
  }
  
  public int hashCode()
  {
    int i1 = Pj.a(this.b);
    i1 = Pj.a(this.f, i1);
    i1 = Pj.a(this.e, i1);
    i1 = Pj.a(this.h, i1);
    i1 = Pj.a(this.g, i1);
    i1 = Pj.a(this.p, i1);
    i1 = Pj.a(this.o, i1);
    i1 = Pj.a(this.i, i1);
    i1 = Pj.a(this.j, i1);
    i1 = Pj.a(this.k, i1);
    i1 = Pj.a(this.m, i1);
    i1 = Pj.a(this.n, i1);
    i1 = Pj.a(this.w, i1);
    i1 = Pj.a(this.x, i1);
    i1 = Pj.a(this.c, i1);
    i1 = Pj.a(this.d, i1);
    i1 = Pj.a(this.q, i1);
    i1 = Pj.a(this.r, i1);
    i1 = Pj.a(this.s, i1);
    i1 = Pj.a(this.l, i1);
    return Pj.a(this.u, i1);
  }
  
  public final int i()
  {
    return this.p;
  }
  
  public final boolean j()
  {
    return this.x;
  }
  
  public final j k()
  {
    return this.q;
  }
  
  public final int m()
  {
    return this.j;
  }
  
  public final int n()
  {
    return this.k;
  }
  
  public final Drawable o()
  {
    return this.g;
  }
  
  public final int p()
  {
    return this.h;
  }
  
  public final Fe q()
  {
    return this.d;
  }
  
  public final Class<?> r()
  {
    return this.s;
  }
  
  public final g s()
  {
    return this.l;
  }
  
  public final float t()
  {
    return this.b;
  }
  
  public final Resources.Theme u()
  {
    return this.u;
  }
  
  public final Map<Class<?>, m<?>> v()
  {
    return this.r;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */