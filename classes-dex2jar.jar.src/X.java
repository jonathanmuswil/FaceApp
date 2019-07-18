import java.util.ArrayList;

public class x
{
  protected B a;
  protected B b;
  protected B c;
  protected B d;
  protected B e;
  protected B f;
  protected B g;
  protected ArrayList<B> h;
  protected int i;
  protected int j;
  protected float k = 0.0F;
  private int l;
  private boolean m = false;
  protected boolean n;
  protected boolean o;
  protected boolean p;
  private boolean q;
  
  public x(B paramB, int paramInt, boolean paramBoolean)
  {
    this.a = paramB;
    this.l = paramInt;
    this.m = paramBoolean;
  }
  
  private static boolean a(B paramB, int paramInt)
  {
    if ((paramB.r() != 8) && (paramB.F[paramInt] == B.a.c))
    {
      paramB = paramB.h;
      if ((paramB[paramInt] == 0) || (paramB[paramInt] == 3)) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  private void b()
  {
    int i1 = this.l * 2;
    Object localObject1 = this.a;
    boolean bool1 = false;
    Object localObject2 = localObject1;
    int i2 = 0;
    while (i2 == 0)
    {
      this.i += 1;
      Object localObject3 = ((B)localObject1).sa;
      int i3 = this.l;
      Object localObject4 = null;
      localObject3[i3] = null;
      ((B)localObject1).ra[i3] = null;
      if (((B)localObject1).r() != 8)
      {
        if (this.b == null) {
          this.b = ((B)localObject1);
        }
        this.d = ((B)localObject1);
        localObject3 = ((B)localObject1).F;
        i3 = this.l;
        if (localObject3[i3] == B.a.c)
        {
          localObject3 = ((B)localObject1).h;
          if ((localObject3[i3] == 0) || (localObject3[i3] == 3) || (localObject3[i3] == 2))
          {
            this.j += 1;
            localObject3 = ((B)localObject1).qa;
            i3 = this.l;
            float f1 = localObject3[i3];
            if (f1 > 0.0F) {
              this.k += localObject3[i3];
            }
            if (a((B)localObject1, this.l))
            {
              if (f1 < 0.0F) {
                this.n = true;
              } else {
                this.o = true;
              }
              if (this.h == null) {
                this.h = new ArrayList();
              }
              this.h.add(localObject1);
            }
            if (this.f == null) {
              this.f = ((B)localObject1);
            }
            localObject3 = this.g;
            if (localObject3 != null) {
              ((B)localObject3).ra[this.l] = localObject1;
            }
            this.g = ((B)localObject1);
          }
        }
      }
      if (localObject2 != localObject1) {
        ((B)localObject2).sa[this.l] = localObject1;
      }
      localObject3 = localObject1.D[(i1 + 1)].d;
      localObject2 = localObject4;
      if (localObject3 != null)
      {
        localObject3 = ((z)localObject3).b;
        z[] arrayOfz = ((B)localObject3).D;
        localObject2 = localObject4;
        if (arrayOfz[i1].d != null) {
          if (arrayOfz[i1].d.b != localObject1) {
            localObject2 = localObject4;
          } else {
            localObject2 = localObject3;
          }
        }
      }
      if (localObject2 == null)
      {
        localObject2 = localObject1;
        i2 = 1;
      }
      localObject4 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject4;
    }
    this.c = ((B)localObject1);
    if ((this.l == 0) && (this.m)) {
      this.e = this.c;
    } else {
      this.e = this.a;
    }
    boolean bool2 = bool1;
    if (this.o)
    {
      bool2 = bool1;
      if (this.n) {
        bool2 = true;
      }
    }
    this.p = bool2;
  }
  
  public void a()
  {
    if (!this.q) {
      b();
    }
    this.q = true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */