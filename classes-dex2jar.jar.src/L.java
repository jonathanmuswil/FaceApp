import java.util.Arrays;

public class l
{
  int a = 0;
  private final m b;
  private final n c;
  private int d = 8;
  private t e = null;
  private int[] f;
  private int[] g;
  private float[] h;
  private int i;
  private int j;
  private boolean k;
  
  l(m paramm, n paramn)
  {
    int m = this.d;
    this.f = new int[m];
    this.g = new int[m];
    this.h = new float[m];
    this.i = -1;
    this.j = -1;
    this.k = false;
    this.b = paramm;
    this.c = paramn;
  }
  
  private boolean a(t paramt, p paramp)
  {
    int m = paramt.k;
    boolean bool = true;
    if (m > 1) {
      bool = false;
    }
    return bool;
  }
  
  public final float a(t paramt, boolean paramBoolean)
  {
    if (this.e == paramt) {
      this.e = null;
    }
    int m = this.i;
    if (m == -1) {
      return 0.0F;
    }
    int n = 0;
    int i1 = -1;
    while ((m != -1) && (n < this.a))
    {
      if (this.f[m] == paramt.c)
      {
        if (m == this.i)
        {
          this.i = this.g[m];
        }
        else
        {
          int[] arrayOfInt = this.g;
          arrayOfInt[i1] = arrayOfInt[m];
        }
        if (paramBoolean) {
          paramt.b(this.b);
        }
        paramt.k -= 1;
        this.a -= 1;
        this.f[m] = -1;
        if (this.k) {
          this.j = m;
        }
        return this.h[m];
      }
      int i2 = this.g[m];
      n++;
      i1 = m;
      m = i2;
    }
    return 0.0F;
  }
  
  final t a(int paramInt)
  {
    int m = this.i;
    for (int n = 0; (m != -1) && (n < this.a); n++)
    {
      if (n == paramInt) {
        return this.c.c[this.f[m]];
      }
      m = this.g[m];
    }
    return null;
  }
  
  t a(p paramp)
  {
    int m = this.i;
    Object localObject1 = null;
    int n = 0;
    Object localObject2 = null;
    float f1 = 0.0F;
    boolean bool1 = false;
    float f2 = 0.0F;
    label132:
    int i2;
    for (int i1 = 0; (m != -1) && (n < this.a); i1 = i2)
    {
      Object localObject3 = this.h;
      float f3 = localObject3[m];
      t localt = this.c.c[this.f[m]];
      if (f3 < 0.0F)
      {
        f4 = f3;
        if (f3 <= -0.001F) {
          break label132;
        }
        localObject3[m] = 0.0F;
        localt.b(this.b);
      }
      else
      {
        f4 = f3;
        if (f3 >= 0.001F) {
          break label132;
        }
        localObject3[m] = 0.0F;
        localt.b(this.b);
      }
      float f4 = 0.0F;
      localObject3 = localObject1;
      Object localObject4 = localObject2;
      f3 = f1;
      boolean bool2 = bool1;
      float f5 = f2;
      i2 = i1;
      if (f4 != 0.0F) {
        if (localt.h == t.a.a)
        {
          if (localObject2 == null) {}
          for (bool2 = a(localt, paramp);; bool2 = a(localt, paramp))
          {
            localObject3 = localObject1;
            localObject4 = localt;
            f3 = f4;
            f5 = f2;
            i2 = i1;
            break label517;
            if (f1 <= f4) {
              break;
            }
          }
          localObject3 = localObject1;
          localObject4 = localObject2;
          f3 = f1;
          bool2 = bool1;
          f5 = f2;
          i2 = i1;
          if (!bool1)
          {
            localObject3 = localObject1;
            localObject4 = localObject2;
            f3 = f1;
            bool2 = bool1;
            f5 = f2;
            i2 = i1;
            if (a(localt, paramp))
            {
              bool2 = true;
              localObject3 = localObject1;
              localObject4 = localt;
              f3 = f4;
              f5 = f2;
              i2 = i1;
            }
          }
        }
        else
        {
          localObject3 = localObject1;
          localObject4 = localObject2;
          f3 = f1;
          bool2 = bool1;
          f5 = f2;
          i2 = i1;
          if (localObject2 == null)
          {
            localObject3 = localObject1;
            localObject4 = localObject2;
            f3 = f1;
            bool2 = bool1;
            f5 = f2;
            i2 = i1;
            if (f4 < 0.0F)
            {
              if (localObject1 == null) {}
              for (bool2 = a(localt, paramp);; bool2 = a(localt, paramp))
              {
                i2 = bool2;
                localObject3 = localt;
                localObject4 = localObject2;
                f3 = f1;
                bool2 = bool1;
                f5 = f4;
                break label517;
                if (f2 <= f4) {
                  break;
                }
              }
              localObject3 = localObject1;
              localObject4 = localObject2;
              f3 = f1;
              bool2 = bool1;
              f5 = f2;
              i2 = i1;
              if (i1 == 0)
              {
                localObject3 = localObject1;
                localObject4 = localObject2;
                f3 = f1;
                bool2 = bool1;
                f5 = f2;
                i2 = i1;
                if (a(localt, paramp))
                {
                  i2 = 1;
                  f5 = f4;
                  bool2 = bool1;
                  f3 = f1;
                  localObject4 = localObject2;
                  localObject3 = localt;
                }
              }
            }
          }
        }
      }
      label517:
      m = this.g[m];
      n++;
      localObject1 = localObject3;
      localObject2 = localObject4;
      f1 = f3;
      bool1 = bool2;
      f2 = f5;
    }
    if (localObject2 != null) {
      return (t)localObject2;
    }
    return (t)localObject1;
  }
  
  t a(boolean[] paramArrayOfBoolean, t paramt)
  {
    int m = this.i;
    int n = 0;
    Object localObject1 = null;
    float f2;
    for (float f1 = 0.0F; (m != -1) && (n < this.a); f1 = f2)
    {
      Object localObject2 = localObject1;
      f2 = f1;
      if (this.h[m] < 0.0F)
      {
        t localt = this.c.c[this.f[m]];
        if (paramArrayOfBoolean != null)
        {
          localObject2 = localObject1;
          f2 = f1;
          if (paramArrayOfBoolean[localt.c] != 0) {}
        }
        else
        {
          localObject2 = localObject1;
          f2 = f1;
          if (localt != paramt)
          {
            t.a locala = localt.h;
            if (locala != t.a.c)
            {
              localObject2 = localObject1;
              f2 = f1;
              if (locala != t.a.d) {}
            }
            else
            {
              float f3 = this.h[m];
              localObject2 = localObject1;
              f2 = f1;
              if (f3 < f1)
              {
                localObject2 = localt;
                f2 = f3;
              }
            }
          }
        }
      }
      m = this.g[m];
      n++;
      localObject1 = localObject2;
    }
    return (t)localObject1;
  }
  
  public final void a()
  {
    int m = this.i;
    for (int n = 0; (m != -1) && (n < this.a); n++)
    {
      t localt = this.c.c[this.f[m]];
      if (localt != null) {
        localt.b(this.b);
      }
      m = this.g[m];
    }
    this.i = -1;
    this.j = -1;
    this.k = false;
    this.a = 0;
  }
  
  void a(float paramFloat)
  {
    int m = this.i;
    for (int n = 0; (m != -1) && (n < this.a); n++)
    {
      float[] arrayOfFloat = this.h;
      arrayOfFloat[m] /= paramFloat;
      m = this.g[m];
    }
  }
  
  final void a(m paramm1, m paramm2, boolean paramBoolean)
  {
    int m = this.i;
    for (int n = 0;; n++)
    {
      if ((m == -1) || (n >= this.a)) {
        return;
      }
      int i1 = this.f[m];
      Object localObject = paramm2.a;
      if (i1 == ((t)localObject).c)
      {
        float f1 = this.h[m];
        a((t)localObject, paramBoolean);
        localObject = paramm2.d;
        n = ((l)localObject).i;
        for (m = 0; (n != -1) && (m < ((l)localObject).a); m++)
        {
          a(this.c.c[localObject.f[n]], localObject.h[n] * f1, paramBoolean);
          n = localObject.g[n];
        }
        paramm1.b += paramm2.b * f1;
        if (paramBoolean) {
          paramm2.a.b(paramm1);
        }
        m = this.i;
        break;
      }
      m = this.g[m];
    }
  }
  
  void a(m paramm, m[] paramArrayOfm)
  {
    int m = this.i;
    for (int n = 0;; n++)
    {
      if ((m == -1) || (n >= this.a)) {
        return;
      }
      Object localObject = this.c.c[this.f[m]];
      if (((t)localObject).d != -1)
      {
        float f1 = this.h[m];
        a((t)localObject, true);
        m localm = paramArrayOfm[localObject.d];
        if (!localm.e)
        {
          localObject = localm.d;
          n = ((l)localObject).i;
          for (m = 0; (n != -1) && (m < ((l)localObject).a); m++)
          {
            a(this.c.c[localObject.f[n]], localObject.h[n] * f1, true);
            n = localObject.g[n];
          }
        }
        paramm.b += localm.b * f1;
        localm.a.b(paramm);
        m = this.i;
        break;
      }
      m = this.g[m];
    }
  }
  
  public final void a(t paramt, float paramFloat)
  {
    if (paramFloat == 0.0F)
    {
      a(paramt, true);
      return;
    }
    int m = this.i;
    if (m == -1)
    {
      this.i = 0;
      localObject = this.h;
      m = this.i;
      localObject[m] = paramFloat;
      this.f[m] = paramt.c;
      this.g[m] = -1;
      paramt.k += 1;
      paramt.a(this.b);
      this.a += 1;
      if (!this.k)
      {
        this.j += 1;
        m = this.j;
        paramt = this.f;
        if (m >= paramt.length)
        {
          this.k = true;
          this.j = (paramt.length - 1);
        }
      }
      return;
    }
    int n = 0;
    int i1 = -1;
    int i3;
    while ((m != -1) && (n < this.a))
    {
      localObject = this.f;
      int i2 = localObject[m];
      i3 = paramt.c;
      if (i2 == i3)
      {
        this.h[m] = paramFloat;
        return;
      }
      if (localObject[m] < i3) {
        i1 = m;
      }
      m = this.g[m];
      n++;
    }
    m = this.j;
    if (this.k)
    {
      localObject = this.f;
      if (localObject[m] != -1) {
        m = localObject.length;
      }
    }
    else
    {
      m++;
    }
    Object localObject = this.f;
    n = m;
    if (m >= localObject.length)
    {
      n = m;
      if (this.a < localObject.length) {
        for (i3 = 0;; i3++)
        {
          localObject = this.f;
          n = m;
          if (i3 >= localObject.length) {
            break;
          }
          if (localObject[i3] == -1)
          {
            n = i3;
            break;
          }
        }
      }
    }
    localObject = this.f;
    m = n;
    if (n >= localObject.length)
    {
      m = localObject.length;
      this.d *= 2;
      this.k = false;
      this.j = (m - 1);
      this.h = Arrays.copyOf(this.h, this.d);
      this.f = Arrays.copyOf(this.f, this.d);
      this.g = Arrays.copyOf(this.g, this.d);
    }
    this.f[m] = paramt.c;
    this.h[m] = paramFloat;
    if (i1 != -1)
    {
      localObject = this.g;
      localObject[m] = localObject[i1];
      localObject[i1] = m;
    }
    else
    {
      this.g[m] = this.i;
      this.i = m;
    }
    paramt.k += 1;
    paramt.a(this.b);
    this.a += 1;
    if (!this.k) {
      this.j += 1;
    }
    if (this.a >= this.f.length) {
      this.k = true;
    }
    m = this.j;
    paramt = this.f;
    if (m >= paramt.length)
    {
      this.k = true;
      this.j = (paramt.length - 1);
    }
  }
  
  final void a(t paramt, float paramFloat, boolean paramBoolean)
  {
    if (paramFloat == 0.0F) {
      return;
    }
    int m = this.i;
    if (m == -1)
    {
      this.i = 0;
      localObject = this.h;
      m = this.i;
      localObject[m] = paramFloat;
      this.f[m] = paramt.c;
      this.g[m] = -1;
      paramt.k += 1;
      paramt.a(this.b);
      this.a += 1;
      if (!this.k)
      {
        this.j += 1;
        m = this.j;
        paramt = this.f;
        if (m >= paramt.length)
        {
          this.k = true;
          this.j = (paramt.length - 1);
        }
      }
      return;
    }
    int n = 0;
    int i1 = -1;
    int i3;
    while ((m != -1) && (n < this.a))
    {
      localObject = this.f;
      int i2 = localObject[m];
      i3 = paramt.c;
      if (i2 == i3)
      {
        localObject = this.h;
        localObject[m] += paramFloat;
        if (localObject[m] == 0.0F)
        {
          if (m == this.i)
          {
            this.i = this.g[m];
          }
          else
          {
            localObject = this.g;
            localObject[i1] = localObject[m];
          }
          if (paramBoolean) {
            paramt.b(this.b);
          }
          if (this.k) {
            this.j = m;
          }
          paramt.k -= 1;
          this.a -= 1;
        }
        return;
      }
      if (localObject[m] < i3) {
        i1 = m;
      }
      m = this.g[m];
      n++;
    }
    m = this.j;
    if (this.k)
    {
      localObject = this.f;
      if (localObject[m] != -1) {
        m = localObject.length;
      }
    }
    else
    {
      m++;
    }
    Object localObject = this.f;
    n = m;
    if (m >= localObject.length)
    {
      n = m;
      if (this.a < localObject.length) {
        for (i3 = 0;; i3++)
        {
          localObject = this.f;
          n = m;
          if (i3 >= localObject.length) {
            break;
          }
          if (localObject[i3] == -1)
          {
            n = i3;
            break;
          }
        }
      }
    }
    localObject = this.f;
    m = n;
    if (n >= localObject.length)
    {
      m = localObject.length;
      this.d *= 2;
      this.k = false;
      this.j = (m - 1);
      this.h = Arrays.copyOf(this.h, this.d);
      this.f = Arrays.copyOf(this.f, this.d);
      this.g = Arrays.copyOf(this.g, this.d);
    }
    this.f[m] = paramt.c;
    this.h[m] = paramFloat;
    if (i1 != -1)
    {
      localObject = this.g;
      localObject[m] = localObject[i1];
      localObject[i1] = m;
    }
    else
    {
      this.g[m] = this.i;
      this.i = m;
    }
    paramt.k += 1;
    paramt.a(this.b);
    this.a += 1;
    if (!this.k) {
      this.j += 1;
    }
    m = this.j;
    paramt = this.f;
    if (m >= paramt.length)
    {
      this.k = true;
      this.j = (paramt.length - 1);
    }
  }
  
  final boolean a(t paramt)
  {
    int m = this.i;
    if (m == -1) {
      return false;
    }
    for (int n = 0; (m != -1) && (n < this.a); n++)
    {
      if (this.f[m] == paramt.c) {
        return true;
      }
      m = this.g[m];
    }
    return false;
  }
  
  final float b(int paramInt)
  {
    int m = this.i;
    for (int n = 0; (m != -1) && (n < this.a); n++)
    {
      if (n == paramInt) {
        return this.h[m];
      }
      m = this.g[m];
    }
    return 0.0F;
  }
  
  public final float b(t paramt)
  {
    int m = this.i;
    for (int n = 0; (m != -1) && (n < this.a); n++)
    {
      if (this.f[m] == paramt.c) {
        return this.h[m];
      }
      m = this.g[m];
    }
    return 0.0F;
  }
  
  void b()
  {
    int m = this.i;
    for (int n = 0; (m != -1) && (n < this.a); n++)
    {
      float[] arrayOfFloat = this.h;
      arrayOfFloat[m] *= -1.0F;
      m = this.g[m];
    }
  }
  
  public String toString()
  {
    int m = this.i;
    Object localObject1 = "";
    for (int n = 0; (m != -1) && (n < this.a); n++)
    {
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" -> ");
      localObject1 = ((StringBuilder)localObject2).toString();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(this.h[m]);
      ((StringBuilder)localObject2).append(" : ");
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(this.c.c[this.f[m]]);
      localObject1 = ((StringBuilder)localObject1).toString();
      m = this.g[m];
    }
    return (String)localObject1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */