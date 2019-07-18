import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class u
{
  private static int a(B paramB)
  {
    float f;
    int i;
    if (paramB.j() == B.a.c)
    {
      if (paramB.K == 0) {
        f = paramB.i() * paramB.J;
      } else {
        f = paramB.i() / paramB.J;
      }
      i = (int)f;
      paramB.o(i);
    }
    else if (paramB.q() == B.a.c)
    {
      if (paramB.K == 1) {
        f = paramB.s() * paramB.J;
      } else {
        f = paramB.s() / paramB.J;
      }
      i = (int)f;
      paramB.g(i);
    }
    else
    {
      i = -1;
    }
    return i;
  }
  
  private static int a(B paramB, int paramInt)
  {
    int i = paramInt * 2;
    Object localObject1 = paramB.D;
    Object localObject2 = localObject1[i];
    localObject1 = localObject1[(i + 1)];
    Object localObject3 = ((z)localObject2).d;
    if (localObject3 != null)
    {
      Object localObject4 = ((z)localObject3).b;
      localObject3 = paramB.G;
      if (localObject4 == localObject3)
      {
        localObject4 = ((z)localObject1).d;
        if ((localObject4 != null) && (((z)localObject4).b == localObject3))
        {
          i = ((B)localObject3).d(paramInt);
          float f;
          if (paramInt == 0) {
            f = paramB.aa;
          } else {
            f = paramB.ba;
          }
          paramInt = paramB.d(paramInt);
          return (int)((i - ((z)localObject2).b() - ((z)localObject1).b() - paramInt) * f);
        }
      }
    }
    return 0;
  }
  
  private static int a(B paramB, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    boolean bool = paramB.ja;
    int i = 0;
    if (!bool) {
      return 0;
    }
    int j;
    if ((paramB.z.d != null) && (paramInt1 == 1)) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    int n;
    int i1;
    if (paramBoolean)
    {
      k = paramB.c();
      m = paramB.i() - paramB.c();
      n = paramInt1 * 2;
      i1 = n + 1;
    }
    else
    {
      k = paramB.i() - paramB.c();
      m = paramB.c();
      i1 = paramInt1 * 2;
      n = i1 + 1;
    }
    Object localObject1 = paramB.D;
    int i3;
    if ((localObject1[i1].d != null) && (localObject1[n].d == null))
    {
      i2 = n;
      i3 = -1;
      n = i1;
      i1 = i2;
    }
    else
    {
      i3 = 1;
    }
    if (j != 0) {
      paramInt2 -= k;
    }
    int i4 = paramB.D[n].b() * i3 + a(paramB, paramInt1);
    int i2 = paramInt2 + i4;
    if (paramInt1 == 0) {
      paramInt2 = paramB.s();
    } else {
      paramInt2 = paramB.i();
    }
    int i5 = paramInt2 * i3;
    localObject1 = paramB.D[n].d().a.iterator();
    for (paramInt2 = i; ((Iterator)localObject1).hasNext(); paramInt2 = Math.max(paramInt2, a(((J)((Iterator)localObject1).next()).c.b, paramInt1, paramBoolean, i2))) {}
    localObject1 = paramB.D[i1].d().a.iterator();
    for (i = 0; ((Iterator)localObject1).hasNext(); i = Math.max(i, a(((J)((Iterator)localObject1).next()).c.b, paramInt1, paramBoolean, i5 + i2))) {}
    int i6;
    if (j != 0)
    {
      i6 = paramInt2 - k;
      i += m;
    }
    for (;;)
    {
      break;
      if (paramInt1 == 0) {
        i6 = paramB.s();
      } else {
        i6 = paramB.i();
      }
      i += i6 * i3;
      i6 = paramInt2;
    }
    Object localObject2;
    if (paramInt1 == 1)
    {
      localObject1 = paramB.z.d().a.iterator();
      paramInt2 = 0;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (J)((Iterator)localObject1).next();
        if (i3 == 1) {
          paramInt2 = Math.max(paramInt2, a(((J)localObject2).c.b, paramInt1, paramBoolean, k + i2));
        } else {
          paramInt2 = Math.max(paramInt2, a(((J)localObject2).c.b, paramInt1, paramBoolean, m * i3 + i2));
        }
      }
      if ((paramB.z.d().a.size() > 0) && (j == 0)) {
        if (i3 == 1) {
          paramInt2 += k;
        } else {
          paramInt2 -= m;
        }
      }
    }
    else
    {
      paramInt2 = 0;
    }
    int m = Math.max(i6, Math.max(i, paramInt2));
    paramInt2 = i2 + i5;
    if (i3 == -1)
    {
      j = i2;
    }
    else
    {
      j = paramInt2;
      paramInt2 = i2;
    }
    if (paramBoolean)
    {
      H.a(paramB, paramInt1, paramInt2);
      paramB.a(paramInt2, j, paramInt1);
    }
    else
    {
      paramB.s.a(paramB, paramInt1);
      paramB.d(paramInt2, paramInt1);
    }
    if ((paramB.c(paramInt1) == B.a.c) && (paramB.J != 0.0F)) {
      paramB.s.a(paramB, paramInt1);
    }
    localObject1 = paramB.D;
    if ((localObject1[n].d != null) && (localObject1[i1].d != null))
    {
      localObject1 = paramB.k();
      localObject2 = paramB.D;
      if ((localObject2[n].d.b == localObject1) && (localObject2[i1].d.b == localObject1)) {
        paramB.s.a(paramB, paramInt1);
      }
    }
    return i4 + m;
  }
  
  private static int a(D paramD, int paramInt)
  {
    int i = paramInt * 2;
    List localList = paramD.a(paramInt);
    int j = localList.size();
    int k = 0;
    int m = 0;
    while (k < j)
    {
      B localB = (B)localList.get(k);
      z[] arrayOfz = localB.D;
      int n = i + 1;
      boolean bool;
      if ((arrayOfz[n].d != null) && ((arrayOfz[i].d == null) || (arrayOfz[n].d == null))) {
        bool = false;
      } else {
        bool = true;
      }
      m = Math.max(m, a(localB, paramInt, bool, 0));
      k++;
    }
    paramD.e[paramInt] = m;
    return m;
  }
  
  private static void a(B paramB, int paramInt1, int paramInt2)
  {
    int i = paramInt1 * 2;
    Object localObject1 = paramB.D;
    Object localObject2 = localObject1[i];
    localObject1 = localObject1[(i + 1)];
    if ((((z)localObject2).d != null) && (((z)localObject1).d != null)) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      H.a(paramB, paramInt1, a(paramB, paramInt1) + ((z)localObject2).b());
      return;
    }
    if ((paramB.J != 0.0F) && (paramB.c(paramInt1) == B.a.c))
    {
      paramInt2 = a(paramB);
      j = (int)paramB.D[i].d().h;
      ((z)localObject1).d().g = ((z)localObject2).d();
      ((z)localObject1).d().h = paramInt2;
      ((z)localObject1).d().b = 1;
      paramB.a(j, j + paramInt2, paramInt1);
      return;
    }
    int j = paramInt2 - paramB.e(paramInt1);
    paramInt2 = j - paramB.d(paramInt1);
    paramB.a(paramInt2, j, paramInt1);
    H.a(paramB, paramInt1, paramInt2);
  }
  
  public static void a(C paramC)
  {
    if ((paramC.M() & 0x20) != 32)
    {
      b(paramC);
      return;
    }
    paramC.Oa = true;
    paramC.Ia = false;
    paramC.Ja = false;
    paramC.Ka = false;
    Object localObject1 = paramC.va;
    List localList = paramC.Ha;
    int i;
    if (paramC.j() == B.a.b) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (paramC.q() == B.a.b) {
      j = 1;
    } else {
      j = 0;
    }
    boolean bool;
    if ((i == 0) && (j == 0)) {
      bool = false;
    } else {
      bool = true;
    }
    localList.clear();
    Object localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      B localB = (B)((Iterator)localObject2).next();
      localB.s = null;
      localB.la = false;
      localB.F();
    }
    localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (B)((Iterator)localObject2).next();
      if ((((B)localObject1).s == null) && (!a((B)localObject1, localList, bool)))
      {
        b(paramC);
        paramC.Oa = false;
        return;
      }
    }
    localObject1 = localList.iterator();
    int k = 0;
    for (int m = 0; ((Iterator)localObject1).hasNext(); m = Math.max(m, a((D)localObject2, 1)))
    {
      localObject2 = (D)((Iterator)localObject1).next();
      k = Math.max(k, a((D)localObject2, 0));
    }
    if (i != 0)
    {
      paramC.a(B.a.a);
      paramC.o(k);
      paramC.Ia = true;
      paramC.Ja = true;
      paramC.La = k;
    }
    if (j != 0)
    {
      paramC.b(B.a.a);
      paramC.g(m);
      paramC.Ia = true;
      paramC.Ka = true;
      paramC.Ma = m;
    }
    a(localList, 0, paramC.s());
    a(localList, 1, paramC.i());
  }
  
  private static void a(C paramC, B paramB, D paramD)
  {
    paramD.d = false;
    paramC.Oa = false;
    paramB.ja = false;
  }
  
  public static void a(List<D> paramList, int paramInt1, int paramInt2)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      Iterator localIterator = ((D)paramList.get(j)).b(paramInt1).iterator();
      while (localIterator.hasNext())
      {
        B localB = (B)localIterator.next();
        if (localB.ja) {
          a(localB, paramInt1, paramInt2);
        }
      }
    }
  }
  
  private static void a(z paramz)
  {
    J localJ = paramz.d();
    z localz = paramz.d;
    if ((localz != null) && (localz.d != paramz)) {
      localz.d().a(localJ);
    }
  }
  
  private static boolean a(B paramB, D paramD, List<D> paramList, boolean paramBoolean)
  {
    if (paramB == null) {
      return true;
    }
    paramB.ka = false;
    C localC = (C)paramB.k();
    Object localObject1 = paramB.s;
    if (localObject1 == null)
    {
      paramB.ja = true;
      paramD.a.add(paramB);
      paramB.s = paramD;
      if ((paramB.v.d == null) && (paramB.x.d == null) && (paramB.w.d == null) && (paramB.y.d == null) && (paramB.z.d == null) && (paramB.C.d == null))
      {
        a(localC, paramB, paramD);
        if (paramBoolean) {
          return false;
        }
      }
      if ((paramB.w.d != null) && (paramB.y.d != null))
      {
        localC.q();
        localObject1 = B.a.b;
        if (paramBoolean)
        {
          a(localC, paramB, paramD);
          return false;
        }
        if ((paramB.w.d.b != paramB.k()) || (paramB.y.d.b != paramB.k())) {
          a(localC, paramB, paramD);
        }
      }
      if ((paramB.v.d != null) && (paramB.x.d != null))
      {
        localC.j();
        localObject1 = B.a.b;
        if (paramBoolean)
        {
          a(localC, paramB, paramD);
          return false;
        }
        if ((paramB.v.d.b != paramB.k()) || (paramB.x.d.b != paramB.k())) {
          a(localC, paramB, paramD);
        }
      }
      if (paramB.j() == B.a.c) {
        i = 1;
      } else {
        i = 0;
      }
      if (paramB.q() == B.a.c) {
        j = 1;
      } else {
        j = 0;
      }
      if (((i ^ j) != 0) && (paramB.J != 0.0F))
      {
        a(paramB);
      }
      else if ((paramB.j() == B.a.c) || (paramB.q() == B.a.c))
      {
        a(localC, paramB, paramD);
        if (paramBoolean) {
          return false;
        }
      }
      Object localObject2;
      if ((paramB.v.d != null) || (paramB.x.d != null))
      {
        localObject1 = paramB.v.d;
        if ((localObject1 == null) || (((z)localObject1).b != paramB.G) || (paramB.x.d != null))
        {
          localObject1 = paramB.x.d;
          if ((localObject1 == null) || (((z)localObject1).b != paramB.G) || (paramB.v.d != null))
          {
            localObject1 = paramB.v.d;
            if (localObject1 == null) {
              break label576;
            }
            localObject2 = ((z)localObject1).b;
            localObject1 = paramB.G;
            if (localObject2 != localObject1) {
              break label576;
            }
            localObject2 = paramB.x.d;
            if ((localObject2 == null) || (((z)localObject2).b != localObject1)) {
              break label576;
            }
          }
        }
      }
      if ((paramB.C.d == null) && (!(paramB instanceof F)) && (!(paramB instanceof G))) {
        paramD.f.add(paramB);
      }
      label576:
      if ((paramB.w.d != null) || (paramB.y.d != null))
      {
        localObject1 = paramB.w.d;
        if ((localObject1 == null) || (((z)localObject1).b != paramB.G) || (paramB.y.d != null))
        {
          localObject1 = paramB.y.d;
          if ((localObject1 == null) || (((z)localObject1).b != paramB.G) || (paramB.w.d != null))
          {
            localObject1 = paramB.w.d;
            if (localObject1 == null) {
              break label771;
            }
            localObject2 = ((z)localObject1).b;
            localObject1 = paramB.G;
            if (localObject2 != localObject1) {
              break label771;
            }
            localObject2 = paramB.y.d;
            if ((localObject2 == null) || (((z)localObject2).b != localObject1)) {
              break label771;
            }
          }
        }
      }
      if ((paramB.C.d == null) && (paramB.z.d == null) && (!(paramB instanceof F)) && (!(paramB instanceof G))) {
        paramD.g.add(paramB);
      }
      label771:
      if ((paramB instanceof G))
      {
        a(localC, paramB, paramD);
        if (paramBoolean) {
          return false;
        }
        localObject1 = (G)paramB;
        for (i = 0; i < ((G)localObject1).wa; i++) {
          if (!a(localObject1.va[i], paramD, paramList, paramBoolean)) {
            return false;
          }
        }
      }
      int j = paramB.D.length;
      for (int i = 0; i < j; i++)
      {
        localObject2 = paramB.D[i];
        localObject1 = ((z)localObject2).d;
        if ((localObject1 != null) && (((z)localObject1).b != paramB.k()))
        {
          if (((z)localObject2).c == z.c.g)
          {
            a(localC, paramB, paramD);
            if (paramBoolean) {
              return false;
            }
          }
          else
          {
            a((z)localObject2);
          }
          if (!a(((z)localObject2).d.b, paramD, paramList, paramBoolean)) {
            return false;
          }
        }
      }
      return true;
    }
    if (localObject1 != paramD)
    {
      paramD.a.addAll(((D)localObject1).a);
      paramD.f.addAll(paramB.s.f);
      paramD.g.addAll(paramB.s.g);
      if (!paramB.s.d) {
        paramD.d = false;
      }
      paramList.remove(paramB.s);
      paramB = paramB.s.a.iterator();
      while (paramB.hasNext()) {
        ((B)paramB.next()).s = paramD;
      }
    }
    return true;
  }
  
  private static boolean a(B paramB, List<D> paramList, boolean paramBoolean)
  {
    D localD = new D(new ArrayList(), true);
    paramList.add(localD);
    return a(paramB, localD, paramList, paramBoolean);
  }
  
  private static void b(C paramC)
  {
    paramC.Ha.clear();
    paramC.Ha.add(0, new D(paramC.va));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */