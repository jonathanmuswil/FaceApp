public class m
  implements p.a
{
  t a = null;
  float b = 0.0F;
  boolean c = false;
  public final l d;
  boolean e = false;
  
  public m(n paramn)
  {
    this.d = new l(this, paramn);
  }
  
  public m a(float paramFloat1, float paramFloat2, float paramFloat3, t paramt1, t paramt2, t paramt3, t paramt4)
  {
    this.b = 0.0F;
    if ((paramFloat2 != 0.0F) && (paramFloat1 != paramFloat3))
    {
      if (paramFloat1 == 0.0F)
      {
        this.d.a(paramt1, 1.0F);
        this.d.a(paramt2, -1.0F);
      }
      else if (paramFloat3 == 0.0F)
      {
        this.d.a(paramt3, 1.0F);
        this.d.a(paramt4, -1.0F);
      }
      else
      {
        paramFloat1 = paramFloat1 / paramFloat2 / (paramFloat3 / paramFloat2);
        this.d.a(paramt1, 1.0F);
        this.d.a(paramt2, -1.0F);
        this.d.a(paramt4, paramFloat1);
        this.d.a(paramt3, -paramFloat1);
      }
    }
    else
    {
      this.d.a(paramt1, 1.0F);
      this.d.a(paramt2, -1.0F);
      this.d.a(paramt4, 1.0F);
      this.d.a(paramt3, -1.0F);
    }
    return this;
  }
  
  public m a(p paramp, int paramInt)
  {
    this.d.a(paramp.a(paramInt, "ep"), 1.0F);
    this.d.a(paramp.a(paramInt, "em"), -1.0F);
    return this;
  }
  
  m a(t paramt, int paramInt)
  {
    this.d.a(paramt, paramInt);
    return this;
  }
  
  public m a(t paramt1, t paramt2, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramInt != 0)
    {
      i = j;
      j = paramInt;
      if (paramInt < 0)
      {
        j = paramInt * -1;
        i = 1;
      }
      this.b = j;
    }
    if (i == 0)
    {
      this.d.a(paramt1, -1.0F);
      this.d.a(paramt2, 1.0F);
    }
    else
    {
      this.d.a(paramt1, 1.0F);
      this.d.a(paramt2, -1.0F);
    }
    return this;
  }
  
  m a(t paramt1, t paramt2, int paramInt1, float paramFloat, t paramt3, t paramt4, int paramInt2)
  {
    if (paramt2 == paramt3)
    {
      this.d.a(paramt1, 1.0F);
      this.d.a(paramt4, 1.0F);
      this.d.a(paramt2, -2.0F);
      return this;
    }
    if (paramFloat == 0.5F)
    {
      this.d.a(paramt1, 1.0F);
      this.d.a(paramt2, -1.0F);
      this.d.a(paramt3, -1.0F);
      this.d.a(paramt4, 1.0F);
      if ((paramInt1 > 0) || (paramInt2 > 0)) {
        this.b = (-paramInt1 + paramInt2);
      }
    }
    else if (paramFloat <= 0.0F)
    {
      this.d.a(paramt1, -1.0F);
      this.d.a(paramt2, 1.0F);
      this.b = paramInt1;
    }
    else if (paramFloat >= 1.0F)
    {
      this.d.a(paramt3, -1.0F);
      this.d.a(paramt4, 1.0F);
      this.b = paramInt2;
    }
    else
    {
      l locall = this.d;
      float f = 1.0F - paramFloat;
      locall.a(paramt1, f * 1.0F);
      this.d.a(paramt2, f * -1.0F);
      this.d.a(paramt3, -1.0F * paramFloat);
      this.d.a(paramt4, 1.0F * paramFloat);
      if ((paramInt1 > 0) || (paramInt2 > 0)) {
        this.b = (-paramInt1 * f + paramInt2 * paramFloat);
      }
    }
    return this;
  }
  
  m a(t paramt1, t paramt2, t paramt3, float paramFloat)
  {
    this.d.a(paramt1, -1.0F);
    this.d.a(paramt2, 1.0F - paramFloat);
    this.d.a(paramt3, paramFloat);
    return this;
  }
  
  public m a(t paramt1, t paramt2, t paramt3, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramInt != 0)
    {
      i = j;
      j = paramInt;
      if (paramInt < 0)
      {
        j = paramInt * -1;
        i = 1;
      }
      this.b = j;
    }
    if (i == 0)
    {
      this.d.a(paramt1, -1.0F);
      this.d.a(paramt2, 1.0F);
      this.d.a(paramt3, 1.0F);
    }
    else
    {
      this.d.a(paramt1, 1.0F);
      this.d.a(paramt2, -1.0F);
      this.d.a(paramt3, -1.0F);
    }
    return this;
  }
  
  public m a(t paramt1, t paramt2, t paramt3, t paramt4, float paramFloat)
  {
    this.d.a(paramt1, -1.0F);
    this.d.a(paramt2, 1.0F);
    this.d.a(paramt3, paramFloat);
    this.d.a(paramt4, -paramFloat);
    return this;
  }
  
  public t a(p paramp, boolean[] paramArrayOfBoolean)
  {
    return this.d.a(paramArrayOfBoolean, null);
  }
  
  void a()
  {
    float f = this.b;
    if (f < 0.0F)
    {
      this.b = (f * -1.0F);
      this.d.b();
    }
  }
  
  public void a(p.a parama)
  {
    if ((parama instanceof m))
    {
      parama = (m)parama;
      this.a = null;
      this.d.a();
      for (int i = 0;; i++)
      {
        Object localObject = parama.d;
        if (i >= ((l)localObject).a) {
          break;
        }
        localObject = ((l)localObject).a(i);
        float f = parama.d.b(i);
        this.d.a((t)localObject, f, true);
      }
    }
  }
  
  public void a(t paramt)
  {
    int i = paramt.e;
    float f = 1.0F;
    if (i != 1) {
      if (i == 2) {
        f = 1000.0F;
      } else if (i == 3) {
        f = 1000000.0F;
      } else if (i == 4) {
        f = 1.0E9F;
      } else if (i == 5) {
        f = 1.0E12F;
      }
    }
    this.d.a(paramt, f);
  }
  
  boolean a(p paramp)
  {
    paramp = this.d.a(paramp);
    boolean bool;
    if (paramp == null)
    {
      bool = true;
    }
    else
    {
      d(paramp);
      bool = false;
    }
    if (this.d.a == 0) {
      this.e = true;
    }
    return bool;
  }
  
  m b(t paramt, int paramInt)
  {
    this.a = paramt;
    float f = paramInt;
    paramt.f = f;
    this.b = f;
    this.e = true;
    return this;
  }
  
  public m b(t paramt1, t paramt2, t paramt3, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramInt != 0)
    {
      i = j;
      j = paramInt;
      if (paramInt < 0)
      {
        j = paramInt * -1;
        i = 1;
      }
      this.b = j;
    }
    if (i == 0)
    {
      this.d.a(paramt1, -1.0F);
      this.d.a(paramt2, 1.0F);
      this.d.a(paramt3, -1.0F);
    }
    else
    {
      this.d.a(paramt1, 1.0F);
      this.d.a(paramt2, -1.0F);
      this.d.a(paramt3, 1.0F);
    }
    return this;
  }
  
  public m b(t paramt1, t paramt2, t paramt3, t paramt4, float paramFloat)
  {
    this.d.a(paramt3, 0.5F);
    this.d.a(paramt4, 0.5F);
    this.d.a(paramt1, -0.5F);
    this.d.a(paramt2, -0.5F);
    this.b = (-paramFloat);
    return this;
  }
  
  boolean b()
  {
    t localt = this.a;
    boolean bool;
    if ((localt != null) && ((localt.h == t.a.a) || (this.b >= 0.0F))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  boolean b(t paramt)
  {
    return this.d.a(paramt);
  }
  
  public m c(t paramt, int paramInt)
  {
    if (paramInt < 0)
    {
      this.b = (paramInt * -1);
      this.d.a(paramt, 1.0F);
    }
    else
    {
      this.b = paramInt;
      this.d.a(paramt, -1.0F);
    }
    return this;
  }
  
  t c(t paramt)
  {
    return this.d.a(null, paramt);
  }
  
  public boolean c()
  {
    boolean bool;
    if ((this.a == null) && (this.b == 0.0F) && (this.d.a == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void clear()
  {
    this.d.a();
    this.a = null;
    this.b = 0.0F;
  }
  
  public void d()
  {
    this.a = null;
    this.d.a();
    this.b = 0.0F;
    this.e = false;
  }
  
  void d(t paramt)
  {
    t localt = this.a;
    if (localt != null)
    {
      this.d.a(localt, -1.0F);
      this.a = null;
    }
    float f = this.d.a(paramt, true) * -1.0F;
    this.a = paramt;
    if (f == 1.0F) {
      return;
    }
    this.b /= f;
    this.d.a(f);
  }
  
  String e()
  {
    if (this.a == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("");
      ((StringBuilder)localObject1).append("0");
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    else
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("");
      ((StringBuilder)localObject1).append(this.a);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(" = ");
    Object localObject1 = ((StringBuilder)localObject2).toString();
    float f1 = this.b;
    int i = 0;
    int j;
    if (f1 != 0.0F)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(this.b);
      localObject1 = ((StringBuilder)localObject2).toString();
      j = 1;
    }
    else
    {
      j = 0;
    }
    int k = this.d.a;
    while (i < k)
    {
      localObject2 = this.d.a(i);
      if (localObject2 != null)
      {
        float f2 = this.d.b(i);
        boolean bool = f2 < 0.0F;
        if (bool)
        {
          String str = ((t)localObject2).toString();
          if (j == 0)
          {
            localObject2 = localObject1;
            f1 = f2;
            if (f2 >= 0.0F) {
              break label322;
            }
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append((String)localObject1);
            ((StringBuilder)localObject2).append("- ");
            localObject2 = ((StringBuilder)localObject2).toString();
          }
          else
          {
            if (bool)
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append((String)localObject1);
              ((StringBuilder)localObject2).append(" + ");
              localObject2 = ((StringBuilder)localObject2).toString();
              f1 = f2;
              break label322;
            }
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append((String)localObject1);
            ((StringBuilder)localObject2).append(" - ");
            localObject2 = ((StringBuilder)localObject2).toString();
          }
          f1 = f2 * -1.0F;
          label322:
          if (f1 == 1.0F)
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append((String)localObject2);
            ((StringBuilder)localObject1).append(str);
            localObject1 = ((StringBuilder)localObject1).toString();
          }
          else
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append((String)localObject2);
            ((StringBuilder)localObject1).append(f1);
            ((StringBuilder)localObject1).append(" ");
            ((StringBuilder)localObject1).append(str);
            localObject1 = ((StringBuilder)localObject1).toString();
          }
          j = 1;
        }
      }
      i++;
    }
    localObject2 = localObject1;
    if (j == 0)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("0.0");
      localObject2 = ((StringBuilder)localObject2).toString();
    }
    return (String)localObject2;
  }
  
  public t getKey()
  {
    return this.a;
  }
  
  public String toString()
  {
    return e();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */