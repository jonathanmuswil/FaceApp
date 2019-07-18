import java.util.ArrayList;

class w
{
  static void a(C paramC, p paramp, int paramInt)
  {
    int i = 0;
    int j;
    x[] arrayOfx;
    int k;
    if (paramInt == 0)
    {
      j = paramC.Da;
      arrayOfx = paramC.Ga;
      k = 0;
    }
    else
    {
      k = 2;
      j = paramC.Ea;
      arrayOfx = paramC.Fa;
    }
    while (i < j)
    {
      x localx = arrayOfx[i];
      localx.a();
      if (paramC.t(4))
      {
        if (!H.a(paramC, paramp, paramInt, k, localx)) {
          a(paramC, paramp, paramInt, k, localx);
        }
      }
      else {
        a(paramC, paramp, paramInt, k, localx);
      }
      i++;
    }
  }
  
  static void a(C paramC, p paramp, int paramInt1, int paramInt2, x paramx)
  {
    B localB1 = paramx.a;
    B localB2 = paramx.c;
    B localB3 = paramx.b;
    B localB4 = paramx.d;
    Object localObject1 = paramx.e;
    float f1 = paramx.k;
    Object localObject2 = paramx.f;
    localObject2 = paramx.g;
    int i;
    if (paramC.F[paramInt1] == B.a.b) {
      i = 1;
    } else {
      i = 0;
    }
    int k;
    if (paramInt1 == 0)
    {
      if (((B)localObject1).ma == 0) {
        j = 1;
      } else {
        j = 0;
      }
      if (((B)localObject1).ma == 1) {
        k = 1;
      } else {
        k = 0;
      }
      m = j;
      n = k;
      if (((B)localObject1).ma != 2) {
        break label202;
      }
    }
    else
    {
      if (((B)localObject1).na == 0) {
        j = 1;
      } else {
        j = 0;
      }
      if (((B)localObject1).na == 1) {
        k = 1;
      } else {
        k = 0;
      }
      m = j;
      n = k;
      if (((B)localObject1).na != 2) {
        break label202;
      }
    }
    int i1 = 1;
    int m = j;
    int n = k;
    break label205;
    label202:
    i1 = 0;
    label205:
    Object localObject3 = localB1;
    int j = 0;
    Object localObject4;
    Object localObject5;
    int i3;
    Object localObject6;
    for (;;)
    {
      localObject4 = null;
      if (j != 0) {
        break;
      }
      localObject2 = localObject3.D[paramInt2];
      if ((i == 0) && (i1 == 0)) {
        k = 4;
      } else {
        k = 1;
      }
      int i2 = ((z)localObject2).b();
      localObject5 = ((z)localObject2).d;
      i3 = i2;
      if (localObject5 != null)
      {
        i3 = i2;
        if (localObject3 != localB1) {
          i3 = i2 + ((z)localObject5).b();
        }
      }
      if ((i1 != 0) && (localObject3 != localB1) && (localObject3 != localB3)) {
        k = 6;
      } else if ((m != 0) && (i != 0)) {
        k = 4;
      }
      localObject5 = ((z)localObject2).d;
      if (localObject5 != null)
      {
        if (localObject3 == localB3) {
          paramp.b(((z)localObject2).j, ((z)localObject5).j, i3, 5);
        } else {
          paramp.b(((z)localObject2).j, ((z)localObject5).j, i3, 6);
        }
        paramp.a(((z)localObject2).j, ((z)localObject2).d.j, i3, k);
      }
      if (i != 0)
      {
        if ((((B)localObject3).r() != 8) && (localObject3.F[paramInt1] == B.a.c))
        {
          localObject2 = ((B)localObject3).D;
          paramp.b(localObject2[(paramInt2 + 1)].j, localObject2[paramInt2].j, 0, 5);
        }
        paramp.b(localObject3.D[paramInt2].j, paramC.D[paramInt2].j, 0, 6);
      }
      localObject5 = localObject3.D[(paramInt2 + 1)].d;
      localObject2 = localObject4;
      if (localObject5 != null)
      {
        localObject5 = ((z)localObject5).b;
        localObject6 = ((B)localObject5).D;
        localObject2 = localObject4;
        if (localObject6[paramInt2].d != null) {
          if (localObject6[paramInt2].d.b != localObject3) {
            localObject2 = localObject4;
          } else {
            localObject2 = localObject5;
          }
        }
      }
      if (localObject2 != null) {
        localObject3 = localObject2;
      } else {
        j = 1;
      }
    }
    if (localB4 != null)
    {
      localObject3 = localB2.D;
      j = paramInt2 + 1;
      if (localObject3[j].d != null)
      {
        localObject2 = localB4.D[j];
        paramp.c(((z)localObject2).j, localObject3[j].d.j, -((z)localObject2).b(), 5);
      }
    }
    if (i != 0)
    {
      paramC = paramC.D;
      j = paramInt2 + 1;
      paramC = paramC[j].j;
      localObject2 = localB2.D;
      paramp.b(paramC, localObject2[j].j, localObject2[j].b(), 6);
    }
    paramC = paramx.h;
    label902:
    t localt;
    if (paramC != null)
    {
      j = paramC.size();
      if (j > 1)
      {
        float f2;
        if ((paramx.n) && (!paramx.p)) {
          f2 = paramx.j;
        } else {
          f2 = f1;
        }
        localObject2 = null;
        k = 0;
        float f3 = 0.0F;
        while (k < j)
        {
          localObject3 = (B)paramC.get(k);
          f1 = localObject3.qa[paramInt1];
          if (f1 < 0.0F)
          {
            if (paramx.p)
            {
              localObject3 = ((B)localObject3).D;
              paramp.a(localObject3[(paramInt2 + 1)].j, localObject3[paramInt2].j, 0, 4);
              break label902;
            }
            f1 = 1.0F;
          }
          if (f1 == 0.0F)
          {
            localObject3 = ((B)localObject3).D;
            paramp.a(localObject3[(paramInt2 + 1)].j, localObject3[paramInt2].j, 0, 6);
          }
          else
          {
            if (localObject2 != null)
            {
              localObject4 = ((B)localObject2).D;
              localObject2 = localObject4[paramInt2].j;
              i = paramInt2 + 1;
              localObject4 = localObject4[i].j;
              localObject6 = ((B)localObject3).D;
              localObject5 = localObject6[paramInt2].j;
              localt = localObject6[i].j;
              localObject6 = paramp.b();
              ((m)localObject6).a(f3, f2, f1, (t)localObject2, (t)localObject4, (t)localObject5, localt);
              paramp.a((m)localObject6);
            }
            localObject2 = localObject3;
            f3 = f1;
          }
          k++;
        }
      }
    }
    if ((localB3 != null) && ((localB3 == localB4) || (i1 != 0)))
    {
      paramC = localB1.D;
      localObject2 = paramC[paramInt2];
      paramx = localB2.D;
      j = paramInt2 + 1;
      localObject3 = paramx[j];
      if (paramC[paramInt2].d != null) {
        paramC = paramC[paramInt2].d.j;
      } else {
        paramC = null;
      }
      paramx = localB2.D;
      if (paramx[j].d != null) {
        paramx = paramx[j].d.j;
      } else {
        paramx = null;
      }
      if (localB3 == localB4)
      {
        localObject3 = localB3.D;
        localObject2 = localObject3[paramInt2];
        localObject3 = localObject3[j];
      }
      if ((paramC != null) && (paramx != null))
      {
        if (paramInt1 == 0) {
          f1 = ((B)localObject1).aa;
        } else {
          f1 = ((B)localObject1).ba;
        }
        j = ((z)localObject2).b();
        paramInt1 = ((z)localObject3).b();
        paramp.a(((z)localObject2).j, paramC, j, f1, paramx, ((z)localObject3).j, paramInt1, 5);
      }
    }
    else
    {
      if ((m != 0) && (localB3 != null))
      {
        j = paramx.j;
        if ((j > 0) && (paramx.i == j)) {
          i = 1;
        } else {
          i = 0;
        }
        paramx = localB3;
        localObject3 = paramx;
      }
      while (paramx != null)
      {
        for (localObject2 = paramx.sa[paramInt1]; (localObject2 != null) && (((B)localObject2).r() == 8); localObject2 = localObject2.sa[paramInt1]) {}
        if ((localObject2 == null) && (paramx != localB4)) {}
        for (;;)
        {
          break;
          localObject4 = paramx.D[paramInt2];
          localt = ((z)localObject4).j;
          paramC = ((z)localObject4).d;
          if (paramC != null) {
            localObject1 = paramC.j;
          } else {
            localObject1 = null;
          }
          if (localObject3 != paramx)
          {
            paramC = localObject3.D[(paramInt2 + 1)].j;
          }
          else
          {
            paramC = (C)localObject1;
            if (paramx == localB3)
            {
              paramC = (C)localObject1;
              if (localObject3 == paramx)
              {
                paramC = localB1.D;
                if (paramC[paramInt2].d != null) {
                  paramC = paramC[paramInt2].d.j;
                } else {
                  paramC = null;
                }
              }
            }
          }
          i1 = ((z)localObject4).b();
          localObject1 = paramx.D;
          i3 = paramInt2 + 1;
          k = localObject1[i3].b();
          if (localObject2 != null)
          {
            localObject1 = localObject2.D[paramInt2];
            localObject5 = ((z)localObject1).j;
            localObject4 = paramx.D[i3].j;
          }
          else
          {
            localObject6 = localB2.D[i3].d;
            if (localObject6 != null) {
              localObject1 = ((z)localObject6).j;
            } else {
              localObject1 = null;
            }
            localObject4 = paramx.D[i3].j;
            localObject5 = localObject1;
            localObject1 = localObject6;
          }
          j = k;
          if (localObject1 != null) {
            j = k + ((z)localObject1).b();
          }
          k = i1;
          if (localObject3 != null) {
            k = i1 + localObject3.D[i3].b();
          }
          if ((localt != null) && (paramC != null) && (localObject5 != null) && (localObject4 != null))
          {
            if (paramx == localB3) {
              k = localB3.D[paramInt2].b();
            }
            if (paramx == localB4) {
              j = localB4.D[i3].b();
            }
            if (i != 0) {
              i1 = 6;
            } else {
              i1 = 4;
            }
            paramp.a(localt, paramC, k, 0.5F, (t)localObject5, (t)localObject4, j, i1);
          }
        }
        if (paramx.r() != 8) {
          localObject3 = paramx;
        }
        paramx = (x)localObject2;
        continue;
        if ((n != 0) && (localB3 != null))
        {
          j = paramx.j;
          if ((j > 0) && (paramx.i == j)) {
            j = 1;
          } else {
            j = 0;
          }
          localObject2 = localB3;
          paramx = (x)localObject2;
          while (localObject2 != null)
          {
            for (paramC = localObject2.sa[paramInt1]; (paramC != null) && (paramC.r() == 8); paramC = paramC.sa[paramInt1]) {}
            if ((localObject2 != localB3) && (localObject2 != localB4) && (paramC != null))
            {
              if (paramC == localB4) {
                paramC = null;
              }
              localObject1 = localObject2.D[paramInt2];
              localObject6 = ((z)localObject1).j;
              localObject3 = ((z)localObject1).d;
              if (localObject3 != null) {
                localObject3 = ((z)localObject3).j;
              }
              localObject3 = paramx.D;
              i3 = paramInt2 + 1;
              localt = localObject3[i3].j;
              i1 = ((z)localObject1).b();
              i = localObject2.D[i3].b();
              if (paramC != null)
              {
                localObject3 = paramC.D[paramInt2];
                localObject4 = ((z)localObject3).j;
                localObject1 = ((z)localObject3).d;
                if (localObject1 != null) {
                  localObject1 = ((z)localObject1).j;
                } else {
                  localObject1 = null;
                }
              }
              else
              {
                localObject5 = localObject2.D[i3].d;
                if (localObject5 != null) {
                  localObject3 = ((z)localObject5).j;
                } else {
                  localObject3 = null;
                }
                localObject1 = localObject2.D[i3].j;
                localObject4 = localObject3;
                localObject3 = localObject5;
              }
              k = i;
              if (localObject3 != null) {
                k = i + ((z)localObject3).b();
              }
              i = i1;
              if (paramx != null) {
                i = i1 + paramx.D[i3].b();
              }
              if (j != 0) {
                i1 = 6;
              } else {
                i1 = 4;
              }
              if ((localObject6 != null) && (localt != null) && (localObject4 != null) && (localObject1 != null)) {
                paramp.a((t)localObject6, localt, i, 0.5F, (t)localObject4, (t)localObject1, k, i1);
              }
            }
            if (((B)localObject2).r() == 8) {
              localObject2 = paramx;
            }
            paramx = (x)localObject2;
            localObject2 = paramC;
          }
          paramC = localB3.D[paramInt2];
          paramx = localB1.D[paramInt2].d;
          localObject2 = localB4.D;
          paramInt1 = paramInt2 + 1;
          localObject1 = localObject2[paramInt1];
          localObject2 = localB2.D[paramInt1].d;
          if (paramx != null) {
            if (localB3 != localB4) {
              paramp.a(paramC.j, paramx.j, paramC.b(), 5);
            } else if (localObject2 != null) {
              paramp.a(paramC.j, paramx.j, paramC.b(), 0.5F, ((z)localObject1).j, ((z)localObject2).j, ((z)localObject1).b(), 5);
            }
          }
          if ((localObject2 != null) && (localB3 != localB4)) {
            paramp.a(((z)localObject1).j, ((z)localObject2).j, -((z)localObject1).b(), 5);
          }
        }
      }
    }
    if (((m != 0) || (n != 0)) && (localB3 != null))
    {
      localObject2 = localB3.D[paramInt2];
      paramC = localB4.D;
      paramInt1 = paramInt2 + 1;
      localObject1 = paramC[paramInt1];
      paramC = ((z)localObject2).d;
      if (paramC != null) {
        paramx = paramC.j;
      } else {
        paramx = null;
      }
      paramC = ((z)localObject1).d;
      if (paramC != null) {
        paramC = paramC.j;
      } else {
        paramC = null;
      }
      if (localB2 != localB4)
      {
        paramC = localB2.D[paramInt1].d;
        if (paramC != null) {
          paramC = paramC.j;
        } else {
          paramC = null;
        }
      }
      if (localB3 == localB4)
      {
        localObject1 = localB3.D;
        localObject2 = localObject1[paramInt2];
        localObject1 = localObject1[paramInt1];
      }
      if ((paramx != null) && (paramC != null))
      {
        paramInt2 = ((z)localObject2).b();
        if (localB4 == null) {
          localObject3 = localB2;
        } else {
          localObject3 = localB4;
        }
        paramInt1 = localObject3.D[paramInt1].b();
        paramp.a(((z)localObject2).j, paramx, paramInt2, 0.5F, paramC, ((z)localObject1).j, paramInt1, 5);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */