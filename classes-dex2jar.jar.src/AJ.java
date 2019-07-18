public final class aj
  implements dj, cj
{
  private final dj a;
  private cj b;
  private cj c;
  
  public aj(dj paramdj)
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
  
  private boolean g(cj paramcj)
  {
    boolean bool;
    if ((!paramcj.equals(this.b)) && ((!this.b.e()) || (!paramcj.equals(this.c)))) {
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
    boolean bool1 = paramcj instanceof aj;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramcj = (aj)paramcj;
      bool3 = bool2;
      if (this.b.a(paramcj.b))
      {
        bool3 = bool2;
        if (this.c.a(paramcj.c)) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public void b()
  {
    if (!this.b.isRunning()) {
      this.b.b();
    }
  }
  
  public void b(cj paramcj)
  {
    if (!paramcj.equals(this.c))
    {
      if (!this.c.isRunning()) {
        this.c.b();
      }
      return;
    }
    paramcj = this.a;
    if (paramcj != null) {
      paramcj.b(this);
    }
  }
  
  public boolean c()
  {
    cj localcj;
    if (this.b.e()) {
      localcj = this.c;
    } else {
      localcj = this.b;
    }
    return localcj.c();
  }
  
  public boolean c(cj paramcj)
  {
    boolean bool;
    if ((h()) && (g(paramcj))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void clear()
  {
    this.b.clear();
    if (this.c.isRunning()) {
      this.c.clear();
    }
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
    if ((i()) && (g(paramcj))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void e(cj paramcj)
  {
    paramcj = this.a;
    if (paramcj != null) {
      paramcj.e(this);
    }
  }
  
  public boolean e()
  {
    boolean bool;
    if ((this.b.e()) && (this.c.e())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean f()
  {
    cj localcj;
    if (this.b.e()) {
      localcj = this.c;
    } else {
      localcj = this.b;
    }
    return localcj.f();
  }
  
  public boolean f(cj paramcj)
  {
    boolean bool;
    if ((g()) && (g(paramcj))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isComplete()
  {
    cj localcj;
    if (this.b.e()) {
      localcj = this.c;
    } else {
      localcj = this.b;
    }
    return localcj.isComplete();
  }
  
  public boolean isRunning()
  {
    cj localcj;
    if (this.b.e()) {
      localcj = this.c;
    } else {
      localcj = this.b;
    }
    return localcj.isRunning();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */