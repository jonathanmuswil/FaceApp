import java.util.ArrayList;

public class v
  extends G
{
  private int xa = 0;
  private ArrayList<J> ya = new ArrayList(4);
  private boolean za = true;
  
  public void F()
  {
    super.F();
    this.ya.clear();
  }
  
  public void G()
  {
    int i = this.xa;
    float f1 = Float.MAX_VALUE;
    J localJ1;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            return;
          }
          localJ1 = this.y.d();
        }
        else
        {
          localJ1 = this.w.d();
          break label71;
        }
      }
      else {
        localJ1 = this.x.d();
      }
      f1 = 0.0F;
    }
    else
    {
      localJ1 = this.v.d();
    }
    label71:
    int j = this.ya.size();
    J localJ2 = null;
    i = 0;
    Object localObject;
    while (i < j)
    {
      localObject = (J)this.ya.get(i);
      if (((L)localObject).b != 1) {
        return;
      }
      int k = this.xa;
      float f2;
      if ((k != 0) && (k != 2))
      {
        f2 = ((J)localObject).h;
        f3 = f1;
        if (f2 <= f1) {
          break label194;
        }
        localJ2 = ((J)localObject).g;
        f1 = f2;
      }
      else
      {
        f2 = ((J)localObject).h;
        f3 = f1;
        if (f2 >= f1) {
          break label194;
        }
        localJ2 = ((J)localObject).g;
        f1 = f2;
      }
      float f3 = f1;
      label194:
      i++;
      f1 = f3;
    }
    if (p.e() != null)
    {
      localObject = p.e();
      ((q)localObject).y += 1L;
    }
    localJ1.g = localJ2;
    localJ1.h = f1;
    localJ1.a();
    i = this.xa;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            return;
          }
          this.w.d().a(localJ2, f1);
        }
        else
        {
          this.y.d().a(localJ2, f1);
        }
      }
      else {
        this.v.d().a(localJ2, f1);
      }
    }
    else {
      this.x.d().a(localJ2, f1);
    }
  }
  
  public boolean K()
  {
    return this.za;
  }
  
  public void a(int paramInt)
  {
    Object localObject = this.G;
    if (localObject == null) {
      return;
    }
    if (!((C)localObject).t(2)) {
      return;
    }
    paramInt = this.xa;
    J localJ;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3) {
            return;
          }
          localJ = this.y.d();
        }
        else
        {
          localJ = this.w.d();
        }
      }
      else {
        localJ = this.x.d();
      }
    }
    else {
      localJ = this.v.d();
    }
    localJ.b(5);
    paramInt = this.xa;
    if ((paramInt != 0) && (paramInt != 1))
    {
      this.v.d().a(null, 0.0F);
      this.x.d().a(null, 0.0F);
    }
    else
    {
      this.w.d().a(null, 0.0F);
      this.y.d().a(null, 0.0F);
    }
    this.ya.clear();
    for (paramInt = 0; paramInt < this.wa; paramInt++)
    {
      localObject = this.va[paramInt];
      if ((this.za) || (((B)localObject).a()))
      {
        int i = this.xa;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3) {
                localObject = null;
              } else {
                localObject = ((B)localObject).y.d();
              }
            }
            else {
              localObject = ((B)localObject).w.d();
            }
          }
          else {
            localObject = ((B)localObject).x.d();
          }
        }
        else {
          localObject = ((B)localObject).v.d();
        }
        if (localObject != null)
        {
          this.ya.add(localObject);
          ((L)localObject).a(localJ);
        }
      }
    }
  }
  
  public void a(p paramp)
  {
    Object localObject1 = this.D;
    localObject1[0] = this.v;
    localObject1[2] = this.w;
    localObject1[1] = this.x;
    localObject1[3] = this.y;
    for (int i = 0;; i++)
    {
      localObject1 = this.D;
      if (i >= localObject1.length) {
        break;
      }
      localObject1[i].j = paramp.a(localObject1[i]);
    }
    i = this.xa;
    if ((i >= 0) && (i < 4))
    {
      localObject1 = localObject1[i];
      Object localObject2;
      int j;
      for (i = 0; i < this.wa; i++)
      {
        localObject2 = this.va[i];
        if ((this.za) || (((B)localObject2).a()))
        {
          j = this.xa;
          if (((j == 0) || (j == 1)) && (((B)localObject2).j() == B.a.c)) {}
          do
          {
            bool = true;
            break;
            j = this.xa;
          } while (((j == 2) || (j == 3)) && (((B)localObject2).q() == B.a.c));
        }
      }
      boolean bool = false;
      i = this.xa;
      if ((i != 0) && (i != 1) ? k().q() == B.a.b : k().j() == B.a.b) {
        bool = false;
      }
      for (i = 0; i < this.wa; i++)
      {
        Object localObject3 = this.va[i];
        if ((this.za) || (((B)localObject3).a()))
        {
          localObject2 = paramp.a(localObject3.D[this.xa]);
          localObject3 = ((B)localObject3).D;
          j = this.xa;
          localObject3[j].j = ((t)localObject2);
          if ((j != 0) && (j != 2)) {
            paramp.a(((z)localObject1).j, (t)localObject2, bool);
          } else {
            paramp.b(((z)localObject1).j, (t)localObject2, bool);
          }
        }
      }
      i = this.xa;
      if (i == 0)
      {
        paramp.a(this.x.j, this.v.j, 0, 6);
        if (!bool) {
          paramp.a(this.v.j, this.G.x.j, 0, 5);
        }
      }
      else if (i == 1)
      {
        paramp.a(this.v.j, this.x.j, 0, 6);
        if (!bool) {
          paramp.a(this.v.j, this.G.v.j, 0, 5);
        }
      }
      else if (i == 2)
      {
        paramp.a(this.y.j, this.w.j, 0, 6);
        if (!bool) {
          paramp.a(this.w.j, this.G.y.j, 0, 5);
        }
      }
      else if (i == 3)
      {
        paramp.a(this.w.j, this.y.j, 0, 6);
        if (!bool) {
          paramp.a(this.w.j, this.G.w.j, 0, 5);
        }
      }
    }
  }
  
  public boolean a()
  {
    return true;
  }
  
  public void c(boolean paramBoolean)
  {
    this.za = paramBoolean;
  }
  
  public void t(int paramInt)
  {
    this.xa = paramInt;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */