public class kj
  implements dj, cj
{
  private final dj a;
  private cj b;
  private cj c;
  private boolean d;
  
  kj()
  {
    this(null);
  }
  
  public kj(dj paramdj)
  {
    this.a = paramdj;
  }
  
  private boolean g()
  {
    dj localdj = this.a;
    boolean bool;
    if ((localdj != null) && (!localdj.f(this))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean h()
  {
    dj localdj = this.a;
    boolean bool;
    if ((localdj != null) && (!localdj.c(this))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean i()
  {
    dj localdj = this.a;
    boolean bool;
    if ((localdj != null) && (!localdj.d(this))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean j()
  {
    dj localdj = this.a;
    boolean bool;
    if ((localdj != null) && (localdj.d())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a()
  {
    this.b.a();
    this.c.a();
  }
  
  public void a(cj paramcj1, cj paramcj2)
  {
    this.b = paramcj1;
    this.c = paramcj2;
  }
  
  public boolean a(cj paramcj)
  {
    boolean bool1 = paramcj instanceof kj;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramcj = (kj)paramcj;
      cj localcj = this.b;
      if (localcj == null)
      {
        bool3 = bool2;
        if (paramcj.b != null) {
          break label104;
        }
      }
      else
      {
        bool3 = bool2;
        if (!localcj.a(paramcj.b)) {
          break label104;
        }
      }
      localcj = this.c;
      if (localcj == null)
      {
        bool3 = bool2;
        if (paramcj.c != null) {
          break label104;
        }
      }
      else
      {
        bool3 = bool2;
        if (!localcj.a(paramcj.c)) {
          break label104;
        }
      }
      bool3 = true;
    }
    label104:
    return bool3;
  }
  
  public void b()
  {
    this.d = true;
    if ((!this.b.isComplete()) && (!this.c.isRunning())) {
      this.c.b();
    }
    if ((this.d) && (!this.b.isRunning())) {
      this.b.b();
    }
  }
  
  public void b(cj paramcj)
  {
    if (!paramcj.equals(this.b)) {
      return;
    }
    paramcj = this.a;
    if (paramcj != null) {
      paramcj.b(this);
    }
  }
  
  public boolean c()
  {
    boolean bool;
    if ((!this.b.c()) && (!this.c.c())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean c(cj paramcj)
  {
    boolean bool;
    if ((h()) && (paramcj.equals(this.b)) && (!d())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void clear()
  {
    this.d = false;
    this.c.clear();
    this.b.clear();
  }
  
  public boolean d()
  {
    boolean bool;
    if ((!j()) && (!c())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean d(cj paramcj)
  {
    boolean bool;
    if ((i()) && ((paramcj.equals(this.b)) || (!this.b.c()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void e(cj paramcj)
  {
    if (paramcj.equals(this.c)) {
      return;
    }
    paramcj = this.a;
    if (paramcj != null) {
      paramcj.e(this);
    }
    if (!this.c.isComplete()) {
      this.c.clear();
    }
  }
  
  public boolean e()
  {
    return this.b.e();
  }
  
  public boolean f()
  {
    return this.b.f();
  }
  
  public boolean f(cj paramcj)
  {
    boolean bool;
    if ((g()) && (paramcj.equals(this.b))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isComplete()
  {
    boolean bool;
    if ((!this.b.isComplete()) && (!this.c.isComplete())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isRunning()
  {
    return this.b.isRunning();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */