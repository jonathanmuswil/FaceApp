final class sga<T>
  implements ARa<uia>
{
  sga(oga paramoga, uXa paramuXa1, uXa paramuXa2, uXa paramuXa3, uXa paramuXa4, uXa paramuXa5) {}
  
  public final void a(uia paramuia)
  {
    if (paramuia.d())
    {
      Object localObject1 = this.a;
      oXa.a(paramuia, "it");
      oga.a((oga)localObject1, paramuia);
      paramuia = this.a;
      localObject1 = this.b.a;
      if (localObject1 != null)
      {
        localObject1 = (Fka)localObject1;
        Object localObject2 = this.c.a;
        if (localObject2 != null)
        {
          localObject2 = (String)localObject2;
          Object localObject3 = this.d.a;
          if (localObject3 != null)
          {
            localObject3 = (String)localObject3;
            Object localObject4 = this.e.a;
            if (localObject4 != null)
            {
              String str = (String)localObject4;
              localObject4 = this.f.a;
              if (localObject4 != null)
              {
                paramuia.b(new oga.a((Fka)localObject1, (String)localObject2, (String)localObject3, str, (String)localObject4));
              }
              else
              {
                oXa.b("hairMaskToken");
                throw null;
              }
            }
            else
            {
              oXa.b("facePointsToken");
              throw null;
            }
          }
          else
          {
            oXa.b("triMapToken");
            throw null;
          }
        }
        else
        {
          oXa.b("depthToken");
          throw null;
        }
      }
      else
      {
        oXa.b("imageRegion");
        throw null;
      }
    }
    else
    {
      this.a.a(new tia(paramuia.b(), paramuia.c()));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */